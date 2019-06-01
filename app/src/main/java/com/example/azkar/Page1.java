package com.example.azkar;

import android.app.AppComponentFactory;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Page1 extends AppCompatActivity   {
ImageView py1,py2,py3, py4, py5, py6, py7, py8,py9,py10,
        pu1,pu2,pu3,pu4,pu5,pu6,pu7,pu8,pu9,pu10,
    zoo1,zoo2,zoo3,zoo4,zoo5,zoo6,zoo7,zoo8,zoo9,zoo10,
        mim1,mim2,mim3,mim4,mim5,mim6,mim7,mim8,mim9,mim10;
  TextView v1,v2,v3, v4,v5,v6,v7,v8,v9,v10;
 MediaPlayer mp1, mp2,mp3;
 int ss1 =25;
    int ss2 = 25;
    int ss3=25;
    int ss4=25;
    int ss5 = 25;
    int ss6=25;
    int ss7 =25;
    int ss8 = 25;
    int ss9=25;
    int ss10 =25;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page1);
      py1=findViewById(R.id.p1);
      py2=findViewById(R.id.p2);
        py3=findViewById(R.id.p3);

       pu1=findViewById(R.id.ps1);
       pu2=findViewById(R.id.ps2);
        pu3=findViewById(R.id.ps3);

      zoo1=findViewById(R.id.z1);
        zoo2=findViewById(R.id.z2);
       zoo3=findViewById(R.id.z3);


        zoo4=findViewById(R.id.z4);
        zoo5=findViewById(R.id.z5);
        zoo6=findViewById(R.id.z6);


        zoo7=findViewById(R.id.z7);
        zoo8=findViewById(R.id.z8);
        zoo9=findViewById(R.id.z9);


        zoo10=findViewById(R.id.z10);

        mim1=findViewById(R.id.m1);
    mim2=findViewById(R.id.m2);
       mim3=findViewById(R.id.m3);



        mim4=findViewById(R.id.m4);
        mim5=findViewById(R.id.m5);
        mim6=findViewById(R.id.m6);;

        mim7=findViewById(R.id.m7);


        mim8=findViewById(R.id.m8);
        mim9=findViewById(R.id.m9);
        mim10=findViewById(R.id.m10);



        v1 =findViewById(R.id.textView1);
       v2=findViewById(R.id.textView2);
      v3=findViewById(R.id.textView3);



        v1 =findViewById(R.id.textView1);
        v2=findViewById(R.id.textView2);
        v3=findViewById(R.id.textView3);




        v1 =findViewById(R.id.textView1);
        v2=findViewById(R.id.textView2);
        v3=findViewById(R.id.textView3);



        v1 =findViewById(R.id.textView1);
        v2=findViewById(R.id.textView2);
        v3=findViewById(R.id.textView3);



        v4 =findViewById(R.id.textView4);
        v5=findViewById(R.id.textView5);
        v6=findViewById(R.id.textView6);

        v7 =findViewById(R.id.textView7);
        v8=findViewById(R.id.textView8);
        v9=findViewById(R.id.textView9);

        v10 =findViewById(R.id.textView10);



        mp1 =MediaPlayer.create(this,R.raw.mp1);
       mp2 = MediaPlayer.create(this,R.raw.mp2);
      mp3 = MediaPlayer.create(this,R.raw.mp3);
