package nju.androidchat.client.component;

import android.app.AlertDialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.StyleableRes;

import java.util.UUID;

import nju.androidchat.client.R;

import com.bumptech.glide.Glide;
import java.net.HttpURLConnection;
import java.net.URL;

public class ItemTextReceive extends LinearLayout {


    @StyleableRes
    int index0 = 0;

    private TextView textView;
    private Context context;
    private UUID messageId;
    private OnRecallMessageRequested onRecallMessageRequested;
    private ItemTextReceive imageView;
    private String imgURL;


    public ItemTextReceive(Context context, String text, UUID messageId) {
        super(context);
        this.context = context;
        inflate(context, R.layout.item_text_receive, this);
        this.textView = findViewById(R.id.chat_item_content_text);
        this.messageId = messageId;
        setText(text);
    }
    public String getImgURLURL() {
        return this.imgURL;
    }

    public void setImgURL(String imgURL) {
        this.imgURL = imgURL;
        setURLimage(imgURL);
    }
    public void setURLimage(String url) {
        Glide.with(context).load(url).into(this.imageView);
    }
    public void init(Context context) {

    }

    public String getText() {
        return textView.getText().toString();
    }

    public void setText(String text) {
        textView.setText(text);
    }
}
