package danliu.fast.image.picker;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.io.File;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private static final String IMAGE_FOLDER = "/sdcard/avatar";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final TextView button = new TextView(this);
        button.setText("试试");
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                handleIntent(getIntent());
            }
        });
        setContentView(button);
        handleIntent(getIntent());
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        handleIntent(intent);
    }

    private void handleIntent(Intent intent) {
        final Bitmap src = BitmapFactory.decode
//        final File folder = new File(IMAGE_FOLDER);
//        if (!folder.exists()) {
//            throw new IllegalStateException("avatar folder is empty!");
//        }
//        final String[] images = folder.list();
//        final String image = images[new Random().nextInt(images.length)];
//        final File imageFile = new File(folder, image);
//        final Uri uri = Uri.fromFile(imageFile);
//        final Intent data = new Intent();
//        data.setData(uri);
//        setResult(RESULT_OK, data);
//        finish();
    }
}
