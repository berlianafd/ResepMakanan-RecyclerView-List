package com.berlianafd.resepmakanan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ProfilActivity extends Activity {
    Dialog myDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil);
        myDialog = new Dialog(this);
        ImageView pp = (ImageView) findViewById(R.id.potoprofil);

        pp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myDialog.setContentView(R.layout.popup_foto);

                ImageView img = (ImageView) myDialog.findViewById(R.id.potoview);

                Resources res = getResources();
                Drawable drawable = ResourcesCompat.getDrawable(res, R.drawable.user, null);

                img.setImageDrawable(drawable);

                myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                myDialog.show();
            }
        });
    }

    public void BackHome(View view) {
        Intent intent = new Intent(ProfilActivity.this, MainActivity.class);
        startActivity(intent);
    }
}
