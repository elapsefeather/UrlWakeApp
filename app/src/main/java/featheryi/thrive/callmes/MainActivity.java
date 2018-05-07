package featheryi.thrive.callmes;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView hello;
    Intent intent;
    Uri uri;
    String mes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        intent = getIntent();
        uri = intent.getData();
        hello = (TextView) findViewById(R.id.hello);

        if (uri != null) {
            mes = uri.getQueryParameter("mes");
//            mes = uri.getQuery();
            hello.setText(mes);
        }
        /*
        *
        *   必須使用頁面測試開啟
        *   不能瀏覽器直接輸入 url 開啟測試
        *   不能使用 android:launchMode="singleTask"
        *   否則資料傳遞不會更新資訊
        *   <a href="myapp://m.com.jk?mes=messssss">test</a>
        *
        */


    }
}