////
       py1.setOnClickListener(new View.OnClickListener() {
           @Override
            public void onClick(View v) {
                mp1.start();

            }
        });


      py2.setOnClickListener(new View.OnClickListener() {
          @Override
           public void onClick(View v) {
       mp2.start();
         }
     });

       py3.setOnClickListener(new View.OnClickListener() {
           @Override
         public void onClick(View v) {
               mp3.start();

            }
       });

       pu1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
              mp1.pause();

            }
       });

       pu2.setOnClickListener(new View.OnClickListener() {
          @Override
           public void onClick(View v) {
              mp2.pause();

    }
    });


       pu3.setOnClickListener(new View.OnClickListener() {
        @Override
            public void onClick(View v) {
              mp3.pause();

          }
       });

       zoo1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
                if(ss1<35)
              {
                   ss1++;
                }
               else
                { Toast.makeText(Page1.this, "عفوا لايمكنك تكبير النص ", Toast.LENGTH_SHORT).show();
                }
                v1.setTextSize(ss1);

           }
        });


       zoo2.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
               if(ss2<35)
                {
                   ss2++;
                }
                else
              {
                  Toast.makeText(Page1.this, "عفوا لايمكنك تكبير النص ", Toast.LENGTH_SHORT).show();
                }
                v2.setTextSize(ss2);


          }
       });


        zoo3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ss3<35)
                {
                    ss3++;
                }
                else
                {
                    Toast.makeText(Page1.this, "عفوا لايمكنك تكبير النص ", Toast.LENGTH_SHORT).show();
                }
                v3.setTextSize(ss3);


            }
        });

        zoo4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ss4<35)
                {
                    ss4++;
                }
                else
                { Toast.makeText(Page1.this, "عفوا لايمكنك تكبير النص ", Toast.LENGTH_SHORT).show();
                }
                v4.setTextSize(ss4);

            }
        });


        zoo5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ss5<35)
                {
                    ss5++;
                }
                else
                {
                    Toast.makeText(Page1.this, "عفوا لايمكنك تكبير النص ", Toast.LENGTH_SHORT).show();
                }
                v5.setTextSize(ss5);


            }
        });


        zoo6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ss6<35)
                {
                    ss6++;
                }
                else
                {
                    Toast.makeText(Page1.this, "عفوا لايمكنك تكبير النص ", Toast.LENGTH_SHORT).show();
                }
                v6.setTextSize(ss6);


            }
        });




        zoo7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ss7<35)
                {
                    ss7++;
                }
                else
                { Toast.makeText(Page1.this, "عفوا لايمكنك تكبير النص ", Toast.LENGTH_SHORT).show();
                }
                v7.setTextSize(ss7);

            }
        });


        zoo8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ss8<35)
                {
                    ss8++;
                }
                else
                {
                    Toast.makeText(Page1.this, "عفوا لايمكنك تكبير النص ", Toast.LENGTH_SHORT).show();
                }
                v8.setTextSize(ss8);


            }
        });





        zoo9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ss9<35)
                {
                    ss9++;
                }
                else
                { Toast.makeText(Page1.this, "عفوا لايمكنك تكبير النص ", Toast.LENGTH_SHORT).show();
                }
                v9.setTextSize(ss9);

            }
        });


        zoo10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ss10<35)
                {
                    ss10++;
                }
                else
                {
                    Toast.makeText(Page1.this, "عفوا لايمكنك تكبير النص ", Toast.LENGTH_SHORT).show();
                }
                v10.setTextSize(ss10);


            }
        });





       mim1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ss1>25)
                {
                   ss1--;
                }
                else
                {
                    Toast.makeText(Page1.this, "عفوا لايمكنك تصغير النص ", Toast.LENGTH_SHORT).show();
                }
                v1.setTextSize(ss1);


           }
        });


        mim2.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               if(ss2>25)
               {
                   ss2--;
               }
              else
              {
                   Toast.makeText(Page1.this, "عفوا لايمكنك تصغير النص ", Toast.LENGTH_SHORT).show();
              }
                v2.setTextSize(ss2);


            }
        });


        mim3.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
              if(ss3>25)
              {
                   ss3--;
               }
              else
               {
                    Toast.makeText(Page1.this, "عفوا لايمكنك تصغير النص ", Toast.LENGTH_SHORT).show();
               }
              v3.setTextSize(ss3);
            }});




        mim4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ss4>25)
                {
                    ss4--;
                }
                else
                {
                    Toast.makeText(Page1.this, "عفوا لايمكنك تصغير النص ", Toast.LENGTH_SHORT).show();
                }
                v4.setTextSize(ss4);


            }
        });


        mim5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ss5>25)
                {
                    ss5--;
                }
                else
                {
                    Toast.makeText(Page1.this, "عفوا لايمكنك تصغير النص ", Toast.LENGTH_SHORT).show();
                }
                v5.setTextSize(ss5);


            }
        });


        mim6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ss6>25)
                {
                    ss6--;
                }
                else
                {
                    Toast.makeText(Page1.this, "عفوا لايمكنك تصغير النص ", Toast.LENGTH_SHORT).show();
                }
                v6.setTextSize(ss6);
            }});



        mim7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ss7>25)
                {
                    ss7--;
                }
                else
                {
                    Toast.makeText(Page1.this, "عفوا لايمكنك تصغير النص ", Toast.LENGTH_SHORT).show();
                }
                v7.setTextSize(ss7);


            }
        });


        mim8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ss8>25)
                {
                    ss8--;
                }
                else
                {
                    Toast.makeText(Page1.this, "عفوا لايمكنك تصغير النص ", Toast.LENGTH_SHORT).show();
                }
                v8.setTextSize(ss8);


            }
        });


        mim9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ss9>25)
                {
                    ss9--;
                }
                else
                {
                    Toast.makeText(Page1.this, "عفوا لايمكنك تصغير النص ", Toast.LENGTH_SHORT).show();
                }
                v9.setTextSize(ss9);
            }});




        mim10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ss10>25)
                {
                    ss10--;
                }
                else
                {
                    Toast.makeText(Page1.this, "عفوا لايمكنك تصغير النص ", Toast.LENGTH_SHORT).show();
                }
                v10.setTextSize(ss10);
            }});




    }
}
