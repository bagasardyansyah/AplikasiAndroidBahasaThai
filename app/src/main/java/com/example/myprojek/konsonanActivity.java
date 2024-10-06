package com.example.myprojek;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
public class konsonanActivity extends AppCompatActivity {
    LinearLayout kerbau, orang, lonceng, ular, gajah, rantai, pohon, perempuan, mandodari, priatua, biksumuda, tentara, bendera, tikus, nampan, gigi,
            kapallayar, kuda, raksasa, perahu, monyet, cincin, layangan, burunghantu, ayam, piring, mahkota, tombak, anak, kurakura, daun, ikan, bak,
            telur, botol, simbalkecil, pedestal, tas, lebah, penutup, pavilium, pertapa, harimau, peti;
    Dialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_konsonan);
        dialog = new Dialog(konsonanActivity.this);
        getSupportActionBar().setTitle("Konsonan");
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.purple_700)));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        kerbau = findViewById(R.id.Kerbau);
        orang = findViewById(R.id.Orang);
        lonceng = findViewById(R.id.Lonceng);
        ular = findViewById(R.id.Ular);
        gajah = findViewById(R.id.Gajah);
        rantai = findViewById(R.id.Rantai);
        pohon = findViewById(R.id.Pohon);
        perempuan = findViewById(R.id.Perempuan);
        mandodari = findViewById(R.id.Mandodari);
        priatua = findViewById(R.id.Priatua);
        biksumuda = findViewById(R.id.Biksumuda);
        tentara = findViewById(R.id.Tentara);
        bendera = findViewById(R.id.Bendera);
        tikus = findViewById(R.id.Tikus);
        nampan = findViewById(R.id.Nampan);
        gigi = findViewById(R.id.Gigi);
        kapallayar = findViewById(R.id.Kapallayar);
        kuda = findViewById(R.id.Kuda);
        raksasa = findViewById(R.id.Raksasa);
        perahu = findViewById(R.id.Perahu);
        monyet = findViewById(R.id.Monyet);
        cincin = findViewById(R.id.Cincin);
        layangan = findViewById(R.id.Layangan);
        burunghantu = findViewById(R.id.Burunghantu);
        ayam = findViewById(R.id.Ayam);
        piring = findViewById(R.id.Piring);
        mahkota = findViewById(R.id.Mahkota);
        tombak = findViewById(R.id.Tombak);
        anak = findViewById(R.id.Anak);
        kurakura = findViewById(R.id.Kurakura);
        daun = findViewById(R.id.Daun);
        ikan = findViewById(R.id.Ikan);
        bak = findViewById(R.id.Bak);
        telur = findViewById(R.id.Telur);
        botol = findViewById(R.id.Botol);
        simbalkecil = findViewById(R.id.Simbalkecil);
        pedestal = findViewById(R.id.Pedestal);
        tas = findViewById(R.id.Tas);
        lebah = findViewById(R.id.Lebah);
        penutup = findViewById(R.id.Penutup);
        pavilium = findViewById(R.id.Pavilium);
        pertapa = findViewById(R.id.Pertapa);
        harimau = findViewById(R.id.Harimau);
        peti = findViewById(R.id.Peti);

        kerbau.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog("KERBAU");
            }
        });
        orang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog("Orang");
            }
        });
        lonceng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog("Lonceng");
            }
        });
        ular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog("Ular");
            }
        });
        gajah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog("Gajah");
            }
        });
        rantai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog("Rantai");
            }
        });
        pohon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog("Pohon");
            }
        });
        perempuan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog("Perempuan");
            }
        });
        mandodari.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog("Mandodari");
            }
        });
        priatua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog("Priatua");
            }
        });
        biksumuda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog("Biksumuda");
            }
        });
        tentara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog("Tentara");
            }
        });
        bendera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog("Bendera");
            }
        });
        tikus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog("Tikus");
            }
        });
        nampan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog("Nampan");
            }
        });
        gigi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog("Gigi");
            }
        });
        kapallayar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog("Kapallayar");
            }
        });
        kuda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog("Kuda");
            }
        });
        raksasa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog("Raksasa");
            }
        });
        perahu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog("Perahu");
            }
        });
        monyet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog("Monyet");
            }
        });
        cincin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog("Cincin");
            }
        });
        layangan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog("Layangan");
            }
        });
        burunghantu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog("Burunghantu");
            }
        });
        ayam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog("Ayam");
            }
        });
        piring.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog("Piring");
            }
        });
        mahkota.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog("Mahkota");
            }
        });
        tombak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog("Tombak");
            }
        });
        anak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog("Anak");
            }
        });
        kurakura.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { showDialog("Kurakura");
            }
        });
        daun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog("Daun");
            }
        });
        ikan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog("Ikan");
            }
        });
        bak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog("Bak");
            }
        });
        telur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog("Telur");
            }
        });
        botol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog("Botol");
            }
        });
        simbalkecil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog("Simbalkecil");
            }
        });
        pedestal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog("Pedestal");
            }
        });
        tas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog("Tas");
            }
        });
        lebah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog("Lebah");
            }
        });
        penutup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog("Penutup");
            }
        });
        pavilium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog("Pavilium");
            }
        });
        pertapa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog("Pertapa");
            }
        });
        harimau.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog("Harimau");
            }
        });
        peti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog("Peti");
            }
        });
    }

    private void showDialog(String yes) {
        ImageView image, sound;
        MediaPlayer mediaPlayer;

        dialog = new Dialog(konsonanActivity.this);
        dialog.setContentView(R.layout.aksarapopup);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        image = dialog.findViewById(R.id.images);
        sound = dialog.findViewById(R.id.sounds);

        if (yes.equals("KERBAU")) {
            image.setImageResource(R.drawable.kerbau);
            mediaPlayer = MediaPlayer.create(this, R.raw.kerbau);
            sound.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mediaPlayer.start();
                }
            });
        } else if (yes.equals("Orang")) {
            image.setImageResource(R.drawable.orang);
            mediaPlayer = MediaPlayer.create(this, R.raw.orang);
            sound.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mediaPlayer.start();
                }
            });
        } else if (yes.equals("Lonceng")) {
            image.setImageResource(R.drawable.lonceng);
            mediaPlayer = MediaPlayer.create(this, R.raw.lonceng);
            sound.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mediaPlayer.start();
                }
            });
        } else if (yes.equals("Ular")) {
            image.setImageResource(R.drawable.ular);
            mediaPlayer = MediaPlayer.create(this, R.raw.ular);
            sound.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mediaPlayer.start();
                }
            });
        } else if (yes.equals("Gajah")) {
            image.setImageResource(R.drawable.gajah);
            mediaPlayer = MediaPlayer.create(this, R.raw.gajah);
            sound.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mediaPlayer.start();
                }
            });
        } else if (yes.equals("Rantai")) {
            image.setImageResource(R.drawable.rantai);
            mediaPlayer = MediaPlayer.create(this, R.raw.rantai);
            sound.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mediaPlayer.start();
                }
            });
        } else if (yes.equals("Pohon")) {
            image.setImageResource(R.drawable.pohon);
            mediaPlayer = MediaPlayer.create(this, R.raw.pohon);
            sound.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mediaPlayer.start();
                }
            });
        } else if (yes.equals("Perempuan")) {
            image.setImageResource(R.drawable.perempuan);
            mediaPlayer = MediaPlayer.create(this, R.raw.perempuan);
            sound.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mediaPlayer.start();
                }
            });
        } else if (yes.equals("Mandodari")) {
            image.setImageResource(R.drawable.mandodari);
            mediaPlayer = MediaPlayer.create(this, R.raw.mandodari);
            sound.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mediaPlayer.start();
                }
            });
        } else if (yes.equals("Priatua")) {
            image.setImageResource(R.drawable.priatua);
            mediaPlayer = MediaPlayer.create(this, R.raw.priatua);
            sound.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mediaPlayer.start();
                }
            });
        } else if (yes.equals("Biksumuda")) {
            image.setImageResource(R.drawable.biksumuda);
            mediaPlayer = MediaPlayer.create(this, R.raw.biksumuda);
            sound.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mediaPlayer.start();
                }
            });
        } else if (yes.equals("Tentara")) {
            image.setImageResource(R.drawable.tentara);
            mediaPlayer = MediaPlayer.create(this, R.raw.tentara);
            sound.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mediaPlayer.start();
                }
            });
        } else if (yes.equals("Bendera")) {
            image.setImageResource(R.drawable.bendera);
            mediaPlayer = MediaPlayer.create(this, R.raw.bendera);
            sound.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mediaPlayer.start();
                }
            });
        } else if (yes.equals("Tikus")) {
            image.setImageResource(R.drawable.tikus);
            mediaPlayer = MediaPlayer.create(this, R.raw.tikus);
            sound.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mediaPlayer.start();
                }
            });
        } else if (yes.equals("Nampan")) {
            image.setImageResource(R.drawable.nampan);
            mediaPlayer = MediaPlayer.create(this, R.raw.nampan);
            sound.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mediaPlayer.start();
                }
            });
        } else if (yes.equals("Gigi")) {
            image.setImageResource(R.drawable.gigi);
            mediaPlayer = MediaPlayer.create(this, R.raw.gigi);
            sound.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mediaPlayer.start();
                }
            });
        } else if (yes.equals("Kapallayar")) {
            image.setImageResource(R.drawable.kapallayar);
            mediaPlayer = MediaPlayer.create(this, R.raw.kapallayar);
            sound.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mediaPlayer.start();
                }
            });
        } else if (yes.equals("Kuda")) {
            image.setImageResource(R.drawable.kuda);
            mediaPlayer = MediaPlayer.create(this, R.raw.kuda);
            sound.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mediaPlayer.start();
                }
            });
        } else if (yes.equals("Raksasa")) {
            image.setImageResource(R.drawable.raksasa);
            mediaPlayer = MediaPlayer.create(this, R.raw.raksasa);
            sound.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mediaPlayer.start();
                }
            });
        } else if (yes.equals("Perahu")) {
            image.setImageResource(R.drawable.perahu);
            mediaPlayer = MediaPlayer.create(this, R.raw.perahu);
            sound.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mediaPlayer.start();
                }
            });
        } else if (yes.equals("Monyet")) {
            image.setImageResource(R.drawable.monyet);
            mediaPlayer = MediaPlayer.create(this, R.raw.monyet);
            sound.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mediaPlayer.start();
                }
            });
        } else if (yes.equals("Cincin")) {
            image.setImageResource(R.drawable.cincin);
            mediaPlayer = MediaPlayer.create(this, R.raw.cincin);
            sound.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mediaPlayer.start();
                }
            });
        } else if (yes.equals("Layangan")) {
            image.setImageResource(R.drawable.layangan);
            mediaPlayer = MediaPlayer.create(this, R.raw.layangan);
            sound.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mediaPlayer.start();
                }
            });
        } else if (yes.equals("Burunghantu")) {
            image.setImageResource(R.drawable.burunghantu);
            mediaPlayer = MediaPlayer.create(this, R.raw.burunghantu);
            sound.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mediaPlayer.start();
                }
            });
        } else if (yes.equals("Ayam")) {
            image.setImageResource(R.drawable.ayam);
            mediaPlayer = MediaPlayer.create(this, R.raw.ayam);
            sound.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mediaPlayer.start();
                }
            });
        } else if (yes.equals("Piring")) {
            image.setImageResource(R.drawable.piring);
            mediaPlayer = MediaPlayer.create(this, R.raw.piring);
            sound.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mediaPlayer.start();
                }
            });
        } else if (yes.equals("Mahkota")) {
            image.setImageResource(R.drawable.mahkota);
            mediaPlayer = MediaPlayer.create(this, R.raw.mahkota);
            sound.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mediaPlayer.start();
                }
            });
        } else if (yes.equals("Tombak")) {
            image.setImageResource(R.drawable.tombak);
            mediaPlayer = MediaPlayer.create(this, R.raw.tombak);
            sound.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mediaPlayer.start();
                }
            });
        } else if (yes.equals("Anak")) {
            image.setImageResource(R.drawable.anakkecil);
            mediaPlayer = MediaPlayer.create(this, R.raw.anakkecil);
            sound.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mediaPlayer.start();
                }
            });
        } else if (yes.equals("Kurakura")) {
            image.setImageResource(R.drawable.kurakura);
            mediaPlayer = MediaPlayer.create(this, R.raw.kurakura);
            sound.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mediaPlayer.start();
                }
            });
        } else if (yes.equals("Daun")) {
            image.setImageResource(R.drawable.daun);
            mediaPlayer = MediaPlayer.create(this, R.raw.daun);
            sound.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mediaPlayer.start();
                }
            });
        } else if (yes.equals("Ikan")) {
            image.setImageResource(R.drawable.ikan);
            mediaPlayer = MediaPlayer.create(this, R.raw.ikan);
            sound.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mediaPlayer.start();
                }
            });
        } else if (yes.equals("Bak")) {
            image.setImageResource(R.drawable.bak);
            mediaPlayer = MediaPlayer.create(this, R.raw.bak);
            sound.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mediaPlayer.start();
                }
            });
        } else if (yes.equals("Telur")) {
            image.setImageResource(R.drawable.telur);
            mediaPlayer = MediaPlayer.create(this, R.raw.telur);
            sound.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mediaPlayer.start();
                }
            });
        } else if (yes.equals("Botol")) {
            image.setImageResource(R.drawable.botol);
            mediaPlayer = MediaPlayer.create(this, R.raw.botol);
            sound.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mediaPlayer.start();
                }
            });
        } else if (yes.equals("Simbalkecil")) {
            image.setImageResource(R.drawable.simbalkecil);
            mediaPlayer = MediaPlayer.create(this, R.raw.simbalkecil);
            sound.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mediaPlayer.start();
                }
            });
        } else if (yes.equals("Pedestal")) {
            image.setImageResource(R.drawable.pedestal);
            mediaPlayer = MediaPlayer.create(this, R.raw.pedestal);
            sound.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mediaPlayer.start();
                }
            });
        } else if (yes.equals("Tas")) {
            image.setImageResource(R.drawable.tas);
            mediaPlayer = MediaPlayer.create(this, R.raw.tas);
            sound.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mediaPlayer.start();
                }
            });
        } else if (yes.equals("Lebah")) {
            image.setImageResource(R.drawable.lebah);
            mediaPlayer = MediaPlayer.create(this, R.raw.lebah);
            sound.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mediaPlayer.start();
                }
            });
        } else if (yes.equals("Penutup")) {
            image.setImageResource(R.drawable.penutup);
            mediaPlayer = MediaPlayer.create(this, R.raw.penutup);
            sound.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mediaPlayer.start();
                }
            });
        } else if (yes.equals("Pavilium")) {
            image.setImageResource(R.drawable.pavilium);
            mediaPlayer = MediaPlayer.create(this, R.raw.paviliun);
            sound.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mediaPlayer.start();
                }
            });
        } else if (yes.equals("Pertapa")) {
            image.setImageResource(R.drawable.pertapa);
            mediaPlayer = MediaPlayer.create(this, R.raw.pertapa);
            sound.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mediaPlayer.start();
                }
            });
        } else if (yes.equals("Harimau")) {
            image.setImageResource(R.drawable.harimau);
            mediaPlayer = MediaPlayer.create(this, R.raw.harimau);
            sound.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mediaPlayer.start();
                }
            });
        } else if (yes.equals("Peti")) {
            image.setImageResource(R.drawable.peti);
            mediaPlayer = MediaPlayer.create(this, R.raw.peti);
            sound.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mediaPlayer.start();
                }
            });
        }
 
        dialog.show();
    }
}
