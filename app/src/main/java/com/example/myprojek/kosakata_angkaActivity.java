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
public class kosakata_angkaActivity extends AppCompatActivity {
    LinearLayout Pagi, Siang, Sore, Malam, Halo, Makasih, Dengansenanghati, Maaf, Gapapa, Apakabar, Sehat, Sakit, Iya, Tidak, Bukan,
            Kah, Paham, Pahamga, Gapaham, Bisa, Bisaga, Gabisa, Oke, Okega, Gaoke, Sampaijumpa, Satu, Dua, Tiga, Empat, Lima, Enam, Tujuh,
            Delapan, Sembilan, Sepuluh, Sebelas, Duabelas, Tigabelas, Empatbelas, Limabelas, Enambelas, Tujuhbelas, Delapanbelas, Sembilanbelas,
            Duapuluh, Duasatu, Duadua, Duatiga, Tigapuluh, Empatpuluh, Limapuluh, Enampuluh, Tujuhpuluh, Delapanpuluh,
            Sembilanpuluh, Seratus, Seribu, Sepuluhribu, Seratusribu, Sejuta;
    Dialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kosakata_angka);
        dialog = new Dialog(kosakata_angkaActivity.this);
        getSupportActionBar().setTitle("Kosakata dan Angka");
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.purple_700)));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Pagi = findViewById(R.id.Pagi);Siang = findViewById(R.id.Siang);Sore = findViewById(R.id.Sore);Malam = findViewById(R.id.Malam);
        Halo = findViewById(R.id.Halo);
        Makasih = findViewById(R.id.Makasih);Dengansenanghati = findViewById(R.id.Senanghati);
        Maaf = findViewById(R.id.Maaf);Gapapa = findViewById(R.id.Gapapa);
        Apakabar = findViewById(R.id.Apakabar);Sehat = findViewById(R.id.Sehat);Sakit = findViewById(R.id.Sakit);
        Iya = findViewById(R.id.Iya);Tidak = findViewById(R.id.Tidak);Bukan = findViewById(R.id.Bukan);
        Kah = findViewById(R.id.Kah);
        Paham = findViewById(R.id.Paham);Pahamga = findViewById(R.id.Pahamga);Gapaham = findViewById(R.id.Gapaham);
        Bisa = findViewById(R.id.Bisa);Bisaga = findViewById(R.id.Bisaga);Gabisa = findViewById(R.id.Gabisa);
        Oke = findViewById(R.id.Oke);Okega = findViewById(R.id.Okega);Gaoke = findViewById(R.id.Gaoke);
        Sampaijumpa = findViewById(R.id.Sampaijumpa);
        Satu = findViewById(R.id.Satu);Dua = findViewById(R.id.Dua);Tiga = findViewById(R.id.Tiga);Empat = findViewById(R.id.Empat);Lima = findViewById(R.id.Lima);
        Enam = findViewById(R.id.Enam);Tujuh = findViewById(R.id.Tujuh);Delapan = findViewById(R.id.Delapan);Sembilan = findViewById(R.id.Sembilan);Sepuluh = findViewById(R.id.Sepuluh);
        Sebelas = findViewById(R.id.Sebelas);Duabelas = findViewById(R.id.Duabelas);Tigabelas = findViewById(R.id.Tigabelas);Empatbelas = findViewById(R.id.Empatbelas);Limabelas = findViewById(R.id.Limabelas);
        Enambelas = findViewById(R.id.Enambelas);Tujuhbelas = findViewById(R.id.Tujuhbelas);Delapanbelas = findViewById(R.id.Delapanbelas);Sembilanbelas = findViewById(R.id.Sembilanbelas);Duapuluh = findViewById(R.id.Duapuluh);
        Duasatu = findViewById(R.id.Duasatu);Duadua = findViewById(R.id.Duadua);Duatiga = findViewById(R.id.Duatiga);
        Tigapuluh = findViewById(R.id.Tigapuluh);Empatpuluh = findViewById(R.id.Empatpuluh);Limapuluh = findViewById(R.id.Limapuluh);Enampuluh = findViewById(R.id.Enampuluh);
        Tujuhpuluh = findViewById(R.id.Tujuhpuluh);Delapanpuluh = findViewById(R.id.Delapanpuluh);Sembilanpuluh = findViewById(R.id.Sembilanpuluh);
        Seratus = findViewById(R.id.Seratus);Seribu = findViewById(R.id.Seribu);Sepuluhribu = findViewById(R.id.Sepuluhribu);
        Seratusribu = findViewById(R.id.Seratusribu);Sejuta = findViewById(R.id.Sejuta);

        Pagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { showDialog("Selamat Pagi"); }
        });Siang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { showDialog("Selamat Siang"); }
        });Sore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { showDialog("Selamat Sore"); }
        });Malam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { showDialog("Selamat Malam"); }
        });
        Halo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { showDialog("Halo"); }
        });
        Makasih.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog("Terima Kasih");
            }
        });Dengansenanghati.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog("Dengan Senang Hati");
            }
        });
        Maaf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog("Maaf");
            }
        });Gapapa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog("Tidak apa apa");
            }
        });
        Apakabar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog("Apa Kabar");
            }
        });Sehat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog("Sehat");
            }
        });Sakit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog("Sakit");
            }
        });
        Iya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog("Iya");
            }
        });Tidak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog("Tidak");
            }
        });Bukan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog("Bukan");
            }
        });
        Kah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog("Kah");
            }
        });
        Paham.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog("Paham");
            }
        });Pahamga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog("Paham Ga?");
            }
        });Gapaham.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog("Tidak Paham");
            }
        });
        Bisa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog("Bisa");
            }
        });Bisaga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog("Bisa Ga?");
            }
        });Gabisa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog("Tidak Bisa");
            }
        });
        Oke.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog("Oke");
            }
        });Okega.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog("Oke Ga");
            }
        });Gaoke.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog("Tidak Oke");
            }
        });
        Sampaijumpa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog("Sampai Jumpa");
            }
        });
        Satu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog("Satu");
            }
        });Dua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog("Dua");
            }
        });Tiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog("Tiga");
            }
        });Empat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog("Empat");
            }
        });Lima.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog("Lima");
            }
        });
        Enam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog("Enam");
            }
        });Tujuh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog("Tujuh");
            }
        });Delapan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog("Delapan");
            }
        });Sembilan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog("Sembilan");
            }
        });Sepuluh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog("Sepuluh");
            }
        });
        Sebelas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog("Sebelas");
            }
        });Duabelas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog("Dua Belas");
            }
        });Tigabelas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog("Tiga Belas");
            }
        });Empatbelas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog("Empat Belas");
            }
        });Limabelas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog("Lima Belas");
            }
        });
        Enambelas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog("Enam Belas");
            }
        });Tujuhbelas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog("Tujuh Belas");
            }
        });Delapanbelas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog("Delapan Belas");
            }
        });Sembilanbelas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog("Sembilan Belas");
            }
        });Duapuluh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog("Dua Puluh");
            }
        });
        Duasatu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog("Dua Puluh Satu");
            }
        });Duadua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog("Dua Puluh Dua");
            }
        });Duatiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog("Dua Puluh Tiga");
            }
        });
        Tigapuluh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog("Tiga Puluh");
            }
        });Empatpuluh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog("Empat Puluh");
            }
        });Limapuluh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog("Lima Puluh");
            }
        });Enampuluh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog("Enam Puluh");
            }
        });
        Tujuhpuluh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog("Tujuh Puluh");
            }
        });Delapanpuluh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog("Delapan Puluh");
            }
        });Sembilanpuluh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog("Sembilan Puluh");
            }
        });
        Seratus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog("Seratus");
            }
        });Seribu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog("Seribu");
            }
        });Sepuluhribu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog("Sepuluh Ribu");
            }
        });
        Seratusribu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog("Seratus Ribu");
            }
        });Sejuta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog("Sejuta");
            }
        });

    }


    private void showDialog(String yes) {
        ImageView images, sounds;
        MediaPlayer mediaPlayer;

        dialog = new Dialog(kosakata_angkaActivity.this);
        dialog.setContentView(R.layout.aksarapopup);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        images = dialog.findViewById(R.id.images);
        sounds = dialog.findViewById(R.id.sounds);

        if (yes.equals("Selamat Pagi")){
            images.setImageResource(R.drawable.pagi);
            mediaPlayer = MediaPlayer.create(this, R.raw.pagi);
            sounds.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mediaPlayer.start();
                }
            });
        } else if (yes.equals("Selamat Siang")){
            images.setImageResource(R.drawable.siang);
            mediaPlayer = MediaPlayer.create(this, R.raw.siang);
            sounds.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mediaPlayer.start();
                }
            });
        } else if (yes.equals("Selamat Sore")){
            images.setImageResource(R.drawable.sore);
            mediaPlayer = MediaPlayer.create(this, R.raw.sore);
            sounds.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mediaPlayer.start();
                }
            });
        } else if (yes.equals("Selamat Malam")){
            images.setImageResource(R.drawable.malam);
            mediaPlayer = MediaPlayer.create(this, R.raw.malam);
            sounds.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mediaPlayer.start();
                }
            });
        } else if (yes.equals("Halo")){
            images.setImageResource(R.drawable.halo);
            mediaPlayer = MediaPlayer.create(this, R.raw.halo);
            sounds.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mediaPlayer.start();
                }
            });
        }
        else if (yes.equals("Terima Kasih")){
            images.setImageResource(R.drawable.terimakasih);
            mediaPlayer = MediaPlayer.create(this, R.raw.makasih);
            sounds.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mediaPlayer.start();
                }
            });
        } else if (yes.equals("Dengan Senang Hati")){
            images.setImageResource(R.drawable.senanghati);
            mediaPlayer = MediaPlayer.create(this, R.raw.senanghati);
            sounds.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mediaPlayer.start();
                }
            });
        } else if (yes.equals("Maaf")){
            images.setImageResource(R.drawable.maaf);
            mediaPlayer = MediaPlayer.create(this, R.raw.maaf);
            sounds.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mediaPlayer.start();
                }
            });
        } else if (yes.equals("Tidak apa apa")){
            images.setImageResource(R.drawable.gapapa);
            mediaPlayer = MediaPlayer.create(this, R.raw.gapapa);
            sounds.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mediaPlayer.start();
                }
            });
        } else if (yes.equals("Apa Kabar")){
            images.setImageResource(R.drawable.apakab);
            mediaPlayer = MediaPlayer.create(this, R.raw.apakabar);
            sounds.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mediaPlayer.start();
                }
            });
        }
        else if (yes.equals("Sehat")){
            images.setImageResource(R.drawable.sehat1);
            mediaPlayer = MediaPlayer.create(this, R.raw.sehat);
            sounds.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mediaPlayer.start();
                }
            });
        } else if (yes.equals("Sakit")){
            images.setImageResource(R.drawable.sakit);
            mediaPlayer = MediaPlayer.create(this, R.raw.sakit);
            sounds.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mediaPlayer.start();
                }
            });
        } else if (yes.equals("Iya")){
            images.setImageResource(R.drawable.ya);
            mediaPlayer = MediaPlayer.create(this, R.raw.ya);
            sounds.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mediaPlayer.start();
                }
            });
        } else if (yes.equals("Tidak")){
            images.setImageResource(R.drawable.tidak);
            mediaPlayer = MediaPlayer.create(this, R.raw.tidak);
            sounds.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mediaPlayer.start();
                }
            });
        } else if (yes.equals("Bukan")){
            images.setImageResource(R.drawable.bukan);
            mediaPlayer = MediaPlayer.create(this, R.raw.bukan);
            sounds.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mediaPlayer.start();
                }
            });
        }
        else if (yes.equals("Kah")){
            images.setImageResource(R.drawable.kah);
            mediaPlayer = MediaPlayer.create(this, R.raw.kah);
            sounds.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mediaPlayer.start();
                }
            });
        } else if (yes.equals("Paham")){
            images.setImageResource(R.drawable.paham);
            mediaPlayer = MediaPlayer.create(this, R.raw.paham);
            sounds.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mediaPlayer.start();
                }
            });
        } else if (yes.equals("Paham Ga?")){
            images.setImageResource(R.drawable.pahamga);
            mediaPlayer = MediaPlayer.create(this, R.raw.pahamga);
            sounds.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mediaPlayer.start();
                }
            });
        } else if (yes.equals("Tidak Paham")){
            images.setImageResource(R.drawable.tidakpaham1);
            mediaPlayer = MediaPlayer.create(this, R.raw.gapaham);
            sounds.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mediaPlayer.start();
                }
            });
        } else if (yes.equals("Bisa")){
            images.setImageResource(R.drawable.bisa);
            mediaPlayer = MediaPlayer.create(this, R.raw.bisa);
            sounds.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mediaPlayer.start();
                }
            });
        }
        else if (yes.equals("Bisa Ga?")){
            images.setImageResource(R.drawable.bisaga1);
            mediaPlayer = MediaPlayer.create(this, R.raw.bisaga);
            sounds.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mediaPlayer.start();
                }
            });
        } else if (yes.equals("Tidak Bisa")){
            images.setImageResource(R.drawable.tidakbisa1);
            mediaPlayer = MediaPlayer.create(this, R.raw.gabisa);
            sounds.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mediaPlayer.start();
                }
            });
        } else if (yes.equals("Oke")){
            images.setImageResource(R.drawable.ok);
            mediaPlayer = MediaPlayer.create(this, R.raw.oke);
            sounds.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mediaPlayer.start();
                }
            });
        } else if (yes.equals("Oke Ga")){
            images.setImageResource(R.drawable.okga);
            mediaPlayer = MediaPlayer.create(this, R.raw.okega);
            sounds.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mediaPlayer.start();
                }
            });
        } else if (yes.equals("Tidak Oke")){
            images.setImageResource(R.drawable.tidakoke1);
            mediaPlayer = MediaPlayer.create(this, R.raw.gaoke);
            sounds.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mediaPlayer.start();
                }
            });
        } else if (yes.equals("Sampai Jumpa")){
            images.setImageResource(R.drawable.sampaijumpa1);
            mediaPlayer = MediaPlayer.create(this, R.raw.sampaijumpa);
            sounds.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mediaPlayer.start();
                }
            });
        }
        else if (yes.equals("Satu")){
            images.setImageResource(R.drawable.satu);
            mediaPlayer = MediaPlayer.create(this, R.raw.satu);
            sounds.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mediaPlayer.start();
                }
            });
        } else if (yes.equals("Dua")){
            images.setImageResource(R.drawable.dua);
            mediaPlayer = MediaPlayer.create(this, R.raw.dua);
            sounds.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mediaPlayer.start();
                }
            });
        } else if (yes.equals("Tiga")){
            images.setImageResource(R.drawable.tiga);
            mediaPlayer = MediaPlayer.create(this, R.raw.tiga);
            sounds.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mediaPlayer.start();
                }
            });
        } else if (yes.equals("Empat")){
            images.setImageResource(R.drawable.empat);
            mediaPlayer = MediaPlayer.create(this, R.raw.empat);
            sounds.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mediaPlayer.start();
                }
            });
        } else if (yes.equals("Lima")){
            images.setImageResource(R.drawable.lima);
            mediaPlayer = MediaPlayer.create(this, R.raw.lima);
            sounds.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mediaPlayer.start();
                }
            });
        }
        else if (yes.equals("Enam")){
            images.setImageResource(R.drawable.enam);
            mediaPlayer = MediaPlayer.create(this, R.raw.enam);
            sounds.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mediaPlayer.start();
                }
            });
        } else if (yes.equals("Tujuh")){
            images.setImageResource(R.drawable.tujuh);
            mediaPlayer = MediaPlayer.create(this, R.raw.tujuh);
            sounds.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mediaPlayer.start();
                }
            });
        } else if (yes.equals("Delapan")){
            images.setImageResource(R.drawable.delapan);
            mediaPlayer = MediaPlayer.create(this, R.raw.delapan);
            sounds.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mediaPlayer.start();
                }
            });
        } else if (yes.equals("Sembilan")){
            images.setImageResource(R.drawable.sembilan);
            mediaPlayer = MediaPlayer.create(this, R.raw.sembilan);
            sounds.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mediaPlayer.start();
                }
            });
        } else if (yes.equals("Sepuluh")){
            images.setImageResource(R.drawable.sepuluh);
            mediaPlayer = MediaPlayer.create(this, R.raw.sepuluh);
            sounds.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mediaPlayer.start();
                }
            });
        }
        else if (yes.equals("Sebelas")){
            images.setImageResource(R.drawable.sebelas);
            mediaPlayer = MediaPlayer.create(this, R.raw.sebelas);
            sounds.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mediaPlayer.start();
                }
            });
        } else if (yes.equals("Dua Belas")){
            images.setImageResource(R.drawable.duabelas);
            mediaPlayer = MediaPlayer.create(this, R.raw.duabelas);
            sounds.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mediaPlayer.start();
                }
            });
        } else if (yes.equals("Tiga Belas")){
            images.setImageResource(R.drawable.tigabelas);
            mediaPlayer = MediaPlayer.create(this, R.raw.tigabelas);
            sounds.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mediaPlayer.start();
                }
            });
        }
        else if (yes.equals("Empat Belas")){
            images.setImageResource(R.drawable.empatbelas);
            mediaPlayer = MediaPlayer.create(this, R.raw.empatbelas);
            sounds.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mediaPlayer.start();
                }
            });
        } else if (yes.equals("Lima Belas")){
            images.setImageResource(R.drawable.limabelas);
            mediaPlayer = MediaPlayer.create(this, R.raw.limabelas);
            sounds.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mediaPlayer.start();
                }
            });
        } else if (yes.equals("Enam Belas")){
            images.setImageResource(R.drawable.enambelas);
            mediaPlayer = MediaPlayer.create(this, R.raw.enambelas);
            sounds.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mediaPlayer.start();
                }
            });
        } else if (yes.equals("Tujuh Belas")){
            images.setImageResource(R.drawable.tujuhbelas);
            mediaPlayer = MediaPlayer.create(this, R.raw.tujuhbelas);
            sounds.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mediaPlayer.start();
                }
            });
        } else if (yes.equals("Delapan Belas")){
            images.setImageResource(R.drawable.delapanbelas);
            mediaPlayer = MediaPlayer.create(this, R.raw.delapanbelas);
            sounds.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mediaPlayer.start();
                }
            });
        }
        else if (yes.equals("Sembilan Belas")){
            images.setImageResource(R.drawable.sembilanbelas);
            mediaPlayer = MediaPlayer.create(this, R.raw.sembilanbelas);
            sounds.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mediaPlayer.start();
                }
            });
        } else if (yes.equals("Dua Puluh")){
            images.setImageResource(R.drawable.duapuluh);
            mediaPlayer = MediaPlayer.create(this, R.raw.duapuluh);
            sounds.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mediaPlayer.start();
                }
            });
        } else if (yes.equals("Dua Puluh Satu")){
            images.setImageResource(R.drawable.duasatu);
            mediaPlayer = MediaPlayer.create(this, R.raw.duasatu);
            sounds.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mediaPlayer.start();
                }
            });
        }
        else if (yes.equals("Dua Puluh Dua")){
            images.setImageResource(R.drawable.duadua);
            mediaPlayer = MediaPlayer.create(this, R.raw.duadua);
            sounds.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mediaPlayer.start();
                }
            });
        } else if (yes.equals("Dua Puluh Tiga")){
            images.setImageResource(R.drawable.duatiga);
            mediaPlayer = MediaPlayer.create(this, R.raw.duatiga);
            sounds.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mediaPlayer.start();
                }
            });
        } else if (yes.equals("Tiga Puluh")){
            images.setImageResource(R.drawable.tigapuluh);
            mediaPlayer = MediaPlayer.create(this, R.raw.tigapuluh);
            sounds.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mediaPlayer.start();
                }
            });
        } else if (yes.equals("Empat Puluh")){
            images.setImageResource(R.drawable.empatpuluh);
            mediaPlayer = MediaPlayer.create(this, R.raw.empatpuluh);
            sounds.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mediaPlayer.start();
                }
            });
        } else if (yes.equals("Lima Puluh")){
            images.setImageResource(R.drawable.limapuluh);
            mediaPlayer = MediaPlayer.create(this, R.raw.limapuluh);
            sounds.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mediaPlayer.start();
                }
            });
        }
        else if (yes.equals("Enam Puluh")){
            images.setImageResource(R.drawable.enampuluh);
            mediaPlayer = MediaPlayer.create(this, R.raw.enampuluh);
            sounds.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mediaPlayer.start();
                }
            });
        } else if (yes.equals("Tujuh Puluh")){
            images.setImageResource(R.drawable.tujuhpuluh);
            mediaPlayer = MediaPlayer.create(this, R.raw.tujuhpuluh);
            sounds.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mediaPlayer.start();
                }
            });
        } else if (yes.equals("Delapan Puluh")){
            images.setImageResource(R.drawable.delapanpuluh);
            mediaPlayer = MediaPlayer.create(this, R.raw.delapanpuluh);
            sounds.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mediaPlayer.start();
                }
            });
        } else if (yes.equals("Sembilan Puluh")){
            images.setImageResource(R.drawable.sembilanpuluh);
            mediaPlayer = MediaPlayer.create(this, R.raw.sembilanpuluh);
            sounds.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mediaPlayer.start();
                }
            });
        } else if (yes.equals("Seratus")){
            images.setImageResource(R.drawable.seratus);
            mediaPlayer = MediaPlayer.create(this, R.raw.seratus);
            sounds.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mediaPlayer.start();
                }
            });
        }
        else if (yes.equals("Seribu")){
            images.setImageResource(R.drawable.seribu);
            mediaPlayer = MediaPlayer.create(this, R.raw.seribu);
            sounds.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mediaPlayer.start();
                }
            });
        } else if (yes.equals("Sepuluh Ribu")){
            images.setImageResource(R.drawable.sepuluhribu);
            mediaPlayer = MediaPlayer.create(this, R.raw.sepuluhrb);
            sounds.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mediaPlayer.start();
                }
            });
        } else if (yes.equals("Seratus Ribu")){
            images.setImageResource(R.drawable.seratusribu);
            mediaPlayer = MediaPlayer.create(this, R.raw.seratusrb);
            sounds.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mediaPlayer.start();
                }
            });
        } else if (yes.equals("Sejuta")){
            images.setImageResource(R.drawable.sejuta);
            mediaPlayer = MediaPlayer.create(this, R.raw.sejuta);
            sounds.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mediaPlayer.start();
                }
            });
        }

        dialog.show();
    }
}