package me.Other;

import java.awt.Color;
import java.awt.Graphics;

public class TheFox {
	public static String cat1;
	public static String cat2;
	public static String cat3;
	public static String cat4;
	
	
	public static void init(){
		/***** initialize global film variables ******/
		int frames = 31; // <---- total number of pictures in film
		int delay = 90; // <---- delay after each frame
		String color = "#FF0000"; // <---- Color of cat
		Boolean changecol = true; // <---- Randomly change color of cat? If true the cat will change colors if false the color of the cat will be the value of the color variable.
		Boolean move_cat = true; // <---- Move cat? If true the cat will move side to side. If false the cat will stay in one place.
		int cat_fontsize = 10; // <---- In pixels

		/***** initialize anim screen position (in pixels) *****/

		int topp = 50; // <---- window position bottom
		int left = (move_cat)?-20:-10; // <---- window position left
		int width = 300; // <---- window width
		int height = 187; // <---- window height


		/***** initialize anim control variables *****/

		int posi = 0; // <---- actual picture position (frame counter)
		int prev = 1; // <---- previous picture number
		Boolean run = true; // <---- boolean : true (?????) or !true (?????)
	}
	
	public static void drawcat(Graphics g){
		initcats();
		g.setColor(Color.RED);
		g.drawString(cat1, 0, 0);
	}



/*public void change_color() {
    Array colors = new Array("#6C2DC7", "#00FFFF", "#00FF00", "#FFFF00", "#FF0000", "#FF00FF", "#1589FF", "#8D38C9", "#E3319D", "#6C2DC7", "#7E354D", "#736AFF", "#306754", "#E45E9D", "#000099", "#33CC00", "#25A0C5");
    int randomnum = Math.floor(Math.random() * 17);
    var random_color = colors[randomnum];
	for(i=0;i<=frames;i++) {
		if(i==0) {
		
		}
		else {
			document.getElementById('cat' + i).style.color = random_color;
		}
	}
}


public void animate() {
    posi = posi + 1;
    if (posi > frames) {
        if (run) {
            if (changecol && move_cat) {
                setTimeout("animate2(posi-1, prev); change_color();", delay);
            } else if (changecol && !move_cat) {
                posi = 1;
                setTimeout("animate(); change_color();", delay);
            } else if (!changecol && move_cat) {
                setTimeout("animate2(posi-1, prev);", delay);
            } else if (!changecol && !move_cat) {
                posi = 1;
                setTimeout("animate();", delay);
            }
        }
    } else {
        document.getElementById("cat"+ prev).style.visibility = 'hidden';
        document.getElementById("cat"+ posi).style.visibility = 'visible';
        prev = posi;
        if (run) setTimeout("animate()", delay);
    }
}



public void animate2(posi2, prev2) {
    posi = posi2 - 1;
    if (posi < 1) {
        if (run) {
            if (changecol) {
                setTimeout("animate(); change_color();", delay);
            } else {
                setTimeout("animate();", delay);
            }
        }
    } else {
        document.getElementById("cat"+ prev).style.visibility = 'hidden';
        document.getElementById("cat"+ posi).style.visibility = 'visible';
        prev = posi;
        if (run) setTimeout("animate2(posi, prev-1)", delay);
    }
}*/
	
	


public static void initcats(){
	
																																					//x"+
 cat1 = "                                                                                                                         ,c,            "+                                                          
"                                                                                                                     cARRRRRC,                        "+                                                  
"                                                        ,CRRRCc                   , , , , ,,,,,,,   ,,,,,,,      ,cRRRRRRRRRRc,                       "+                                                  
"                                                       ,CRRRRRRRRs,              ,,,,,,,,,,,,,,, ,,,,,,,,,,,   ,cRRRRRRRRRATTc,                       "+                                                  
"                                                       ,ARRRRRRRRRRRT,,    ,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,     cARRRRRRRRRsccsc,                       "+                                                  
"                                                        cRRRRRRRRRRRRRT,,     ,,,,,,,,,,,,,,,,,,,,,,,,     ,ARRRRRARARRRRs,cc,                        "+                                                  
"                                                         cCcccRRRRRRRRRRRAc,,,  ,,,,,,,,,,,,,,,,,,,,,   ,cARRRRRRRRRRRRCc,,,c,,                       "+                                                  
"                                                         ,cccccCRRRRRRRRRRRRRTc,,,,,,,,,,,   ,,,,, , ,cRRRRRRRRRRRRRRAcccc,,c,                        "+                                                  
"                                                          ,sTcccccTARRRRRRRRRRT,, ,,,,,,,,,,,,,,,   ,,,,ARRRRRRRRRRRTccc,,,,c,                        "+                                                  
"                                                           cTsc,,cccTRRRRRRRAc,,   , ,,, , ,,,,,,,,,,,,,,,cTRRRRAccccc,,,,,ccc                        "+                                                  
"                                                            cCTc,,,cccARRRRs,,,,,,,          ,,,  ,,,,,,,,,,,,ccccccc,,,,,csc                         "+                                                  
"                                                            ,cTCcc,cccccccc,,,,,,,,,,, ,,,,  ,,,  ,,,,,,,,,,,,,,,,,,,,,,,ccc,                         "+                                                  
"                                                              ,cTTscccccccc,,,,,,,,,,       ,,,   ,,,,,,,,,,,,,,,,,,, ,,ccc                           "+                                                  
"                                                                ,cTCcccscc,,,,,,,,,,         ,,,  ,,,,,,,,,,,,,,,,,,,,,cc,                            "+                                                  
"                                                                  ,csssccc,,,,,,,,,,,           ,,,,,,,,,,,,,,,,,,,,c,ccc                             "+                                                  
"                                                                    ,ssccccccc,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,                            "+                                                  
"                                                                   ,csscccccccc,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,                          "+                                                  
"                                                                  ,TTsccccccccccc,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,c,                         "+                                                  
"                                                                 ,Tsscccccccccc,ccccc,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,c,,                       "+                                                  
"                                                                ,sTsccccccccccccccccccccc,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,c,,                      "+                                                  
"                                                               ,sTscccccccccccccccccccc,ccc,,,,c,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,                     "+                                                  
"                                                              ,cTTcccccccccCARRCcccccccccccc,c,ccccTRRRRTc,,,,,,,,,,,,,,,,,,,,,,,,,                   "+                                                  
"                                                             ,CACTcccccccTRRRTARRTccccccccccccccccARACARRRRCc,,,,,,,,,,,,,,,,,,,,cc,,                 "+                                                  
"                                                              ,,cTTTcccccARRRCARRRATcccccc,c,cccARAc,,cRRRRRc,,,,,,,,,,,,,,,,,,,,,,                   "+                                                  
"                                                                 ,cTCsccccTsARRRRRRT,,,,,,,,,,,,cARRRARRRRAc,,,,,,,,,,,,,,,,,,,,                      "+                                                  
"                                                                   ,cCCTcc,,,sTTsTc,,,,,,,,,,,,,,,,sARRAcc,  ,,,,,,,,,,,cccc,,                        "+                                                  
"                                                                     ,csTTccc,,,,,,,,,,,,,,,,,,      ,,,   ,,,c,,,,,ccssc,,                           "+                                                  
"                                                                        ,TTTsccc,,,,,,,,,, ,,,,,,,,    ,,,,ccc,,,csCCT,,                              "+                                                  
"                                                                          csTTTcc,,,,,,,cART,,,,,,,,,,,,,cc,ccssTTc,,                                 "+                                                  
"                                                                            ,sTTcccccc,ccCTc,,,,,,,,,,,ccccTsTTscc,                                   "+                                                  
"                                                                            ,,ccTssssccccc,,ccccccccccscccTTTcc,,,,,,                                 "+                                                  
"                                                                         ,,,,,,ccTsssTTTTTTTTTcscscccTTTTTc,,,,,,,,,,,                                "+                                                  
"                                                                          ,cssTTTc,,ccccccTsTTsccc,,,,,,,,,,,,,,,,,,,,,                               "+                                                  
"                                                                          ,sTTTcc,,,,,,        ,   ,,,,,,,,,,,,,,,,,,,,,                              "+                                                  
"                                                                          ,ccc,,,,,,c,,   , , ,,,,,,,,,,,,,,,,,,,,,,,,,,                              "+                                                  
"                                                                          ,cc,,,,,,,,,,, ,,,,,,,,,,,,,,,,,,,,,,ccc,,,,,,                              "+                                                  
"                                                                          ,cTcc,,,cc,   ,,,,,,,,,,,,,,,,,,,,,,cccc,,,,,,,                             "+                                                  
"                                                                           ,cscc,ccc,, ,,,,,,,,,,, ,,,,,,,,ccccc,,,,,,,,                              "+                                                  
"                                                                            ,,ccccc,,,,,,,,,,,, ,,,,,,,,,,ccccccc,,,,,,,                              "+                                                  
"                                                                              ,ccc,,,,,,,,,,,,,, ,,,,,,,,,,cc,,,cc,,,,,,                              "+                                                  
"                                                                              ,cc,,,,,,,,,,,,,, ,,,,,,,,,,ccc  ,cc,,,,,                               "+                                                  
"                                                                              ,c,,,,,,,,,,,,,,,,,,,,,,,,,ccc,   ,,,,,,,      ,,,,                     "+                                                  
"                                                                             ,ccc,,,,,,,,,,,,,,,,,,,,,,,,cc,     ,,,, ,,,,,,,ccc,                     "+                                                  
"                                                                             ,ccc,,,,,,,,,,,,,,,,,,,,,,,,,,      cc,,,,,cccccc,,                      "+                                                  
"                                                                             ,cccc,,,,,,,,,,,,,,,,,,,,,,,,      ,cccc,c,,,ccc,                        "+                                                  
"                                                                            ,sTccc,,,,,,,,,,,,,,,,,,,,,,,,  ,,,cc,,ccccccc,,                          "+                                                  
"                                                                            ,sCcccc,,,,,,,,,,,,,,,,,,,,,,,,,ccc,,,c,cccc,,                            "+                                                  
"                                                                            ,sTcccc,,,,,,,,,,,,,,,,,,,,,,,,ccc,,,ccccc,,                              "+                                                  
"                                                                            ,cTcccccc,,,,,,,,,,,,,,,,,,,,,,,,,,,cccc,                                 "+                                                  
"                                                                            ,TTccccTcc,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                    "+                                                  
"                                                                           ,csTcccssscc,,,,,,,,,,,,,,,,,,,,,                                          "+                                                  
"                                                                           ,,TTcccccccc,,, ,,,,,,,,,,,,,                                              "+                                                  
"                                                                            ,cTccccccc,,,,,,, ,,,,,,,,,                                               "+                                                  
"                                                                            ,cTTccccc,,,,,,,,, ,,,,,,,,                                               "+                                                  
"                                                                             ,cccccccc,,,,,   ,,,,,,,,                                                "+                                                  
"                                                                              ,ccccscc,,,,,  ,,,,,,,,,                                                "+                                                  
"                                                                                ,cccccc,,,,   ,,,,,,,                                                 "+                                                  
"                                                                                ,ccsccc,,,,,,,,,,,,,,                                                 "+                                                  
"                                                                                ,cccccc,,,,,,,,,,,,,,                                                 "+                                                  
"                                                                               ,cTcccc,,,,,, ,,,,,,,                                                  "+                                                  
"                                                                              ,cTTTcccc,,,, ,,,,,,,,,                                                 "+                                                  
"                                                                                ,Tsccc,,,,,,,,,,,,,,,                                                 "+                                                  
"                                                                                 ,Tsccc,,,,,,,,,,,,,,                                                 "+                                                  
"                                                                                 ,ccc,,,,,,,,,,,,,,c,                                                 "+                                                  
"                                                                                 ,cc,,,,,,,,,,,,,cCc,                                                 "+                                                  
"                                                                                 ,ccccc,,,,,,,ccTsc,                                                  "+                                                  
"                                                                                  ,TACCCCCCCCsc,,                                                     "+                                                  
"                                                                                   ,,,,,,,,,,,                                                        ";                                              

                                                                 
 cat2 = "                                                                                                                    ,cARCc              "+                                                                
"                                                      ,sRRCc,                             ,                     ,,CRRRRRRRA,                          "+                                                  
"                                                     cRRRRRRRRRT,              ,,,,,,,,,,,,,,, ,,,,,,,,, ,   ,,ARRRRRRRRRATc                          "+                                                  
"                                                     ,CRRRRRRRRRRTc,        ,,,,,,,,,,,,,,,,,,,,,,,,,,,,,   ,TRRRRRRRRRCccc,                          "+                                                  
"                                                      ,ARRRRRRRRRRRRT,,    ,,,,,,,,,,,,,,,,,,,,,,,,,,,    ,TRRRRRRARRRRCcc,,                          "+                                                  
"                                                       ,TcccARRRRRRRRRRC,     ,,,,,,,,,,,,,,,,,,,,,    ,sRRRRRRRRRRRRAsc,,,,                          "+                                                  
"                                                       ,cccccTARRRRRRRRRRAcc,,,,,,,,,,,,,,,,,,,,,, ,,cCRRRRRRRRRRRRRTcc,,,,,                          "+                                                  
"                                                        ,cTcc,cTRRRRRRRRRRRRA,  ,,,,,,,,,,,,,,,,, ,,cRRRRRRRRRRRAcccc,,,,cc                           "+                                                  
"                                                         cCTc,,ccARRRRRRRRRc,, ,,,,,,,,,,,,,,,   ,,,,,,cCRRRRRATcccc,,,,cT,                           "+                                                  
"                                                          cTTc,,,csARRRRRC,,,,,,,    ,,   ,,,   ,,,,,,,,,,cTRCccccc,,,,,cT,                           "+                                                  
"                                                          ,cCCcc,cccTAscc,,,,,,, ,     ,   ,     ,,,,,,,,,,,,,cc,,,,,,,cc,                            "+                                                  
"                                                            ,TCTcccccccc,,,,,,,   ,   ,,, ,,,   ,,,,,,,,,,,,,,,,,,  ,,cc,                             "+                                                  
"                                                              cCCTsccccc,,,,,,,,,,         ,,, ,,,,,,,,,,,,,,,,,,,,,,cc,                              "+                                                  
"                                                               ,ccccsccccc,,,,,,,,,     ,     ,,,,,,,,,,,,,,,,,,,,ccsc,                               "+                                                  
"                                                                 ,cscccc,c,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,c,,                               "+                                                  
"                                                                 ,Tsscccc,cc,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,                             "+                                                  
"                                                               ,cTsscccccc,c,ccc,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,c,,                            "+                                                  
"                                                              ,cCTccccscccccc,ccc,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,                           "+                                                  
"                                                              cCsccccccccccccc,ccc,cc,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,cc,                          "+                                                  
"                                                              cTscccccccccccccc,ccccc,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,c,,,                        "+                                                  
"                                                            ,csTcccccccTCAAARAcccccccccc,c,cc,,,,cARAs,,,,,,,,,,,,,,,,,,,,,,,,,                       "+                                                  
"                                                           ,CRCssccccccTRRRTCRRCccccccccccccc,sARRARRRRACc,,,,,,,,,,,,,,,,,,,,c,,                     "+                                                  
"                                                            ,,ccTTcccccCRRRCCRRRTccccccc,cccccARC,,cRRRRRT,,,,,,,,,,,,,,,,,,,,,,,                     "+                                                  
"                                                               ,sTTsscccsARRRRRRCc,,,,,,,,,,,cARRCARRRRRA,,,,,,,,,,,,,,,,,,,,                         "+                                                  
"                                                                ,,cCTTcc,cccARRs,,,,,,,,,,,,,,,cTRRRRRc,, ,,,,,,,,,,,,,ccc,,                          "+                                                  
"                                                                   ,cTCscc,,cc,,,,,,,,, ,,,,,    ,,,,,   ,c,,,,,,,ccTsc,,                             "+                                                  
"                                                                     ,cTTTccc,,,,,,,,,,, ,,,,, ,     ,,,cc,,,,ccsCTc,,                                "+                                                  
"                                                                       ,cTCTscc,c,,,,,CRC,,,,,,,,,,,,,c,,cccsTTCc,                                    "+                                                  
"                                                                         ,cTTTcccccc,,cCc,,,,,,,,,,,,ccssTTTTsc,,                                     "+                                                  
"                                                                           ,cTCTscccccccc,ccccccccccccccsssc,,,,,,                                    "+                                                  
"                                                                             ,cTTTTTsTTTccsscscscscsTTscc,,,,,,,,,,                                   "+                                                  
"                                                                                 ,cccccsTsTTTcccc,,,,,,,,,,,,,,,,,,,                                  "+                                                  
"                                                                             ,    ,cc,         , ,,,,,,,,,,,,,,,,,,,                                  "+                                                  
"                                                                          ,,,,,,,,,,c,,       , ,,,,,,,,,,,,,,,,,,,,                                  "+                                                  
"                                                                         ,,,,csTTc,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                 "+                                                  
"                                                                        ,,ccTsccTcccc,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                 "+                                                  
"                                                                        ,cCCccccccccc,,, ,,,,,,,,,,,,,,,,,,,,,,, ,,,                                  "+                                                  
"                                                                         ,sCTsTTscc,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                 "+                                                  
"                                                                           ,sCTc,,cc,,,,,,,,,,,,,,,,,,,,,,,,cc,,,,,,,                                 "+                                                  
"                                                                             ,,  ,cc,  ,,,,,,,,,,,,,,,,,,,,,ccc,,,,,                                  "+                                                  
"                                                                                ,,,c,, ,,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                  "+                                                  
"                                                                                ,,c,,,, , ,,,,,,,,,,,,,,,,,,,,,   ,                                   "+                                                  
"                                                                                ,c,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,  ,,,,,c,,                        "+                                                  
"                                                                                ccc,,,,,,,,,, ,,,,,,,,,,,,,,,,ccc,,,,,,,ccc,,                         "+                                                  
"                                                                              ,cccc,,,,,,,,,,,,,,,,,,,,,,,,,  ,,cccc,,,,,,,                           "+                                                  
"                                                                              cTsc,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,c,,                             "+                                                  
"                                                                             ,cscccc,,,,,,,,,,,,,,,,,,,,,,,,,c,c,,,,,,,,                              "+                                                  
"                                                                            ,cccccccccccc,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                 "+                                                  
"                                                                           ,cccccccccssssccc,,,,,,,,,,,,,,,,,,,,,,,                                   "+                                                  
"                                                                         ,,ccccccccccccTTcc,,,, ,,,,,,,,,,,,,,,,,,                                    "+                                                  
"                                                                         ,ccccccccccccccc,,,,,,,,,,,,,,,,,,,,,                                        "+                                                  
"                                                                         ,ccccccccc,c,cc,,,,,,,,  ,,,,,,,,                                            "+                                                  
"                                                                         ,cccscccccc,,cc,,,,,,,,,,,,,,,,,,                                            "+                                                  
"                                                                          ,cTsccccccc,ccc,,,, , ,,,,,,,,,                                             "+                                                  
"                                                                          ,,cccccccc,cccc,,,,,   ,,,,,,,,                                             "+                                                  
"                                                                            ,cccccc,ccccc,,,,,, ,,,,,,,,                                              "+                                                  
"                                                                              ,ccc,,ccccc,,,,,,,,,,,,,,,                                              "+                                                  
"                                                                               ,,c,,ccc,,,,,,,,,,,,,,,,                                               "+                                                  
"                                                                               ,ccccsccc,,,,,, ,,,,,,,,                                               "+                                                  
"                                                                              ,cTTscsccc,,,,, ,,,,,,,,                                                "+                                                  
"                                                                               ,cTTTcccc,,,,,,,,,,,,,,                                                "+                                                  
"                                                                                 ,ccccc,,,,,,,,,,,,,,,                                                "+                                                  
"                                                                                  ,ccc,,,,,,,,,,,,,,,,                                                "+                                                  
"                                                                                  ,ccc,,,,,,,,,,,,cc,                                                 "+                                                  
"                                                                                 ,cTCCcc,,,,,,,,cCTc,                                                 "+                                                  
"                                                                                  ,,cccTCCTcsTCcc,,                                                   "+                                                  
"                                                                                       ,,,,c,,,,                                                      ";                                                 

                                          
 cat3 = "                                                                                                                   cCAs,                "+                                                                 
"                                                                                                              ,TRRRRRRRc,                             "+                                                  
"                                                   ,ARRRAc,                     , ,,,,,,,,,   ,,,,,        ,cTRRRRRRRRACc                             "+                                                  
"                                                  cRRRRRRRRRT,,            ,,,,,,,,,,,,,,,,, ,,,,,,,,,   ,TRRRRRRRRRTccc,                             "+                                                  
"                                                  ,ARRRRRRRRRRRT,     ,,,,,,,,,,,,,,,,,,,,,,,,,,,,,    ,cRRRRRRARRRRT,c,,                             "+                                                  
"                                                   cRRRRRRRRRRRRRRC,     ,,,,,,,,,,,,,,,,,,,,,,,     ,sRRRRRRRRRRRCc,,,,,                             "+                                                  
"                                                    cTcccARRRRRRRRRRAc,,,  ,,,,,,,,,,,,,,,,,,,,,, ,cRRRRRRRARRRRAcc,,,,,,                             "+                                                  
"                                                    ,sccccTRRRRRRRRRRRRRCc,, ,,,,,,, ,,,,,,,,, ,,cRRRRRRRRRRRRRTccc,,,c,                              "+                                                  
"                                                     ,Tsc,ccccARRRRRRRRRRT, ,,,,,,,,,,,,,,,     ,,cccARRRRRRRCccc,,,,cs,                              "+                                                  
"                                                     ,cCcc,ccccTRRRRRRRA,, ,,,,, , , , , ,   ,,,,,,,,,ccTRRRcccc,,,,,cc,                              "+                                                  
"                                                      ,cCcc,,ccccCRRCc,,  ,,, ,         ,,,  ,,,,,,,,,,,,,,ccc,,,,,,csc                               "+                                                  
"                                                       ,TCTc,,cccccccc,, ,,,     , ,,, ,,,   ,,,,,,,,,,,,,,,,,,  ,,ccc                                "+                                                  
"                                                         ,TCTcccccccc,,,,,,,,,,           , ,,,,,,,,,,,,,,,,,,, ,,cc,                                 "+                                                  
"                                                           csCTccccccc,,,,,,,,,,,,     , ,,,,,,,,,,,,,,,,,,,,,,,ccc,                                  "+                                                  
"                                                             ,ccscccc,,,,,,,,,,,,,,   ,,,,,,,,,,,,,,,,,,,,,,,,,,cc,                                   "+                                                  
"                                                              ,ccTcccccc,,,,,,,, ,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                  "+                                                  
"                                                              ,cscccc,,cccc,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                "+                                                  
"                                                            ,csTcccccccc,ccc,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,c,,                              "+                                                  
"                                                           ,cCTcccccccccc,c,c,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,cc,                             "+                                                  
"                                                           cTscccccccccccc,c,c,ccc,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,cc,,                           "+                                                  
"                                                          ,TCcccccccccccATccccccccc,,,,,,,,,,,,cTCc,c,,,,,,,,,,,,,,,,,,,,,,,                          "+                                                  
"                                                         ,cTscccccccTAARRRRACccccccccc,ccc,,cARRRRRAAT,,,,,,,,,,,,,,,,,,,,,,,,                        "+                                                  
"                                                        ,TATscccccccARRAc,CRRcccccccccc,cccCRAc,cTRRRRRc,,,,,,,,,,,,,,,,,,,,,,                        "+                                                  
"                                                         ,ccsTcccccccCRRTTCRRRc,,,,,,,,,,,,RRRCTTARRRRC,,,,,,,,,,,,,,,,,,,                            "+                                                  
"                                                            cTCsscccc,cCRRRRRAc,,,,,,,,,, ,,cTRRRRRRc,, ,,,,,,,,,,,,,,c,,,                            "+                                                  
"                                                             ,cTTTsccc,,cccc,,,,,,,    , ,    ,,,c,,   ,,,,,,,,,,csTc,,                               "+                                                  
"                                                                ,cCTTsccc,,,,,,,,,,,,   , ,         ,,cc,,,,,csTTc,,                                  "+                                                  
"                                                                  ,cTTTTcccc,c,,,,,,,c,, ,,,,, ,  ,,,,,,,ccTTCsc,                                     "+                                                  
"                                                                    ,cTTTsscc,c,,,,cARA,,,,,,,,,,,,,ccccTTCs,,                                        "+                                                  
"                                                                       ,sCsTcccccc,c,c,,,,,,,,,,,ccccccTTcc,,                                         "+                                                  
"                                                                         ,TTTsscTsTsccccccccccscssTTTTsc,,,,,,,                                       "+                                                  
"                                                                          ,ccssscscTsTTTTTTTTTTTTTcc,,,,,,,,,,,,                                      "+                                                  
"                                                                         ,,,,,ccc,,,,,ccccc,,,,,,,,,,,,,,,,,,,,,,                                     "+                                                  
"                                                                         ,,,,,,cc,,,,,,        ,,,,,,,,,,,,,,,,,,                                     "+                                                  
"                                                                         ,c,,,,,cc,,,,,,, ,,, ,,,,,,,,,,,,,,,,,,,                                     "+                                                  
"                                                                         ,cc,,,,,c,,  ,,,,,,,,,,,,,,,,,c,,,,,,,,,,                                    "+                                                  
"                                                                         ,cc,,,,ccc,  ,,,,,,,,,,, ,,,,ccccc,,,,,,,                                    "+                                                  
"                                                                        ,,cc,,,,csc,,, ,,,,,,,,, , ,,,,cc,,,,,,,,,                                    "+                                                  
"                                                                        ,,,,,,,,ccc,,,, ,,,,,,,,,,,,,,,,,,,,,   ,,                                    "+                                                  
"                                                                         ,,,,,,,,ccc,,,, ,,,,,,,,,,, ,,cc,,,,, ,,,                                    "+                                                  
"                                                                         ,,,,,,,,cccc,,,, ,,,,,,,,,,, ,cs,,,,,,,,,                                    "+                                                  
"                                                                         ,cc,,,,,ccc,,,,,,,,,,,,,,,,  ,cc,,, ,,,,                                     "+                                                  
"                                                                         ,c,,,,,ccccc,,,,,,,,,,,,,,,, ,,cc,,,,,                                       "+                                                  
"                                                                         ,c,,,cTsccc,,,,,,,,,,,,,,,,,, ,cCs,,,                                        "+                                                  
"                                                                        ,,,,,cccscccc,,,, ,,,,,,,,,,,,  ,cTsc,,                                       "+                                                  
"                                                                       ,cc,cc, ,cTcc,,,,,,,,,,,,,, ,,,,, ,,ccc,                                       "+                                                  
"                                                                       ,TCc,,   cTccc,,,, , , , ,,,,,,,,, ,,,,                                        "+                                                  
"                                                                        ,,      cCcc,,,,,,,,,,,,,,,,,,,,,,,,,,,                                       "+                                                  
"                                                                               ,ccccccc,,,,,,cc,,,,,,,,,,,,,,,,                                       "+                                                  
"                                                                              ,cccccccc,,,,ccc,,,,,,,,,  ,,,,,,                                       "+                                                  
"                                                                             ,ccc,,,,,,,cccsTc,,,,,,,,,  ,,,,,,                                       "+                                                  
"                                                                            ,cc,,,,,,,,,,ccTcc,,,,,,,, ,,,,,,,,                                       "+                                                  
"                                                                            ,cc,,,,,,,,,,,cccc,,,,,,,   ,,,,,,                                        "+                                                  
"                                                                            ,cc,,,,,,,,,,,,cccc,,,,,,  ,,,,,,,                                        "+                                                  
"                                                                            ,cc,,,,,,,,,,,,,ccccc,,,,  ,,,,,,,                                        "+                                                  
"                                                                            ,cc,,,,,,,,,,,,ccccc,,,,,,,,,,,,,                                         "+                                                  
"                                                                            ,cc,,,,,,,,,,,ccccc,,,,,,,,,,,,,,                                         "+                                                  
"                                                                              ,c,,,,,,,,cccccc,,,,,, ,,,,,c,                                          "+                                                  
"                                                                              ccc,,,,,,,ccccccc,,,,,,,,,,,,,                                          "+                                                  
"                                                                            ,cscc,,,,,,cccccc,,,,,,,,,,,,c,,                                          "+                                                  
"                                                                            ,cTCTcc,,cccc,c,,,,,,,,,,,,,cc,                                           "+                                                  
"                                                                              ,TCCcccTscc,,,,,,,,,,,,,,,c,                                            "+                                                  
"                                                                                ,cTTCCCcc,,,,,,,,,,,,,,,c,                                            "+                                                  
"                                                                                  ,cc,cscc,,,,,,,,,,,ccc,,                                            "+                                                  
"                                                                                       ,cTc,,,,,,,,,ccsc,                                             "+                                                  
"                                                                                        ,csccccccsTCcc,                                               "+                                                  
"                                                                                          ,,,,,,,,,,,                                                 ";

                                          
 cat4 = "                                                                                                                ,,,                     "+                                                                 
"                                                                                                           ,TARRRRC,                                  "+                                                  
"                                                                                                        ,cCRRRRRRRRT,                                 "+                                                  
"                                                cAC,,                              ,,,,,,,, ,,,       ,CRRRRRRRRRTTc,                                 "+                                                  
"                                              ,CRRRRRRRC,,               ,,,,,,,,,,,,,,,,,,,,,,,,,   sRRRRRRRRRCcccc,                                 "+                                                  
"                                              cRRRRRRRRRRRAc,     , ,,,,,,,,,,,,,,,,,,,,,,,,,,    ,cRRRRRRRRRRRTc,c,                                  "+                                                  
"                                              ,ARRRRRRRRRRRRRRc,     ,,,,,,,,,,,,,,,,,,,,,,,    ,TRRRRRRARRRRAcc,,c,                                  "+                                                  
"                                               ,ccARRRRRRRRRRRRRRc,,,,, ,,,,,,,,,,,  ,,,,,, ,,cRRRRRRRRRRRRAscc,,,cc                                  "+                                                  
"                                                ,csccTRRRRRRRRRRRRRRAc,,,,,,,,,,,,,,,,,, ,,,,,CRRRRRRRRRRRTcc,,,,,cc                                  "+                                                  
"                                                 cTccccccARRRARRRRRRRc,,,  ,,,,,,,,,,,,,  ,,,,,,,sRRRRRRAcccc,,,,,cc                                  "+                                                  
"                                                  cTcc,cccTRRRRRRRRRT,         ,,,   ,   ,,,,,,,,,,,,cccccc,,,,,,sc,                                  "+                                                  
"                                                  ,TCcc,,cccCRRRRTc,, ,,,,,         ,,,   ,,,,,,,,,,,,,,,,,,, ,,cc,                                   "+                                                  
"                                                   ,cCsc,ccccsAAcc,, , ,,,   ,   ,   ,,  ,,,,,,,,,,,,,,,,,,   ,cc,                                    "+                                                  
"                                                    ,cTTcc,ccccccc,,,,,,,,,         ,,,,,,, ,,,,,,,,,,,,,,,,,,cc,                                     "+                                                  
"                                                      ,cTTcccccscc,,,,,,,,,,,,   ,     ,,, ,,,,,,,,,,,,,,,,cccc,                                      "+                                                  
"                                                        ,cTTscccccc,,,,,,,,,,,, ,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                      "+                                                  
"                                                          ,ccccccccccc,,,,,,,,,,,,,,,, ,,,,,,,,,,,,,,,,,,,,,,,,c,,                                    "+                                                  
"                                                           cscscc,,,cc,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                   "+                                                  
"                                                          ,TTccccc,c,c,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,cc,                                 "+                                                  
"                                                         ,ssscccccccc,ccc,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,cc,,                               "+                                                  
"                                                        ,TTscccccccccc,c,ccc,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,c,,                              "+                                                  
"                                                       ,TTcccccccccccccc,,ccc,,,,,,,,,,,,,cTRRRAACc,,,,,,,,,,,,,,,,,,,,,,,                            "+                                                  
"                                                       ,TTcccccccccCRRRRAc,,ccc,,ccc,c,c,sARCCARRRRC,,,,,,,,,,,,,,,,,,,ccc,                           "+                                                  
"                                                     ,csTccccccccCRRAccCRRAc,,c,,,,,,,,cARRc ,cRRRRRc,,,,,,,,,,,,,,,,,,,,                             "+                                                  
"                                                    ,cAATTcccccccTARRTTARRRc,,,,,,,,,,,,cRRRAARRRRCc,,,,,,,,,,,,,,,,,,,                               "+                                                  
"                                                      ,,,cTcscccc,ccRRRRRRT,,,,,, ,,,,,   ,cRRRAc,,  ,,,,,,,,,,,,cc,,,                                "+                                                  
"                                                         ,sCTTsccc,,,cccc,,,,,,, ,     ,     ,,,   ,,,,,,,,,,csTc,,                                   "+                                                  
"                                                           ,cTCTTcccc,,,,,,,,,,       ,,,       ,,,,,,,,,cTCCs,                                       "+                                                  
"                                                              ,sTCTTsscc,,,,,,,,,csc,,,, ,,,   ,,,,,,ccsTCTc,                                         "+                                                  
"                                                                ,cTTTTTcccc,,,,,,CRC,,,,,,,,,,,,,,ccTTTTs,                                            "+                                                  
"                                                                   ,cTTTcscccccc,c,,,,,,,,,,,ccccccsTTcc,,,                                           "+                                                  
"                                                                     ,ccTcscssTsccccccccccccscccsTTcc,,,,,,,,                                         "+                                                  
"                                                                       ,cTcccscTsTTTTTTTTTTTTTscc,,,,,,,,,,,,                                         "+                                                  
"                                                                       ,sTccc,,,,cccccccc,,,,,,,,,,,,,,,,,,,,,                                        "+                                                  
"                                                                       ,sTcTcc,,,,,,,,,,    ,,,,,,,,,,,,,,,,,,,                                       "+                                                  
"                                                                       ,ccccsc,,,,,,, ,,,,,,,,,,,,,,,,,,,,,,,,,                                       "+                                                  
"                                                                       ,cc,,cc,,,,,, ,,,,,,,,, ,,,,cccc,,,,,,,,                                       "+                                                  
"                                                                        ccc,ccc,,   ,,,,,,,,,,,  ,,,ccc,,,, ,,,                                       "+                                                  
"                                                                        ,ccccTsc,, , ,,,,,,,,,  ,,,c,,,,,    ,,,                                      "+                                                  
"                                                                        ,cccccTcc,,,, ,,,,,,,,, ,,,,,,, ,,,,,,,                                       "+                                                  
"                                                                        ,cccccscc,,,,,,, ,,,,,,,,,   ,,,,, ,,,                                        "+                                                  
"                                                                         ,ccccscccc,,,,,,,,,, ,ccc,,, ,,, ,,,                                         "+                                                  
"                                                                         ,cccssccc,,,,,,,, ,,, ,,cc,,,,,,ccc,                                         "+                                                  
"                                                                         ,c,,cTccccc,,,,,,,,,,  ,,ccc,,,cc,,,,                                        "+                                                  
"                                                                         ,,,,ccccccc,,,,,,,,,,,, ,,,cccc,,,,,,                                        "+                                                  
"                                                                         ,sc,,csTcccc,,,,,, ,,,,,   ,,,,, ,,,,,                                       "+                                                  
"                                                                         ,,c,,cTTccc,,,,,,  ,,,,,,     ,,,,,,,,,                                      "+                                                  
"                                                                              ,cTcccc,,,,,,,,,, ,,,,,,,,,,,,,,,,                                      "+                                                  
"                                                                              ,ccscc,,,,,,,,,,,,,,,,,,,, ,,,,,,,,                                     "+                                                  
"                                                                               ,cTccc,,,,,,,,,,,,cc,,,  ,,,,,,,,,                                     "+                                                  
"                                                                                cCccc,,,,,,,,,,ccc,,,,,,,,,,,,,,,                                     "+                                                  
"                                                                                ccc,,,,,,,,,,,ccc,,,, ,,,,,,,,,,,                                     "+                                                  
"                                                                               ,cTc,,,,,,,,,,ccccc,,,    ,,,,,,,,,,                                   "+                                                  
"                                                                               ,cc,,,,,,,,,,,,csc,,,,,   ,,,,,,,,,,,,                                 "+                                                  
"                                                                              ,scc,,,,,,,,,,,,,ccc,,,,,  ,,,,,,,,,,,,,                                "+                                                  
"                                                                              ,TTc,,,,,,,,,,,,,,ccc,,,,   ,,,,,,,,,,,,                                "+                                                  
"                                                                               ,ccc,,,,,,,,,,,,,,ccc,,,, , , ,,,,,,,,,,                               "+                                                  
"                                                                                ,cc,,,,,,,,,,,cc,,cTTc,,,,,   ,,,,,,,,c,                              "+                                                  
"                                                                               ,ccc,,,,,,,,,,,cc,,,cTTcc,,,,,,,,,,,,,cc,                              "+                                                  
"                                                                             ,csccc,,,,,,,,,,,,,c,  ,cscc,,,,,,,,,,,cc,                               "+                                                  
"                                                                            ,CTc,,,,,,,,,,,,,,ccc,   ,cTccc,,,,, ,,,,,                                "+                                                  
"                                                                            ,TCcc,,,,,,,,,,,,cc,,,    ,sCcc,,,,,,,cc,                                 "+                                                  
"                                                                             ,cCcc,,,,,,,,,c,,,        ,sTcssTsscsc,                                  "+                                                  
"                                                                              ,cTsccc,,,ccc,,           ,sCsccccc,,                                   "+                                                  
"                                                                                cTCCCTcccc,,             ,,                                           "+                                                  
"                                                                                  ,,,,,,,                                                             ";                                                  
/*</PRE></DIV>
<DIV id=ca"t5><PRE>/*
                                         
                                                                                                            ,sCc,                                                                                       
                                                                                                         ,CRRRRRA,                                                                                      
                                                                                                      ,CRRRRRRRATc,                                                                                     
                                               ,,,                                              ,   ,TRRRRRARRRTcc,                                                                                     
                                              cRRRRRRCc,                       ,,,,,,,,,,,,,,,    ,sRRRRAARRRAcccc,                                                                                     
                                             ,CRRRRRRRRRRs,           ,,,,,,,,,,,,,,,,,,,,,,    ,cARRRRARRRATcc,,,,                                                                                     
                                             ,sRRRRRRRRRRRRRc,       ,,,,,,,,,,,,,,,,,,,,,,   cRRRRRAAARRRTcc,,,,c,                                                                                     
                                              ,cscCRRRRRRRRRRRRC,,,,,,,,,,,,,,,,,   ,,,,, ,,cRRRRRRAAARRCcccc,,,,,,                                                                                     
                                               ,sccccTARRRARRRRRRRRT,,,,,,,,,,,,,,,,,,  ,, ,cRRRRRRRRRAcccc,,,,,,,                                                                                      
                                               ,cccccccCRRRAAAARRRRRT,            ,,,   ,,,,,,,,CRRRRRRccc,,,,,cc,,                                                                                     
                                                ,cTc,,,ccARRRAARRRC,   ,,,         ,,    ,,,,,,,,,,,cccc,,,,,,,cc,                                                                                      
                                                 ,scc,,,ccTARRRRRc,   ,     , ,   ,,,   ,,,,,,,,,,,,,,,,,,, ,,cc,                                                                                       
                                                  ,Csc,,,,,cTRRT,,  ,,       , ,   ,,, ,,,,,,,,,,,,,,,,,,   ,cc,                                                                                        
                                                  ,cCTc,,,ccccc,,,,,,,,,,,            ,,, ,,,,,,,,,,,,,,,,,,cc,                                                                                         
                                                    ,cCTcc,ccccc,,,,,,,,,,,,   , ,   ,,,,,,,,, ,,,,,,,,,,,,cc,                                                                                          
                                                      ,cTsccccccc,,,,,,,,,, ,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                                           
                                                        ,csscccc,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                                         
                                                          ccsccc,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                                       
                                                         ,cccccccc,c,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                                      
                                                        ,cTcccccc,c,c,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,c,,                                                                                    
                                                       ,cscccccccccc,,,,,,,,,,,,,,,,,,,,,cCAAAc,,,,,,,,,,,,,,,,,,,,c,,                                                                                  
                                                      cTTccccccccTAARCc,,,,,,,,,,,,,,,,,CRRARRRAACc,,,,,,,,,,,,,,,,,,,,,                                                                                
                                                      cTcccccccsARRCTCACc,,,,,,,,,,,,,TRRc  cARRRRs,,,,,,,,,,,,,,,,,,,,c,,                                                                              
                                                      cccccccccCRRA,,,ARRc,,,,,,,,,,,,sRRCsTCsCRRs,,,,,,,,,,,,,,,,,,,,,,,                                                                               
                                                   ,cTTTccccccccTRRRAARRRC,,,,,, ,,,,,,,cRRRRRAs,  ,,,,,,,,,,,,,,,,,,,                                                                                  
                                                   ,cTTTscccccc,,ccTRRRRc,,,,,            ,,cc,   ,,,,,,,,,,,,,,ccc,,                                                                                   
                                                       ,cssccccccc,,,cc,,,,,,,      ,,          ,cc,,,,,,,cccsc,,                                                                                       
                                                        ,sCTscccccccc,,,,,,,,,,,,,  ,,, ,     ,,,,,,,,ccTTCsc,                                                                                          
                                                          ,,cTTTssccccc,,,,,,,,TRA,  , , ,,  ,,,,ccccccscc,                                                                                             
                                                             ,csTTTscccccc,,,,,,c,,,,,,,,,,,,,,,,ccccsTc,                                                                                               
                                                                 ,cTTTsscccc,,,,,,,c,c,c,ccc,ccccccTcc,,,,                                                                                              
                                                                   ,csTcccsccccccccccccccccccccsTsc,,,,,,,,                                                                                             
                                                                       ,cTcccssTsTsTsTTTsTsTsscc,,,,,,,,,,,,                                                                                            
                                                                       ,ssccccccccccscccc,,,,,,,,,,,,,,,,,,,                                                                                            
                                                                       ,cTcc,,,,,, , , ,,,,,,,,,,,,,,,,,,,,,,                                                                                           
                                                                        ,ccc,,,,,,, ,,, ,,, ,,,,,,ccc,,,,,,,,                                                                                           
                                                                        ,ccc,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                                           
                                                                        cssc,,,,,,, ,,,,, ,,,,,     , , , ,,,                                                                                           
                                                                       ,csccc,,,,,,,,,,,,, ,c,,,   ,   ,,,,,                                                                                            
                                                                      ,,ccccc,,,,,,,,,,,, ,,cc,,,,,,,,,,,,,,                                                                                            
                                                                      ,,cccccc,,,,,  ,,,,, ,,,cccc,,,ccccc,,                                                                                            
                                                                       ,cc,,ccc,,,,,, ,,,,,   ,,ccccccccc,,,                                                                                            
                                                                       ,cTcTTscc,,,,,, ,,,,,     ,,,,,,  ,,,,                                                                                           
                                                                        ,cssTTccc,,,,,, ,,,,,,, ,     ,,,,,,,,                                                                                          
                                                                            ,ccccc,,,,,, ,,,,,,,,, ,,,,,,,,,,,,                                                                                         
                                                                             ,csccc,,,,,,,, ,,,,,,,,,,,,,,,,,,,,,                                                                                       
                                                                             ,cTcccc,,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                                       
                                                                              ,TTcccc,,,,,, ,,,,,,,,,,,,,,,,,,,,,                                                                                       
                                                                               csscc,,,,,,,,,,,, , ,,,,,,,,,,,,,,,                                                                                      
                                                                               ,cTccc,c,,,,,, ,,,,,,,,,,, ,,,,,,,,,                                                                                     
                                                                                ,ccccc,,,,,,,,,,,,,ccc,,,, ,,,,,,,,,                                                                                    
                                                                                 ,Tscc,,,,,,,,,,,csscc,,,   ,,,,,,,,,                                                                                   
                                                                                 ,csc,,,,,,,,,,ccccccc,,,, ,,,,,,,,,,,,                                                                                 
                                                                                 ,ccc,,,,,,,,,,ccccccc,,,   ,,,,,,,,,,,,,                                                                               
                                                                                 ,csc,,,,,,,,,,,,c,ccc,,,,,  ,,,,,,,,,,,,,,                                                                             
                                                                                 ,Tsc,,,,,,,,,,,,, ,ccc,,,,     ,,,,,,,,,,,,                                                                            
                                                                                ,cssc,,,,, ,,,,,,,  ,csc,,,,,    , ,,,,,,,,,                                                                            
                                                                              ,,ccccc,,,, , ,,,,,,   ,ccccc,,,, ,,,,,,,,,,,,,                                                                           
                                                                              ,cc,,,,c,,,,,, ,,,,,     ,cTTccc,,,,,,,,,,,,,,,                                                                           
                                                                             ,cc,,,,,,,,,,,,,,,,,,       ,sTscc,,,,,, ,,,,cc,                                                                           
                                                                            ,cc,,,,,,,,,,,,,,,,,,         ,Tsscc,,,,,, ,,cc,                                                                            
                                                                           ,cTc,,,,,,,,,,,,,,,,,           ,ssccc,,,,,,,c,,                                                                             
                                                                            ,cTc,,,,,,,,,,,,,,,,           ,cCTTTTsccscc,                                                                               
                                                                              ,ss,,,,,,,,,,cc,              ,,cccccccc,,                                                                                
                                                                               ,cscccccccccc,                                                                                                           
                                                                                 ,c,,,,,c,,                                                                                                                                                        
</PRE></DIV>
<DIV id=cat6><PRE>
                                           
                                                                                                            ,TRRRRT,                                                                                    
                                               ,TRRRs,,                            ,                    ,cARRRRRRRRc,                                                                                   
                                              ,ARRRRRRRRA,                ,,, ,,,,,,,,,,, ,,,,,   ,   ,ARRRRRRRRATTs,                                                                                   
                                              ,RRRRRRRRRRRAc,,         ,,,,,,,,,,,,,,,,,,,,,,,,,    ,TRRRRRRRRRRAccc,                                                                                   
                                               ,ARRRRRRRRRRRRRc     ,,,,,,,,,,,,,,,,,,,,,,,,,     ,sRRRRRRRRRRRTc,cc                                                                                    
                                               ,,cccARRRRRRRRRRAc,,,,,,,,,,,,,,,,,,,,,,,,,,,   ,TRRRRRRRRRRRRAc,,,cc                                                                                    
                                                ,cTccTRRRRRRRRRRRRRCc,, ,,,,,,,,, ,,,,,,,,, ,,CRRRRRRRRRRRRAscc,,,cc                                                                                    
                                                 cTccccccARRRRRRRRRRRs, ,,,,,,,,,,,,,,,, , ,,,TRRRRRRRRRRRTccc,,,,c,                                                                                    
                                                  cTscccccTARRRRRRRs,,  ,     ,,, ,,,     ,,,,,,,cARRRRRCcccc,,,,,c,                                                                                    
                                                  ,CCc,,,cccTRRRRT,,   ,   ,   ,     ,,  , ,,,,,,,,,cAATccc,,,,,,cc,                                                                                    
                                                   ,TCsc,,ccccACc,,   ,     , ,,, ,,,,,,,,,,,,,,,,,,,,,cc,,,,,,,cc,                                                                                     
                                                    ,sCCcc,cccccc,,,,,,,           ,,,,,,,,,,,,,,,,,,,,,,,   ,,cc,                                                                                      
                                                      ,sCsccccsc,,,,,,,,,,,           , ,,,,,,,,,,,,,,,,,,,,,,cc,                                                                                       
                                                        ,TCTcccc,c,,,,,,,,,, , , ,     ,,,,,,,,,,,,,,,,,,,,ccsc,                                                                                        
                                                         ,csTcccccc,,,,,,,,,,,,,,,,,,,, ,,, ,,,,,,,,,,,,,,,,cc,                                                                                         
                                                          ,cTccc,c,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                                        
                                                         ,scsccccc,,c,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,c,                                                                                      
                                                        ,TTscccccccc,c,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,c,                                                                                     
                                                       cTTscccsccccccc,,c,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,c,,                                                                                   
                                                      ,cTscccccccccccc,,,c,c,,,,,,,,,,,,,,,ccc,,,,,,,,,,,,,,,,,,,,,c,,                                                                                  
                                                      ,csccccccccTRRRRRCc,ccccc,,,,,,,,cCRRRRRRATc,,,,,,,,,,,,,,,,,,,,,                                                                                 
                                                    ,csTcccccccCRRRccTRRcc,c,c,,,,,,,c,TRRccTRRRRAc,,,,,,,,,,,,,,,,,,,,,,                                                                               
                                                   ,TRATTcccccccCRRCCARRRT,,,,,,,,,,,,ARAc,cARRRRRs,,,,,,,,,,,,,,,,,,,cc,,,                                                                             
                                                     ,,ccTsccccc,cCRRRRRAc,,,,,,,,,,,,,TRRRRRRRRC,,,,,,,,,,,,,,,,,,,,,                                                                                  
                                                        cTCsTcccc,,csTsc,,,,,,,         ,csCCTc,,  ,,,,,,,,,,,,,,,cc,,                                                                                  
                                                         ,cTCTsscccc,,,,,,,,,,      ,,           ,,c,,,,,,,,cccccc,                                                                                     
                                                            ,cTTTsscccc,,,,,,,,,    ,,, ,     ,,cc,,,,,,ccTCCs,,                                                                                        
                                                              ,cTCTsTscc,,,,,,,ARA, ,,,,,,  ,,,,,,,ccsTTTsc,,                                                                                           
                                                                ,cCTTscccccccccccc,,,,,,,,,,,,,,csTTTTTsc,                                                                                              
                                                                   ,sCCTsTccccc,,,cccccccccccccccssTsc,,,,,                                                                                             
                                                                     ,cTTTssTsTTTsccccscssTcTTTTTcc,, ,,,,,,                                                                                            
                                                                        cTcccscssTTTTTTTsTsTsccc,,,,,,,,,,,,,                                                                                           
                                                                        ,ccc,,,,,,,,c,,,,,, ,,,,,,,,,,,,, ,,,,                                                                                          
                                                                        ,ssc,,,,,,   , , ,,, ,,,,,ccc,,, ,,,,,                                                                                          
                                                                       ,cTc,,,,,,,,,,,,,,,, ,,,,,,,,,,     ,,                                                                                           
                                                                      ,ccccc,,,,,,,,,,,,,,  ,,,      , , ,,,,,                                                                                          
                                                                      ,cccccc,,,,,,,,,,,, ,,,,,,, , ,,,,,,,,c,                                                                                          
                                                                     ,ccccccc,,,,, ,,,,,,,,,cccc,,,,,,,,,cccc,                                                                                          
                                                                     ,csccc,,,,,,,, ,,,,,,,,,,ccTcc,,,,cssc,,                                                                                           
                                                                     ,cTTCc  ,,c,,,,,,,,,,,,   ,,ccc,,cccc,,,                                                                                           
                                                                      ,TAc,  ,ccc,,,,,,,,,,,,     ,,,,,,,,,,,,                                                                                          
                                                                       ,,,   ,ccc,,,,,,,,,,,,,,,,,   , ,,,,,,,,                                                                                         
                                                                             ,ccccc,,,,   ,,,,,,,,,,,,,,,,,,,,,,,                                                                                       
                                                                             ,cTccc,,,,,,,,,,,,,,,,,,, ,,,,,,,,c,                                                                                       
                                                                             ,cTccccc,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                                     
                                                                             ,cCTcccc,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                                     
                                                                              ,cTsccc,,,,,,,, ,,, ,,,,,,,,,,,,,,,,,,,                                                                                   
                                                                               ,cCcccc,,,,,,,,,,,,,,,ccc,,,,,,,,,,,,,,                                                                                  
                                                                                ,cTsccc,,,,,,,,,,,cccccc,,,   ,,,,,,,,                                                                                  
                                                                                 ,cTcc,,,,,,,,,,,ccccccc,,,, ,,,,,,,,,,                                                                                 
                                                                                  ,cTc,,,,,,,,,,cc,,,cc,,,,   ,,,,,,,,,,,                                                                               
                                                                                   cTcc,,,,,,,,,,c,,,ccc,,,,   ,,,,,,,,,,,                                                                              
                                                                                 ,csTccc,,,,, ,,,,,  ,TTc,,,,,    ,,,,,,,,,                                                                             
                                                                               ,cTcsTccc,,,, ,,,,,,,  ,csc,,,,,, ,,,,,,,,,,,                                                                            
                                                                              ,,cc,ccccc,,,,, ,,,,,,,   ,cccc,,,,,  ,,,,,,,,,                                                                           
                                                                              ,cc,,,,ccc,,,,,,,,,,,,,    cTTsc,,,,,,,,,,,,,,                                                                            
                                                                              ,,,,,,,,,,,,,,, , ,,,,,    ,ssccc,,,,,,,,,,,,,                                                                            
                                                                             ,,,,,,, ,,,,,,,,,,,,,,,      csc,,,,,,,,,,,,cc,                                                                            
                                                                            ,TT,, ,,,,,,,,,,,,,,,,,,      ,sccccc,,,,,,cssc,                                                                            
                                                                            ,csc,,,,,,,,,,,,,,,,,,,        cTTsTTTsTTTcc,,                                                                              
                                                                              ,cCc,,,,,,,,,,cc,,,           ,,,,,,,cc,,                                                                                 
                                                                                ,Tcc,,cccsTCs,                                                                                                          
                                                                                 ,ccc,,,c,,,,                                                                                                           
</PRE></DIV>
<DIV id=cat7>
<PRE>
                                         
                                                   ,CRRT,                                                            ,,,                                                                                
                                                  cRRRRRRRCc,,               ,,,,,,,,,,,,,,,,,,,,,,,            ,cCRRRRRA,                                                                              
                                                  TRRRRRRRRRRRT,          ,,,,,,,,,,,,,,,,,,, ,,,,,,,,,,,    ,cARRRRRRRRRC,                                                                             
                                                  ,sRRRRRRRRRRRRRc,    ,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,    cRRRRRRRRRRRCTC,                                                                             
                                                   ,cTccsARRRRRRRRRs,,,   , ,,,,,,,,,,,,,,,,,,,,,,,     ,,ARRRRRRRRRRAcccc,                                                                             
                                                    ,TccccTRRRRRRRRRRRc,,, ,,,,,,,,,,,,,,,,,,,,,,,    ,RRRRRRRARRRRRsccc,c,                                                                             
                                                    ,,TcccccCRRRRRRRRRRRRC,,,,,,,,,,,,,   ,,,,,,,,,,CRRRRRRRRRRRRRCcc,,,,,,                                                                             
                                                     ,cCc,,,csARRRRRRRRRRC,  ,,,,,,,,,,,,,,,,,,, ,cRRRRRRRRRRRRRAcccc,,cc,                                                                              
                                                      ,cCc,,,,cTRRRRRRTc,,, ,,,,,,,,,,,,,,,,,  ,,,,,,CRRRRRRRRRTccc,,,,cc,                                                                              
                                                       ,TCTc,,cccCRRTcc,,  ,,,                 ,,,,,,,,,,cAAcccccc,,,,,Tc,                                                                              
                                                         ,CCc,cccccccc,,,,, ,,,     ,,, ,,,,,,,,,,,,,,,,,,,cccc,,,,,,cTc,                                                                               
                                                           cCCcccccsc,,,,,,,     , ,,, ,,,,,,,,,,,,,,,,,,,,,,,,, ,,,ccc,                                                                                
                                                            ,cTTscscc,,,,,,,,,,         ,,,   ,,,,,,,,,,,,,,,,,,,,,cs,                                                                                  
                                                              ,Tcccccc,,,,,,,,,,     , , ,,, ,,,,,,,,,,,,,,,,,,,,ccc,                                                                                   
                                                              ,cscccc,ccc,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,c,,                                                                                   
                                                            ,csTcccccc,ccc,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                                  
                                                           ,TTTcccccccccccccc,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,cc,                                                                                 
                                                          ,CCccccccscccccc,ccc,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,cc,,                                                                               
                                                          csTccccccccccccccccccccc,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,ccc,                                                                              
                                                         ,csccccccccccccccccccccc,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,ccc,                                                                             
                                                       ,CACsccccccccTAAARRAccccccc,,c,c,c,c,,,ccccc,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                           
                                                       ,,ccCTcccccccCRRAsARRCcccccccccccccc,cCRRRRRRAT,,,,,,,,,,,,,,,,,,,,,,,,                                                                          
                                                           ,sTTcccccARRAAARRRccccccccccccccCRRA,,TRRRRAc,,,,,,,,,,,,,,,,,,,,c,,                                                                         
                                                             cTCTTcccsRRRRRRRT,,,c,,,,,,,,cRRA,,cRRRRRRc ,,,,,,,,,,,,,,,,,,,                                                                            
                                                               ,cTTcc,ccsARAc,,,,,,,,,,,,,,,cARRRRRRT,,,,,,,,,,,,,,,,,,cc,,                                                                             
                                                                 ,cTTccc,c,,,,,,,,,,,, , ,   ,ccccc,   ,,,,,,,,,,cccc,,                                                                                 
                                                                  ,,sTTsc,,,,,,,,,,,  ,,,,,,,       ,,ccc,,,,csTCTc,                                                                                    
                                                                    ,cTCsccc,c,,,,,cTc,,,,,,,,,, ,,cccc,,ccsTTc,,                                                                                       
                                                                      ,cTTscccc,c,cRRCc,,,,,,,,,,,ccccTsTTTsc,                                                                                          
                                                                        ,cTTcscccccccc,c,,,,,,,ccccccTsccc,,,,,                                                                                         
                                                                         ,TsccccTTTsTsTcscTsTcscccTTTc,,,,,,,,,                                                                                         
                                                                         ,cTcc,ccscssTTTTTsTcccc,,,,,,,,,, ,,,,,                                                                                        
                                                                         ,cccsc,,  ,,,,,,,     ,,,,,,,,,,,,,,,,,,                                                                                       
                                                                        ,,cccccc,, , , ,  ,,   ,,,,,,,,,,,,,,,,,                                                                                        
                                                                        ,ccc,,cc,,  , , ,,,,,,,,,,,,,,cc,,,,, ,,,                                                                                       
                                                                        ,c,,,ccT,,   ,,,,,,,,,,,,,,,,,ccc,,,,,,,                                                                                        
                                                                        cc,,,cccc,,,, ,,,,,,,,,,,,,,,,,cc,,,, ,,,                                                                                       
                                                                       ,cc,,,cssc,,,,, ,,,,,,,,,,,,,,,cc,,,, ,,,                                                                                        
                                                                       ,cc,,,cscc,c,,,,,,,,,,,,,,,, ,,ccc,,,,,,,                                                                                        
                                                                       ,cc,,,ccsccc,,,,,,,,,,,,,,,,,,,,cc,,,,,,,                                                                                        
                                                                       ,c,,,csTcccc,,,, ,,,,,,,,,,,,,,,cc,, ,,,                                                                                         
                                                                       ,cc,,,TTcccc,,,,,,,,,,,,,,,,,,,,,,,   ,                                                                                          
                                                                        ,,, ,cCcccc,,,,,,,,,,,,,,,,,, ,,,cc,,,,                                                                                         
                                                                             ccsccc,,,,, ,,,,,,,,,,,,, ,,ccscc,,                                                                                        
                                                                             ,cTccc,,,,,,,,,,,,,,,, ,,,,, ,,ccc,,                                                                                       
                                                                              cCccccc,,,,,,,,, , ,,,,,,,,,  ,,,,,,                                                                                      
                                                                              ,cccc,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                                     
                                                                              ,ccs,,,,,,,,,,,,,ccsccc,,,,,  ,,,,,,,,                                                                                    
                                                                               ,csc,,,,,,,,,,cccTTTTcc,,,,, ,,,,,,,,,,                                                                                  
                                                                                cTc,,,,,,,,,,cc,  ,scc,,,,,,  ,,,,,,,c,,                                                                                
                                                                               ,sTc,,,, ,,,,,,,,   ,ccc,,,,   ,,,,,,,,,,,                                                                               
                                                                               ,cTc,,, , ,,,,,,,,   ,Tcc,,,,,  ,,,,,,,,,,,                                                                              
                                                                               ,ccc,,,,,, ,,,,,,,    ,ccc,,,,,, ,,,,,,,,,,,                                                                             
                                                                               ,cTc,,,,, ,,,,,,,      ,ccc,,,,,,,, ,,,,,,,,,                                                                            
                                                                              ,ccccc,,,,,,,,,,,,,      ,cccc,,,,,,, , ,,,,,,                                                                            
                                                                             ,cTccc,,,,,,,,,,,,c,       ,CCTccc,,,,,,,,,,,,                                                                             
                                                                             ,ccc,,,,,,,,,,,,,,,,       ,cTTccc,,,,,,,,,,,,                                                                             
                                                                            ,cccc,,,,,,,,,,,,,,,         ,cTTscc,,,,,,,,,,                                                                              
                                                                            cCTcc,,,,,,,,,,,,,,           ,cTTc,,,,,,,,c,                                                                               
                                                                            ,cTTcc,,,,,,,,,ccc,             ,sTTsTTTsscc,                                                                               
                                                                              ,cTTcc,,,cccccc,               ,ccccc,c,,                                                                                 
                                                                                ,cTTccccc,,,                                                                                                            
                                                                                  ,cc,,                                                                                                                                                              
</PRE></DIV>
<DIV id=cat8>
<PRE>
                                         
                                                      ,CAc,,                                                              ,,                                                                            
                                                     cRRRRRRRAc,,              ,,,,,,,,,,,,,,,,,,,,,,,,,,            ,cCRRRRC,                                                                          
                                                     sRRRRRRRRRRRc,          ,,,,,,,,,,,,,,,,,,, ,,,,,,,,,,,     ,,cARRRRRRRAs,,                                                                        
                                                      TRRRRRRRRRRRRRT,    , ,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,    ,CRRRRRRRRRRRAcc,                                                                        
                                                      ,sccTRRRRRRRRRRRc,,    , ,,,,,,,,,,,,, ,,,,,,,,,,,     ,cRRRRRRRRRRRAscc,                                                                         
                                                       ,scccARRRRRRRRRRRRs,,,,,,,,,,,,,,,,,,,,,,,,,,,     ,TRRRRRRRRRRRRRsc,cc,                                                                         
                                                       ,sTcccccCRRRRRRRRRRRRR,,,,,,,,,,,,,,,,,,,,,,, ,,,CRRRRRRRRRRRRRRCc,,,cc,                                                                         
                                                        ,cTc,ccccARRRRRRRRRRA,, ,,,,,,,,,,,,,,,,,,, ,,TRRRRRRRRRRRRAscccc,,,c,                                                                          
                                                         cCCc,,ccccARRRRRRRc,, ,,,,,,,,,,,,,,,,,   ,,,,,TRRRRRRRRRCcccc,,,,cc,                                                                          
                                                          TRRc,,,cccTRRAccc,, ,,,     , , , , ,   ,,,,,,,,c,cTRRAcccc,,,,,csc,                                                                          
                                                           ,sCTc,ccccccccc,,,,,,   ,         ,,   ,,,,,,,,,,,,,ccc,,,,,,,ccc,                                                                           
                                                            ,cTTTccccccc,,,,,,,,,  ,,  ,,,,,,,,   ,,,,,,,,,,,,,,,,, ,,,,csc,                                                                            
                                                              ,ccTscccccc,,,,,,,               , ,,,,,,,,,,,,,,,,,,, ,,ccc                                                                              
                                                                 ,Tcccccc,,,,,,,,,, , ,     ,,, ,,,,,,,,,,,,,,,,,,,,,ccc,                                                                               
                                                                 csscccc,ccc,,,,,,,,,,          ,,,,,,,,,,,,,,,,,,,c,cc,                                                                                
                                                               ,cTsccccccccccc,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                              
                                                              ,sTTcccccccc,ccccc,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                             
                                                             ,TCscccccccccccc,ccc,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,cc,                                                                            
                                                            ,TTscccccccscccccccccc,cc,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,cc,,                                                                          
                                                            cTTcccccccccccccccccccccc,c,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,ccc,,                                                                         
                                                          ,CCTcccccccccccTARTc,ccccccccc,c,c,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                        
                                                          ,ccsTTsccccccsARRRRAACscccTscccccccccc,cARRRRACc,,,,,,,,,,,,,,,,,,,,,,,                                                                       
                                                             ,cTTTcccccCRRAcTRRRcccccsccccccccccCRACCRRRRRc,,,,,,,,,,,,,,,,,,,,cc,,                                                                     
                                                               ,cTTsscccTRRAARRRRCc,c,ccc,c,,,TRRR, ,CRRRRRc,,,,,,,,,,,,,,,,,,,,,                                                                       
                                                                 ,cTTTcc,,sRRRRRCc,,,,,,,,,,,,,TRRRRRRRRRC,,,,,,,,,,,,,,,,,c,,                                                                          
                                                                   ,cTCsc,,ccccc,,,,,,,,,,,,,,, ,,TRRRs,,   ,,,,,,,,,cccc,,                                                                             
                                                                     ,cTTTcc,,,,,,,,,,,, ,,,,,,,   ,,,   ,,ccc,,,ccTCT,,                                                                                
                                                                       ,TCTTccc,c,,,,,,,,,,,,,,,,,,  ,,,ccccc,ccCCs,,                                                                                   
                                                                         ,cTsscccc,c,,TRRA,,,,,,,,,,,,,ccccTTTsc,                                                                                       
                                                                           cCTTsccccccccsc,,,,,,,,,,ccccsTTscc,,                                                                                        
                                                                           ,cccTsTcssTsscccccccscssssscTsc,,,,,c,                                                                                       
                                                                          ,,,,,,cTscscssTTTTTTTTTTccccc,,,,,,,,,,,                                                                                      
                                                                         ,,,,,,,,ccc,, ,,cc,,,,,,,,,,,,,,,,,,,,,,,,                                                                                     
                                                                         ,c,,,,,,,cc,,        , , ,,,,,,,,,,,,,,,,,                                                                                     
                                                                         ,c,,,,, ,,,,, , , ,,,,,,,,,,,,,,,,,,,,,,,,                                                                                     
                                                                        ,,c,,,,,,,,,,,,,,,,,,,,,,,, ,,,,c,,,,,,,,,,,                                                                                    
                                                                        ,,,,,,,,,,cc,,,,,,,,,,,,,,,,,,,cccc,,,,, ,,,                                                                                    
                                                                        ,,, ,,,,,cccc,, ,,,,,,,,,,,,,,,ccccc,,,,,,,,                                                                                    
                                                                        ,,,,,,,,cccc,,,,,,,,,,,,,,,,,,,,cccc,,,,,,,,                                                                                    
                                                                        ,,,,,,,,ccc,,,,,,,,,,,,,,,,,,,,,,,ccc,,,, ,                                                                                     
                                                                        ,c,,,,,,ccc,,,,, ,,,,,,,,,,, ,,,,,cc,,,, ,,                                                                                     
                                                                        ,,,,,,,,ccc,,,, ,,,,,,,,,,,,,,,,,,ccc,,,,,,                                                                                     
                                                                        ,,,,,,cTcc,,,,,,,,,,,,,,,,,,,,,,,,cc,,,,,,                                                                                      
                                                                       ,c,,,,,csccc,,,,,,,,,,,,,,,,,,,,,,,ccc,,,,,                                                                                      
                                                                       ,sccc,,,ccccc,,,,,,,,,,,,,,,,,,,,,,,c,,  ,,                                                                                      
                                                                       ,csc,  ,cccc,,,,,,,,,, ,,,,,,,,,,,,,,c,,,,,                                                                                      
                                                                              ,TTccc,,,,,,,,,,,,,,,,,,,,,,,,,ccc,,                                                                                      
                                                                              csTccccc,,,,c,ccc,,,,,,,,,,,,,,,,cc,                                                                                      
                                                                             ,cc,,,cccccccsTsscc,,,,,,,,,,,,,,,                                                                                         
                                                                            ,cc,,,,,,,cccccsTccc,,,,,,,,,,,,,,,                                                                                         
                                                                            ,cc,,,,,,,,,,cccc,,cc,,,,,,, ,,,,,,,                                                                                        
                                                                            ,cc,,,,,,,,,,,,,,,,cc,,,,,  ,,,,,,,,,                                                                                       
                                                                            ,cc,,,,,,,,,,,,cc,,ccc,,,,,   ,,,,,,,                                                                                       
                                                                            ,,c,,,,,,,,,,,,ccc,,,cc,,,,,  ,,,,,,,,                                                                                      
                                                                             ,,c,,,,,,,,,,,,,c, ,ccc,,,,   ,,,,,,,                                                                                      
                                                                             ,cc,,,,,,,,,,,,c,  ,cscc,,,,,,,,,,,,,,                                                                                     
                                                                             ,cc,,,,,,,,,,,,,,  ,Tccc,,,,,,,,,,,,,,,                                                                                    
                                                                            ,cccc,,,,,,,,,,,,,  ,TTcc,,,,,  ,,,,,,,,                                                                                    
                                                                             ccccc,,,,,,,,,,,,  ,CTccc,,,,,, ,,,,,,,                                                                                    
                                                                            ,cTcc,,,,,,,,,cc,   ,TTccc,,,,,,, ,,,,,,                                                                                    
                                                                            ,sCTcccc,,,,ccc,    ,ccTcc,,,,,,,,,,,c,                                                                                     
                                                                              ,ccccsTTTcc,      ,cTTc,,,,,,,,,,,,,                                                                                      
                                                                                 ,,,,cc,         ,cCCTcc,,,,,,,,                                                                                        
                                                                                                   ,,,ccTcc,,,                                                                                          
                                                                                                       ,,,,,                                                                                            
</PRE></DIV>
<DIV id=cat9><PRE>
                                         
                                                           ,CAAc,                                                         cTAARc,                                                                       
                                                         ,cRRRRRRRCc                         ,,,                      ,TRRRRRRRRc,                                                                      
                                                         ,ARRRRRRRRRRAc,           ,,,,,,,,,,,,,,,, ,,,,,,,   , ,  ,CRRRRRRRRRRRT,,                                                                     
                                                          cRRRRRRRRRRRRAc,     , ,,,,,,,,,,,,,,,,,,,,,,,,,,,,,   ,cRRRRRRRRRRRTTc,                                                                      
                                                          ,TCccCRRRRRRRRRRAc,     ,,,,,,,,,,,,,,,,,,,,,,,     ,,TRRRRRRRRRRRCc,cc,                                                                      
                                                           ,cccccARRRRRRRRRRAc,,,, ,,,,,,,,,,,,,,,,,,,,,    ,TRRRRRRRRRRRRAccc,c,                                                                       
                                                            cTc,ccTRRRRRRARRRRRRA,, ,,,,,,,,,,,,,,,,,,, ,,RRRRRRRRRARRRRRTcc,,,,,                                                                       
                                                            ,Csc,,ccCRRRRRRRRRRRc,,,,,,,,,,,,,,,,,,,,,  ,cRRRRRRRRRRRRRCcccc,,,c,                                                                       
                                                             cTsc,,,ccARRRRRRRT,, , , ,,, ,,,,,,, ,   ,,,,,,cTRRRRRRRAcccc,,,,sc,                                                                       
                                                             ,RRTc,,cccTRRAscc,, ,,        ,,, ,,,   ,,,,,,,,,,,TRCccccc,,,,,cs,                                                                        
                                                              ,cTTc,ccccccccc,,,  ,       , ,,, ,,   ,,,,,,,,,,,,,,cc,,,,,,,cTc,                                                                        
                                                                ,cCscccccccc,,,,,,,,   ,       ,     ,,,,,,,,,,,,,,,,,   ,,ccc                                                                          
                                                                 ,cTCTsccccc,,,,,,,,,,,,,     ,,,,,,,,,,,,,,,,,,,,,,,,,,,,cc,                                                                           
                                                                   ,cccscccc,,,,,,,,,,,,           ,,, ,,,,,,,,,,,,,,,,,cTc,                                                                            
                                                                     cscscc,ccc,,,,,,,, ,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,cc,                                                                             
                                                                    ,Tscccccccccc,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                             
                                                                  ,cTcccccccccc,ccc,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,c,,                                                                           
                                                                 ,cTsccccccccccc,ccc,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,cc,                                                                          
                                                                ,cCsccccccccccccc,c,,ccc,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,cc,,                                                                        
                                                                cscsccccccccccccc,,cccccc,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,ccc,                                                                       
                                                               ,cscccccccccCACARRAAcc,ccccc,,,ccc,c,cTRRAAATc,,,,,,,,,,,,,,,,,,c,,                                                                      
                                                             ,TACTcccccccccRRRTccRRC,,,ccccc,c,ccccTARCCARRRRT,,,,,,,,,,,,,,,,,,,,,                                                                     
                                                             ,,,ccTcccccccTRRRAcTARRAc,,,,,,,,,,,cRRRc ,TRRRRRs,,,,,,,,,,,,,,,,,,,c,,                                                                   
                                                                 cCCTscccccccCRRRRRRT,,,,,,,,,,,,,cRRRAACTRRAc,,,,,,,,,,,,,,,,,,,,,,,                                                                   
                                                                  ,cTTTsccc,,,cTCTs,,,,,, , , ,,,  ,cTRRRRCc,  ,,,,,,,,,,,,,,,,,,                                                                       
                                                                     ,TCTTcccccc,,,,,,,,,,   , , ,     ,,,,  ,,,,,,,,,,,,cccc,,                                                                         
                                                                       ,cTTTTsccc,,,,,,,,,,   , , ,        ,,cc,,,,,ccsTTc,,                                                                            
                                                                         ,cTTTsscc,c,,,,,,cCc,,,,, ,,,  ,,,,,,,,ccsCCTc,                                                                                
                                                                           ,cTCsscccccc,,,cTc,,,,,,,,,,,,,ccccTsTTs,,                                                                                   
                                                                              ,CTTsTsscccccc,,,,,,,,,,,ccccccTTTc,                                                                                      
                                                                              ,cTTTsTTTTTsTsTcccccccccccTTTTTcc,,,,,                                                                                    
                                                                             ,,,,,,,ccsscTsTTTTTTTTTTTTTsccc,,,,,,,,                                                                                    
                                                                             ,,,,,,,,,,,,,,,,,ccc,,,,,,,,,,,,,,,,,,,,                                                                                   
                                                                             ,,,,,,,,cc,,,      ,,,,,,,,,,,,,,,,,,,,,                                                                                   
                                                                           ,,,,,,,,,,cc,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                                   
                                                                           ,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                                   
                                                                          ,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,cc,,,,,,,                                                                                   
                                                                         ,,, ,,,,,,ccc,,,,,,,,,,,,,,,,,,,,,cccc,,,,,                                                                                    
                                                                        ,,c,,,,,,,ccc,,,,,,,,,,,,,,,,,,,,,ccccc,,,,                                                                                     
                                                                         ,cc,,,,,,,,,,,, ,,,,,,,,,,,,,,,,,cccc,,,,,      ,                                                                              
                                                                         ,cc,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,cccc,,, ,,,,,,csc                                                                             
                                                                          ,ccc,,,c,,,,,,,,,,,,,,,,,,,,,,,,,ccc,,,,,,cccc,,                                                                              
                                                                          ,TAc,,cc,,,,,,,,,,,,,,,,,,,,,,,,,,ccc,, ,,c,,,                                                                                
                                                                           ,,  ,,c,,,,,,,,,,,,,,,,,,,,,,,,,,cc,, ,,c,,                                                                                  
                                                                              ,cccc,,,,,,,, ,,,,,,,,,,,,,,,,c,,,,,,,,                                                                                   
                                                                            ,csscc,c,c,,,,,, ,,,,,,,,,,,,,,,,cccc,,                                                                                     
                                                                         ,,cccTcccccc,,,,,,,,,,,,,,,,,,,,,,,cccc,                                                                                       
                                                                        ,ccccccsssccc,,,,,,,,,,, ,,,,,,,,,,,,,                                                                                          
                                                                       ,ccccc,ccssTcsccc,,,,,,,,,,,,,,,,,,                                                                                              
                                                                       ,cccc,,,ccccssTsTcc,,,,,,,,,,,,,,,                                                                                               
                                                                      ,,ccccccc,c,ccccccsc,,, ,,,,,,,,,,,                                                                                               
                                                                      ,,ccccccccccc,,,,cc,,,,,   ,,,,,,,,,                                                                                              
                                                                       ,cccccc,,cc,,,,ccc,,,,,,,,,,,,,,,,                                                                                               
                                                                        ,c,c,,,,,,,,,,cccc,,,,   ,,,,,,,,                                                                                               
                                                                         ,c,,,,,,,,,,,cccc,,,,  ,,,,,,,,,,,                                                                                             
                                                                         ,cc,,,,,,,,,,cccc,,,,   ,,,,,,,,,,,,                                                                                           
                                                                          ,,c,,,,,,,,,,cccc,,,,  ,,,,,,,,,,,,,                                                                                          
                                                                           ,,,,,,,,,,,,csCcc,,,    , ,,,,,,,,,                                                                                          
                                                                           ,ccc,,,,,ccccccTTcc,,,,, , ,,,,,,,,,                                                                                         
                                                                           ,cscccccTTTc,  ,cTsccc,,,,   ,,,,,c,                                                                                         
                                                                           ,cCATCCATc,     ,TTccccc,,,,,,,,,,c,                                                                                         
                                                                             ,ccccc,       ,cCTccc,,,,,,,,,,,c,                                                                                         
                                                                                            ,cTccc,,,,,,,,,,c,                                                                                          
                                                                                             ,cscc,,,,,,,,c,,                                                                                           
                                                                                              ,cTTTsTCTcscc,                                                                                            
                                                                                                ,ccc,,,,,,                                                                                                                                        
</PRE></DIV>
<DIV id=cat10><PRE>
                                         
                                                                                                                           ,cACc                                                                        
                                                                                                                        ,sARRRRRc,                                                                      
                                                               cARAAc                                                ,,CRRRRRRRRTc,                                                                     
                                                              cARRRRRRRT,                                     , ,  ,TRRRRRRRRRTccc,                                                                     
                                                             ,RRRRRRRRRRRRAc           ,,,,,,,,,,,,,,,,,,,,,,,   ,cRRRRRRRRRCcccc,                                                                      
                                                              sCTARRRRRRRRRRC,,     ,,,,,,,,,,,,,,,,,,,,,,,    ,TRRRRRRRRRAcccc,,,                                                                      
                                                              ,cccccCRRRRRRRRRRA,,,,,,,,,,,,,,,,,,,,,,,,,,  ,TRRRRRRARRRRRAcc,,c,,                                                                      
                                                               ,scccccARRRRARRRRRRRT,,,,,,,,,,,,,,,,,,    ,cRRRRRRRARRRTccc,,,,,c,                                                                      
                                                               ,csc,,ccTRRRRRRARRRRs, ,,     ,,, ,,,,,   ,,,cCRRRRRRRRRCcc,,,,,cc,                                                                      
                                                               ,cTc,,,cccTRRRRRRRT,   ,,  ,       ,,,  ,,,,,,,,cTRRRRAccc,,,,,,cc                                                                       
                                                                ,cTc,,,ccccARRRAc,           ,    ,,   ,,,,,,,,,,,cccccc,,,,,,cc,                                                                       
                                                                 ,CCc,,,ccsAAc,,,,,,,,,,,     ,   ,,, ,,,,,,,,,,,,,,,,,,,  ,,cs,                                                                        
                                                                  ,sTsc,,ccccc,,,,,,,,,,,,     ,     ,,,,,,,,,,,,,,,,,,,   ,cc,                                                                         
                                                                   ,cTTcc,cccc,,,,,,,,,,,,,         ,,, ,,,,,,,,,,,,,,,,,,,cc,                                                                          
                                                                     ,sCcccTc,,c,,,,,,,,,, , ,   , , ,   ,,,,,,,,,,,,,,,,ccc,                                                                           
                                                                      ,cTsccccc,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,c,,,                                                                            
                                                                        cTccccc,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                            
                                                                       ,ccscccccc,c,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                          
                                                                      cCsccccccc,c,,,,,,,,,,,,,,,,,,,,,,,, ,,,,,,,,,,,,,,,,,,c,,                                                                        
                                                                    ,cTsccccccccccc,,,,,,,,,,,,,,,,,,,,,cTCcc,,,,,,,,,,,,,,,,,cc,                                                                       
                                                                   ,cCTcccccccsAARRRTc,c,,,,,,,,,,,,,cCRRRRRAACc,,,,,,,,,,,,,,,cc,                                                                      
                                                                   ,ccscccccTARRCccARRs,,,,,,,,,,,,,cRRc,cCRRRRCc,,,,,,,,,,,,,,,,,,,                                                                    
                                                                  ,ccsccccccsARRCscARRCc,,,,,,,,,,,,TRR,,cARRRRC,,,,,,,,,,,,,,,,,,,c,,                                                                  
                                                                ,cCACcccccccc,cCRRRRRRA,,,,,, ,,, ,,,cARRRRRRAc,,,,,,,,,,,,,,,,,,,,,,,,                                                                 
                                                                 ,,ccccccccccc,,cTTCTc,,,,,           ,ccTcc,,  ,,,,,,,,,,,,,,,,,,                                                                      
                                                                    ,TCccccccccc,,,,,,,,,,,       , ,         ,,,,,,,,,,,,,,,,,cc,,                                                                     
                                                                     cTCTTcsccccccc,,,,,,,,,,,,  ,,, ,     ,,,cc,,,,,,,,ccsTcc,,,                                                                       
                                                                        ,cCTTcsccscc,,,,,,,,cRR,  , , ,,, ,,,,,,,,ccssTTTcc,                                                                            
                                                                           ,cCTTssccccc,,,,,,c,,,,,,,,,,,,,,,ccccTcTCCc,,                                                                               
                                                                             ,,cTTTccccccccc,,,,,,,,,,,,,,,cc,ccccccc,                                                                                  
                                                                                ,csTsTcscscscsccccccccccccccccssTc,                                                                                     
                                                                                  ,cTsssTsTsTsTsTsTsTTTTTTTTTTs,,,,                                                                                     
                                                                              ,,,, , ,,sTscscssTsTsTsssscccc,,,,,,,,                                                                                    
                                                                            ,cc,,,,,,,,,,,,,,,,,cc,,,,,,,,,,,,,,,,,,,                                                                                   
                                                                           ,csc,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                                   
                                                                           ,cTTcccccc,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                                   
                                                                           ,cssTscc,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                                   
                                                                           ,ssccc,c,,,,,, ,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                                   
                                                                           ,cTsc,,,,,,,, ,,,,,,,,,,,,,,,,,,,,,,,ccc,,                                                                                   
                                                                            ,cscc,,,,,, ,,,,,,,,,,,,,,, ,,,,,,ccsc,,,                                                                                   
                                                                              ,ccc,,,, ,,,,,,,,,,,,,,,,, ,,,,cccc,,,,                                                                                   
                                                                              ,ccc,,,,, ,,,,,,,,,,,,,,,,,,,,,,ccc,,,,                                                                                   
                                                                              ,sc,,,,,,,,,,,,,,,,,,,,,,,,,,,,,cCAs,,,,,                                                                                 
                                                                             cccc,,,,,, ,,,,,,,,,,, , ,,,,,,,,TRRTc,ccc,                                                                                
                                                                            ,scc,,,,,,,,,,,,,,,,,,,,,,,,,,,,ccsAATcc,,                                                                                  
                                                                           ,ccc,c,,,,,,,,,,,,,,,,,,,,,,,,,,,cccccc,,                                                                                    
                                                                          ,ccsc,,c,,,,,,,  ,,,,,,,,,,,,,,,,,ccc,,                                                                                       
                                                                         ,ccccccc,,,,,,,,,,,,,,,,,,,,,,,,,ccc,                                                                                          
                                                                        ,ccccscccc,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                                            
                                                                       ,ccc,ccsssccc,,,,,,,,,,,,,,,,,,,,,,                                                                                              
                                                                      ,ccc,c,ccccssscc,,,,,,,,,,,,,,,,,,,                                                                                               
                                                                      ,cccc,c,ccccsTTssc,,,,,,,,,,,,,,,                                                                                                 
                                                                     ,cccccccc,c,c,ccccTc,,,,,,,,,,,,,,                                                                                                 
                                                                    ,sc,,,,cccccc,,,,cccc,, ,  ,,,,,,,,                                                                                                 
                                                                    ,cc,,,,,,,,,,,,,,cc,,,,,   ,,,,,,,,,                                                                                                
                                                                   ,cc,,,,,,,,,,,,,,cscc,,,,,,,,,,,,,,,,                                                                                                
                                                                  ,ccc,,,,,,,,,,,c,,,cccc,,,   ,,,,,,,,,,,                                                                                              
                                                                  ,cc,,,,,,,,,,,,,,  ,ccc,,,,   ,,,,,,,,,,,                                                                                             
                                                                 ,sccc,,,,,,,,,,,,,   ,sc,,,,,   ,,,,,,,,,,,,                                                                                           
                                                                 ,TTsc,,,,,,,,,cc,    ,TTc,,,       ,,,,,,,,,                                                                                           
                                                                  ,csTcc,,,ccccc,,     ,cTcc,,,,,, , , , ,,,,,                                                                                          
                                                                     ,ccccccc,,         ,cTTscc,c,,,,,, ,,,,,,,                                                                                         
                                                                        ,,,               ,cTTcccc,,,,,,,,,,c,                                                                                          
                                                                                           ,CTccc,,,,,,,,,,,c,                                                                                          
                                                                                           ,cTcc,,,,,,,,,,c,,                                                                                           
                                                                                             ,csc,,,ccccccc,                                                                                            
                                                                                               ,cTTccc,,,,                                                                                              
                                                                                                 ,,,                                                                                                                                               
</PRE></DIV>
<DIV id=cat11>
<PRE>
                                         
                                                                   ,CRRC,                                                    ,TRAT,                                                                     
                                                                 ,CRRRRRRRAc,                                             cARRRRRRRc,                                                                   
                                                                 cTCARRRRRRRAc,,   ,                             ,     ,cRRRRRRRRACT,                                                                   
                                                                 ,cccsRRRRRRRRRAc,  ,,,,,     ,               ,,,    cRRRRRRRRRAsccc,                                                                   
                                                                  ,scccCRRRRRRRRRAc,   ,,,,,,,,,,,,,,,,,,,,,,,    ,sARRRRRRRRRTcc,,,,                                                                   
                                                                  ,cs,,,cARRRRRRRRRRRTc,,,,,,,,,,,,,,,,,,,,,, ,,TRRRRRRRRRRRCc,,,,,,                                                                    
                                                                   cc,,,ccsARRRRRRRRRRA, ,,,   ,   ,,,,,,    ,cRRRRRRRRRRRAc,,,,,,,,                                                                    
                                                                   cT,,,,,ccTRRRRRRRRc, ,,,      ,,,, ,,,   ,,,cCRRRRRRRRscc,,, ,c,                                                                     
                                                                   cTT,,,,,cccCRRAc,,  ,,,               ,,,,,,,,,TRRRRCccc,,, ,,c,                                                                     
                                                                    cCT,,,,,ccccc,,,,,, ,,,,,          ,, ,,,,,,,,,,,ccccc,,,  ,cc,                                                                     
                                                                    ,TCT,,,,cccc,,,,,,,,,,,,,,       ,  ,,,,,,,,,,,,,,cc,,,  ,,cs,                                                                      
                                                                      cTc,,,,ccc,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,    ,cc,                                                                       
                                                                       cTTccccc,,,,,,,,,,,,,,,,,,,,,,,,, ,,,,,,,,,,,,,,,,, ,,cc,                                                                        
                                                                        ,sTTscc,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,ccc,                                                                         
                                                                         ,cTcccc,c,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,ccc,                                                                           
                                                                         ,ssscc,ccc,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                           
                                                                       ,cTccccccc,,,cc,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                          
                                                                      ,sTscccccc,cCARRRCc,,,,,,,,,,,,,,,,,TARACTc,,,,,,,,,,,,,c,                                                                        
                                                                    ,cTTsccccccsCRRRccCRRC,,,,,,,,,,,,,,cAACTRRRRAc,,,,,,,,,,,cc,,                                                                      
                                                                    ,cTscccccccsARRAccTRRRc,,,,,,,,,,,,cRRc  sRRRRRc,,,,,,,,,,,cc,                                                                      
                                                                   ,,ccscccccc,,,cCRRRRRRR,,,,,,,,,,,,,cRRRCACTRRAc,,,,,,,,,,,,,,,,                                                                     
                                                                 ,cCATTcccccccc,,,,cACCTT,, ,,,   ,     ,cARRRRCc,,,,,,,,,,,,,,,,,,,,                                                                   
                                                                ,,cccccsccccccccc,,,,,,,   ,,,             ,,c,,   ,,,,,,,,,,,,,,,,cc,,                                                                 
                                                                     ,cTscsccccccccc,,,,,,,,, ,,,,  , , ,       ,,c,,,,,,,,,,,,,,,,,,                                                                   
                                                                    ,cTCTTsTcccc,cccc,,,,,,,, ,TRR,  ,,,,,   ,,,,,,,,,,,,,,,,,,,,,,                                                                     
                                                                      ,,ccCTTTTcccccc,,,,,,,,,,,c,,,,,,,,,,,,,,,,,,,,cccccsccccc,,                                                                      
                                                                           ,cTTTTTTTcc,ccccccc,,,,,,,,,,,,,,,,,,cccccccccTTsc,,                                                                         
                                                                              ,cTTccccccccccccccccccc,cccc,,,,,,,cccsssc,,                                                                              
                                                                                ,,,cTTsscscscscscscccccccc,cccccccsc,,                                                                                  
                                                                             ,,,    ,cTTTsTsTsssscscscTsscccccTTc,,                                                                                     
                                                                           ,,c,,,,,,,,,sTscssssssTsTsTsTsTsTssc,,                                                                                       
                                                                           ,sccc,,,,,,,,,,,,,,,,ccccccc,,,,,,,,,,,,                                                                                     
                                                                          ,cscccsCTc,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                                    
                                                                          ,ccc,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                                   
                                                                         ,cccc,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                                   
                                                                         ,cccc,,,,,,,,c,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                                   
                                                                         ,cTscc,,,,,,c,,,, ,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                                   
                                                                          ,cCcc,,,,,,,,  ,,,,,,,,,,,,,,,,,,,,,,,c,,,,                                                                                   
                                                                           ,,ccc,,,c,, ,,,,,,,,,,,,,,,,,,,,,,,ccc,,,,,                                                                                  
                                                                             cccccc,,,,,,,,,,,,,,,,,,,,,,  ,ccccc,,,,,,                                                                                 
                                                                           ,,cscc,,, ,,,,,,,,,,,,,,,,,,, ,,csscccc,,,,                                                                                  
                                                                          ,cTcc,,,  ,,,,,,,,,,,,,,,,,,,,,,,csc,ccc,,,                                                                                   
                                                                         ,cTsc,,,, ,,,,,,,,,,,,,,,,,,,,,,,,c,  ,,c,,,                                                                                   
                                                                         ,Ccc,,,,,,,, ,,,,,,,,,,,,,,,,,,,,c,    ,ss,,                                                                                   
                                                                        cTcc,c,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,    ,,,,                                                                                    
                                                                       ,TTc,ccc,,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                                            
                                                                      ,ccccccc,c,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                                             
                                                                      cTccccscc,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                                              
                                                                     ,cTcccccscccc,,,,,,,,,,,,,,,,,,,,,,,                                                                                               
                                                                    ,cTcc,ccccssTcccc,,,,,,,,,,,, ,,,,,                                                                                                 
                                                                    ,Tcc,c,ccccTsTTTTscc,,,,,,,,,,,,,,                                                                                                  
                                                                   ,ccccccccccccccccccTTc,,,,,,,,,,,,,,                                                                                                 
                                                                   ccc,,,,,ccccc,,,,  ,cc,,, ,,,,,,,,,,                                                                                                 
                                                                  ,cc,,,,,,,,,,,,c,   ,cc,,,,,,,,,,,,,,,,                                                                                               
                                                                  ,,,,,,,,,,,,,,,cc  ,,cc,,,,, , ,,,,,,,,,,                                                                                             
                                                                 ,c,,,,,,,,,,,,,,cc,  ,cc,,,,,,  ,,,,,,,,,,,                                                                                            
                                                                 ,c,,,,,,,,,,,,,,,,   ,ccc,,,,     ,,,,,,,,,,                                                                                           
                                                                ,cTc,,,,,,,,,,ccc,     ,ccc,,,,     , ,,,,,,,,                                                                                          
                                                                ,TACTscc,cccccscc,      cTcc,,,,,,,,,, ,,,,,,,                                                                                          
                                                                 ,ccccscccccc,,         ,cTTsccccc,,,,,,,,,,c,,                                                                                         
                                                                                          ,TTTcccc,,,,,,,,,,cc                                                                                          
                                                                                           ,CCTcc,,,,,,,,,,cc,                                                                                          
                                                                                            ,cTc,,,,,,,cccc,                                                                                            
                                                                                             ,,ccccccccc,,,                                                                                             
                                                                                               ,,csc,,,                                                                                                 
</PRE></DIV>
<DIV id=cat12><PRE>
                                          
                                                                 ,cCATTc                                                                                                                                
                                                               ,cARRRRRRCc,                                                                                                                             
                                                               ,sTCARAAARRACc                                              ,cTCAC,                                                                      
                                                               ,ccccccCRAAARRCc,     ,                                 ,,TARRRRRRA,                                                                     
                                                                ,cc,cccsAAACARRCc,    , , , , , ,           ,,, ,    ,CARRRRAARCTc,                                                                     
                                                                ,cc,,,cccCAACAARAACc   ,,,,,,,,,,,,,,,,,,,,,,,    ,cTRRRAAAARAcc,c,                                                                     
                                                                ,cc,,,,,cccCACACARRRAs,  ,,,,,,,, , ,,,,,,,,, ,,sCRARAAAAACccc,,,,,                                                                     
                                                                 cc,,,,,,,cCRAAAARRRAc , ,         ,   ,    ,sRRRRAAAAARCccc,,,,,,                                                                      
                                                                 ,Tc,,,,,,ccTARRRCc,,   ,,,       ,,,  ,    ,,cARRAAAAAsccc,,,,,,,                                                                      
                                                                 ,ssc,,,,,,,,ccc,,,  , ,,,                 ,   ,cARRACccc,,,  ,,,                                                                       
                                                                  ,cs,,,,,,,cc,,,,,,,,,                 , ,,,   ,,,ccccc,,,  ,,,,                                                                       
                                                                   cTsc,,,,,,,,,,,,,,,,,                 , , ,,,,,,,,c,,,,  ,,cc                                                                        
                                                                    ,csc,,,cc,,,,,, ,,, ,,, ,,,,,,,,,,, , , , , ,,,,,,,    ,cc,                                                                         
                                                                     ,cscccc,,,,,, ,,,,,,,,,,,,, , , ,,,,,,,,,,,,,,,,,,   ,,c,                                                                          
                                                                      ,cccc,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,c,,                                                                           
                                                                      ,cccc,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,cc,                                                                             
                                                                     ,ccccc,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                              
                                                                   ,cTccc,,,,,,,,,,ccsc,,,,,,,,,,, ,,,,,,,,,,,,,,,,,,,,,,,,                                                                             
                                                                 ,csTcc,c,,,,,,,csTAAAATc,,,,,,,,,,,,,,,,,cCCTc,,,,,,,,,,,,,                                                                       
                                                                 ,cccc,c,,,,,,,TRRRc,,sRAs,,,,,,,,,,,,,,cCCTTRRAcc,,,,,,,,,,,,                                                                     
                                                                ,,ccccc,,,,,,,,cTARTccCRRA, ,,,,,,, ,,cART, ,cRRRAc,,,,,,,,,cc,                                                                      
                                                              ,ccscccc,c,,,,,,,,,,TRRRRRAc, ,,,,  ,,  ,TAATsTARRRC,,,,,,,,,,,,,                                                                         
                                                             ,cTTcccccc,,,,,c,,,, ,,cccc,               ,TRRRRCc,,,,,,,,,,,,,,,,                                                                        
                                                                 ,cccccccccccc,,,,,                       ,c,,    ,,,,,,,,,,,,,,,,,                                                                
                                                                 ,Tsccccccccc,,,,,,,,     , , ,,,,             ,,,,,,,,,,,,,,,,,,,,                                                                
                                                                 ,,ccTsccccccccc,,,,,, ,,, ,  ,sTc,  , ,     ,,,,,,,,,,,,,,,,,                                                                        
                                                                     ,,csTscccccccc,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,ccccccccc,,                                                                         
                                                                        ,,,ccscccccc,,,,,,,,,,,,,,,,,,,,,,,,,,,ccccccsccc,,,                                                                            
                                                                            ,,cccccccccccccccccccccc,,,,,,,,,,,,ccscc,,                                                                                 
                                                                               ,cscccccccccccccccccccccc,,,,ccccc,,                                                                                     
                                                                                 ,ccccccccccccccccccccccccccsc,,                                                                                        
                                                                       ,,,,cc,  ,,,,,,cccccccccccccccccccccc,,                                                                                          
                                                                       ,cc,,,,c,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                                         
                                                                        ,ccc,,,,cc,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                                        
                                                                         ,,c,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                                       
                                                                          ,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                                        
                                                                          ,,,,,,,,,,,,,,,,, ,,,,,,,,,,,,,,,,,,,,                                                                                        
                                                                         ,,c,,,,,,,,,,,,,, , , , , ,,,,,,,,,,,,,                                                                                        
                                                                         ,cc,,,,,,,,,,,,, , , ,,, , , ,,,,,c,,,,                                                                                        
                                                                         ,cccc,,,,,,,,,  ,,, ,,, ,,, , , ,,c,,,,                                                                                        
                                                                         ,ccccc,,,,,,,, ,,,,,,,,,,, ,,, ,,c,, ,                                                                                         
                                                                           ,ccc,,,,,,, , , ,,, ,,,,,,,   ,,,,, ,                                                                                        
                                                                             ,cc,,,,,   ,,,,,,,,,,,,,,,,,,,,,,,                                                                                         
                                                                             ccc,,,,,, ,,, ,,, ,,, ,,, , ,,,,,                                                                                          
                                                                            ,cccc,,,,   ,,,,,,,,,,,,, ,,,,,,,,                                                                                          
                                                                           ,ccc,,,,,,, , ,,,,,,,,, , ,,,,,,,,                                                                                           
                                                                           cTcc,,,,,,,,,,,,,,,,,, ,,,,,,,,,,,                                                                                           
                                                                         ,cccc,,,,,,,,,,,, , , ,,, ,,,,, ,,,                                                                                            
                                                                        ,ccc,,,,,,,,,,,   , , , ,,, , , ,,,                                                                                             
                                                                       ,ccc,,,,,,,,,,,,,   ,     ,,, ,  ,,,                                                                                             
                                                                     ,ccc,,,,   ,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                                              
                                                                    ,ccc,,,, , ,,,,,,ccc,c,,,,,,,,,,,,,,,,                                                                                       
                                                                  ,cTcc,,,,   ,,,,,,,cc,ccsccccc,,,,, ,,,,,                                                                                         
                                                                 ,csccc,,,   ,,,,,,,,c,   ,ccc,,,, ,,, ,,,,                                                                                             
                                                                ,cscccc,, , , ,,,,,,c,    ,,c,,,,,, , ,,,,,,                                                                                            
                                                               ,,ccccc,,,,,,,,,,,,,c,     ,,,,,,,,,,,, ,,,,,                                                                                            
                                                                ,cccc,,,,,,,,,,,,,c,      ,,c,,,,,,,,   ,,,,,                                                                                           
                                                                 cscc,,,,,,,,,,,cc,       ,cc,,,,,,,   ,,,,,,                                                                                           
                                                                 ,ccc,,,,,,,,,,cc,,       ,csc,,,,,,,   ,,,,,,                                                                                          
                                                                 ,,cc,,,,,,,,,cc,,         ,cTcc,,,,,, , ,,,,,                                                                                          
                                                                  ,cccccc,,,,,c,,          ,ccccc,,,,,, , ,,,,,                                                                                         
                                                                   ,cccccccccc,            ,sscc,,,,,,,, ,,,,,,                                                                                         
                                                                       ,,,,,c,             ,sccc,,,,,,,,,,,,,,,                                                                                         
                                                                                           ,,cc,,,,,,,,,,,,,,,,                                                                                         
                                                                                             ccc,,,,,,,,,,,cc,                                                                                          
                                                                                             ,,cccccccccccc,,                                                                                           
                                                                                               ,,cc,,,,,,,,                                                                                                                                         
</PRE></DIV>
<DIV id=cat13><PRE>
                                         
                                                                ,TRRRATc,                                                                                                                               
                                                               ,sRRRARRRACc,                                                                                                                            
                                                               ,cTTARAAARRRAc,                                                                                                                          
                                                               ,ccccccAAACARRCc,                                          ,TCCCT,                                                                       
                                                               ,cc,,,ccTAACAARRCc,   ,   , , , ,                      ,cCAARRRRRRs,                                                                     
                                                               ,c,,,,,cccTAAAAAAAAC,   ,,,,,,,,,,,,,,,, , , , ,     ,cCRRRRAARRATc,                                                                     
                                                               ,cc,,,,,,cTARAACAARRRAc,, ,,,,,,,,,,,,,,,,,,,,    ,sAARRAAARATccc,,                                                                      
                                                                ,cc,,,,,cccCRAAAAARRRc, ,,,       , ,,,,,,,,,,cCAARRRAACAACcc,,,,,                                                                      
                                                                ,cc,,,,,,,,csARRRAc,,, ,,,         ,   ,    ,TRRRRAACAARAc,,,,,,,                                                                       
                                                                ,csc,,,,,,,cccc,,,,   ,,,,             ,,    ,cCRRAAAAATc,,,,,,,,                                                                       
                                                                 ,cTc,,,,,,ccc,,,,,,,,                 ,       ,cARRACcc,,,, ,,,                                                                        
                                                                  ,cs,,,,,,,,,,,,,,,,,,,,                 ,,,   ,,,cccc,,   ,,c,                                                                        
                                                                   css,,,,,,,,,,,,,,,,,,,,,,         ,    ,, ,,,,,,,,,,,   ,,c,,                                                                        
                                                                    ,cccccc,,,,,,,, ,,,,, ,,, , , ,,,,,,,,,,, , ,,,,,,,   ,,c,                                                                          
                                                                     ,cccccc,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,   ,,c,                                                                           
                                                                     ,ccc,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,cc,                                                                             
                                                                   ,cccccc,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,cc,                                                                              
                                                                  ,ccccc,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                               
                                                                ,csc,,,,,,,,,,,,,,cCAATc,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                              
                                                               ,cscc,,,,,,,,,,,cCRRTccARAc,,,,,,,,,,,,,,,,TAACTcc,,,,,,,,,,                                                                         
                                                              ,cccc,,,,,,,,,,,,cCRRc,,cRRA,,,,,,,,,,,,,,cCsccCRRAc,,,,,,,,,,,                                                                       
                                                            ,cTsc,,,,,,,,,,,,,,,,cARRRRRRs, , ,,, , , ,cRR, ,TRRRs,,,,,,,,,c,                                                                         
                                                           ,,ccccccc,,,,,,,,,,,  ,,cTTTc,,         ,  ,,cAARRRRAsc,,,,,,,,,,,,                                                                          
                                                               ,ccccccccccc,,,,,,,   ,,                  ,cCATc,, ,,,,,,,,,,,,,                                                                         
                                                               ,TTcccccccccc,,,,cc,,,        ,       ,     ,,    ,,,,,,,,,,,,,,,,,                                                                
                                                               ,,ccssccccccccc,,,,,,,   ,     ,csc,   ,       ,,,,,,,,,,,,,,,,,,,                                                                  
                                                                   ,,csTcccccccccc,,,,,,,,,,,,,ccc, ,,,,,, ,,,,,,,,,,,,,,ccc,                                                                        
                                                                       ,,,,,ccccccc,,,,,,,,,,,,,,,,,,,,,,,,,,,,,c,ccccTscc,,                                                                            
                                                                        ,,,,,,cccccc,ccc,,,,,,,cc,,,,,,,,,,,,,cccccscc,,,                                                                               
                                                                        ,,,,,,ccccccccccccccc,ccccccccc,,,,,,,cccc,                                                                                     
                                                                         ,cc,,,,cccccccccccccccccccccccccccccc,,                                                                                        
                                                                         ,cc,,,,,,,ccccccccccccccccccccccccc,                                                                                           
                                                                         ,cc,,,,,,,,,,,,,,,ccccccccc,,,,,,,,,,                                                                                          
                                                                         ,c,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                                         
                                                                        ,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                                         
                                                                        cc,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                                         
                                                                       ,ccc,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                                         
                                                                      ,cccc,,,,,,,,,,,,,, , , ,,, ,,, ,,,,,,,,,                                                                                         
                                                                      ,ccccc,,,,,,,,,, , ,,,,,,,,,,, ,,,,,,,,,                                                                                          
                                                                      ,,ccscc,,,,,,,,   ,,, ,,,,,,, , ,,cc,,,                                                                                           
                                                                         ,ccc,,,,,,,,, ,,,,,,,,, ,,,,, ,,c,,,,                                                                                          
                                                                           ,cccc,,,,,  ,,,, ,,,,, ,,, , ,,,,,                                                                                           
                                                                            ,ccc,,,,,, ,,,,,,, , ,,, , ,,,,,,                                                                                           
                                                                             ccc,,,,, ,,,,, ,,,,, , , , ,,,,,                                                                                           
                                                                            ,ccc,,,,,, ,,,,,,, , , , , ,,,,,                                                                                            
                                                                            ,ccc,,,,,,,,,,,,,,,,,,,,, , ,,,,                                                                                            
                                                                            ,ccc,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                                            
                                                                            ,cc,,,,,,,, ,,,   , , ,,, , ,,,                                                                                             
                                                                           ,,ccc,,,,,, ,,,,,,,,, , , , ,,,,,                                                                                            
                                                                           ,ccc,,,,,,   ,,,,,,,   , ,,,,,,,,                                                                                            
                                                                         ,cccc,,,,,,   ,,,,,,, ,,,,,,,,,,,,,                                                                                            
                                                                        ,cscccc,,,,   ,,,,,,,,,,,,,,,,,  ,,,                                                                                            
                                                                       ,cscccc,,,, , , ,,,,,,ccccc,,,, , ,,,                                                                                    
                                                                      ccccc,,,,,,   ,,,,,,,,sccc,,,,, , ,,,,,                                                                                      
                                                                    ,cscc,,,,,,,   , ,,,,,,cccc,,,,,,, ,,,,,,                                                                                           
                                                                    ,cscccc,,,,,, , , ,,,, ,cc,,,,,,,   ,,,,,                                                                                           
                                                                     ,cccccc,,,,,,,,,,,,,  ,cc,,,,,,   ,,,,,,,                                                                                          
                                                                      csccc,,,,,,,,,,,,,   ,ccc,,,,,,   ,,,,,,                                                                                          
                                                                      ,cccc,,,,,,,,,,c,    ,ccccc,,,,, , ,,,,,                                                                                          
                                                                       ,cTccccccccccc,     ,ccccc,,,,,, ,,,,,,                                                                                          
                                                                        cccccccccccc,      ,cccccc,,,,,, ,,,,,,                                                                                         
                                                                          ,,,,,,,,,,       ,ccccc,,,,,, ,,,,,,,                                                                                         
                                                                                           ,cscc,,,,,,,, , ,,,,                                                                                         
                                                                                            ,cc,,,,,,,,,,,,,,,,                                                                                         
                                                                                             ccc,,,,,,,,,,,,,,                                                                                          
                                                                                             ,,cccccccccccc,,                                                                                           
                                                                                               ,,cc,,,,,,,,                                                                                                                                     
</PRE></DIV>
<DIV id=cat14><PRE>
                                          
                                                                    ,cc,                                                                                                                                
                                                                  ,CRRRRCsc                                                                                                                             
                                                                 ,cCARARRRRAc,                                                                                                                          
                                                                 ,,ccTARAAARRTc,                                                                                                                        
                                                                  ,cc,cCARCAARRCc,                                                                                                                      
                                                                 ,,cc,,ccCRAAAAAACT,  , ,                                  ,sTCAAc,                                                                     
                                                                 ,,c,,,,,ccAAACAARRRc,   ,,,,,,,,,,, ,                 ,cCARRRRRRAc,                                                                    
                                                                 ,cc,,,,,cccTCACACARRRCc, ,,,,,,,,,,,,,,, ,,,,,      ,CARRRRAARCscc,                                                                    
                                                                 ,,cc,,,,,cccARAAAAARRAc,, ,,,,,,,,,,,,,,,,,,,   ,cAAARRAAAARAcccc,                                                                     
                                                                  ,cc,,,,,,,ccCRRRRTcc,,,,, , , , , , , , ,  ,cCRARRRAAAAACccc,,,,,                                                                     
                                                                  ,cc,,,,,,,,ccccc,,,, ,,,,,,,,    , ,   ,,,  ,ARRAAAAARAsc,,,,,,,                                                                      
                                                                   cTc,,,,,,,c,,,,,,,,,,,,,,,                   cARAAAAsc,,,,,,,c                                                                       
                                                                    ,sc,,,,,,,,,,,,,,,,,,,,                      ,,cAAcc,,,, ,,,,                                                                       
                                                                    ,csc,,,,c,,,,,,,,,,,,,,,,,,             ,,, , ,,ccc,,,   ,c,                                                                        
                                                                     ,ccc,,cc,,,,,,,,,,, , , , ,,,,,,,,,,, ,,,,, , ,,,,,   ,,cc,                                                                        
                                                                      ,cccc,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,, ,,,,,,,   ,,c,,                                                                         
                                                                      ,ccc,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,cc,                                                                           
                                                                    ,,cc,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,cc,                                                                             
                                                                   ,ccc,,,,,,,,,,,,,,,,,,,  ,,,,,,,,,,,,,,,,,,,,,,,,,,,c,                                                                               
                                                                 ,ccc,,,,,,,,,,,,,,,sCACCcc,,,,,,,,,, , ,,,,,,,,,,,,,,,,,                                                                               
                                                                ,cscc,,,,,,,,,,,,cTRRCccsRRC,,,,,,,,,,,,,,,,cTTsc,,,,,,,,,,                                                                             
                                                               ,ccc,,,,,,,,,,,,,,cARRc,,,TRCc,,,,,,,,,,,,,cCACCRRTc,,,,,,,,,                                                                        
                                                            ,,cTsc,,,,,,,,,,,,,,,,,cARRRRRRC,, ,,,,, ,,,,cRA, ,TRRRT,,,,,,,,,                                                                      
                                                            ,ccsccccc,,,,,,,,,,,,   ,cTTCTc,          ,,,cRRCcCARRRs,,,,,,,,,,                                                                      
                                                                ,ccccccccccc,,,,,,,,                      ,TARRRTc,  ,,,,,,,,,                                                                          
                                                                csscccccccccc,,,,cc,,,,       ,             ,,c,    ,,,,,,,,,,,                                                                         
                                                               ,,ccTTscccccccccc,,,,,,,    , ,  ,cCc,    ,       ,,,,,,,,,,,,,,,,,                                                                
                                                                   ,,csscc,cccccccc,,,,,,,,,,,, ,cCc, ,   ,   ,,,,,,,,,,,,,,,   ,                                                                 
                                                                       ,,,,,,cccccccc,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,ccccccc,                                                                       
                                                                       ,,,  ,,ccccccccccc,,,,,,,,,c,,,,,,,,,,,,,cccccsTc,,,                                                                             
                                                                       ,cc,,,,,,cccccccccccccc,cccccc,,,,,,,,,,ccscc,,                                                                                  
                                                                        ,,c,,,,,,,cccccccccccccccccccccccccccccc,,                                                                                      
                                                                         ,c,,,,,,,,ccccccccccccccccccccccsssc,,                                                                                         
                                                                         ,c,,,,,,,,,,,,,,,,cccccccccccccc,,                                                                                             
                                                                         ,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                                              
                                                                         ,c,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                                             
                                                                        ,c,c,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                                            
                                                                        ccc,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                                             
                                                                      ,,ccc,,,,,,,,,,,,,,,,,,,,, , , , ,,,,                                                                                             
                                                                      ,cccc,,,,,,,,,,,,,,,, ,,, ,,,,, , ,,,                                                                                             
                                                                      ,ccccc,,,,,,,c,,,,,  , ,,,,,,,,, ,,,,                                                                                             
                                                                        ,cccc,,,,,,,,,,,, , , ,,,,, ,,, , ,                                                                                             
                                                                          ,ccccc,ccc,,,,,,,,,,,,,,,,,, ,,,                                                                                              
                                                                             ,,cccc,,,,,,,, , ,,,,, ,,,,,                                                                                               
                                                                               cccc,,,,,,,,,,, ,,,,, ,,,,,                                                                                              
                                                                             ,ccccc,,,,,,,, ,,, ,,, ,,,,,,,                                                                                             
                                                                           ,,ccccccc,,,,,,,,,,,, ,,,,,,, ,,,                                                                                            
                                                                          ,cTcccccc,,,,,, ,,,,,,, , ,,, ,,,                                                                                             
                                                                          ,ccccccc,,,,,,,,   , ,,,,,,, ,,,,,                                                                                            
                                                                          ,cccccc,ccc,,,,,,   , ,,,,,,,,,,,                                                                                             
                                                                          ,cccccccccc,,,,,,, , ,,,,,,, ,,,,,                                                                                            
                                                                           ,ccccccccc,,,,,, , , ,,,,, ,,,,,                                                                                             
                                                                            ,ccccccccc,,,,,  ,,,,,,,,,,,,,,,                                                                                            
                                                                             ,,,ccc,,,,,,,, ,,, ,,,,,,,,,,,,                                                                                            
                                                                           ,,c,,cc,,,,,,,, ,,, ,,,,,,,,,,,,,                                                                                      
                                                                           ,ccc,,,,,,,,,, , , ,,,,,,,,,,  ,,,                                                                                        
                                                                           ,cc,,,,,,,,,,,, , ,,,,,,,,,,, ,,,,                                                                                           
                                                                           ,ccc,,,,,,,,,,,,,,,,,,,,,,,,   ,,,                                                                                           
                                                                           ,ccc,,,,,,,,,,,,,,,,,,,,,,, , ,,,,                                                                                           
                                                                           ,ccc,,,,,,,,,, ,,,,,,,,,,,,,   ,,,,                                                                                          
                                                                           ,cc,,,,,,,,,,,,,,,,,cc,,,,,,,   ,,,                                                                                          
                                                                           ,cTsc,,,,,,,,,,,,,cccc,,,,,, , ,,,,                                                                                          
                                                                             ,cscc,,,,,,,,,,,cccc,,,,,,, ,,,,,                                                                                          
                                                                               ,ccc,,,,,,,,cccccc,,,,,, ,,,,,,                                                                                          
                                                                                 ,cc,,,,,  ,cc,,,,,,,, , ,,,,,,                                                                                         
                                                                                  ,,,,      ,cc,,,,,,,,,,,,,c,,                                                                                         
                                                                                             cc,,,,,,,,,,,,cc,                                                                                          
                                                                                             ,ccsccccccccc,,                                                                                            
                                                                                               ,,,,,,,,,,,                                                                                              
</PRE></DIV>
<DIV id=cat15><PRE>
                                          
                                                                   ,,c,                                                                                                                                 
                                                                 ,cCRRRCc,                                                                                                                              
                                                                 ,CRRAARRRCc                                                                                                                            
                                                                 ,TTCAACAARAAs,                                                                                                                         
                                                                 ,cccTARAAAARRAc,                                          ,cc,,                                                                        
                                                                 ,s,,,cTAAACAARRAc,   , ,                              ,csCARRRC,                                                                       
                                                                 ,c,,,,ccCAACACARRAAc   ,,,,,,,,,,           ,      ,cTARRRRRRRRc,                                                                      
                                                                 ,c,,,,,,csARAACAARRRAT,, ,,,,,,,,,,,,,,,,,,,     cCAARRAARATcsc,                                                                       
                                                                 ,cc,,,,,,,cTAAAAAARRAc,,, , ,     , ,,,,, ,  ,sAAARRAAAARCcc,,,,                                                                       
                                                                 ,sc,,,,,,,cccCRRRRTc,,,,,,,,,,     ,   ,,   cRRRRACACARAsc,,,,,                                                                        
                                                                 ,csc, ,,,,,,ccccc,,,,,,,,,,,            ,,  ,,ARRAAARATc,,,,,c,                                                                        
                                                                  ,cc,, ,,,,cc,,,,,,,,,,,                 ,,    cARRRCc,,,, ,,,,                                                                        
                                                                   ,cc,, ,,,,,,,,,,,,,,,,,,                  ,   ,,ccc,,   ,,c,                                                                         
                                                                    ,cc,,,,,c,,,,,,,,,,,,,,,,,,,, ,,, ,,,,,,, ,,  ,,c,,   ,,cc,                                                                         
                                                                     ,ccc,,c,c,,,,,,,,,,,,,,,,,,,,,, , ,,,,, , , , ,,,   ,,c,                                                                           
                                                                      ccc,,,c,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,   ,,c,                                                                            
                                                                      ,c,,,c,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,c,,                                                                             
                                                                    ,cc,,,,,,,,,,,,,,,,  ,,,,,,,,,,,,,,,,,,,,,,,,,,,,,cc,                                                                               
                                                                   ,ccc,,,,,,,,,,,,,,,,ccc,,,,,,,,,,,,,, ,,,,, ,,,,,,,,,                                                                                
                                                                 ,ccc,,,,,,,,,,,,,,,cTARRCTc,,,,,,,,,,,,,,,,,ccc,,,,,,,,,                                                                               
                                                                ,cTc,,,,,,,,,,,,,,cRRRc, cART,,,,,,,,,,,,,,cCACRRCc,,,,,,,                                                                              
                                                               ,cccc,,,,,,,,,,,,,,,sRRCccTRRRc,,,,,,,,,,,,TAT,,sRRRT,,,,,,,                                                                           
                                                             ,cccc,,,,,,,,,,,,,,   ,,TRRRRAAs, ,,,,, ,,,,,CAcccsCRRA,,,,,,,,                                                                        
                                                            ,TCTccc,c,c,,,,,,,,,,,,   ,csc,               ,cARRACTc,,,,,,,,,                                                                        
                                                            ,,,,,ccccccccccccc,,,,,,,,                      ,,csc,  ,,,,,,,,,,                                                                          
                                                                ccccccccccccccc,,,,,,,,,,         ,,,,, ,         ,,,,,,,,,,,,,,                                                                        
                                                               ,cTTTcccccccccccccc,,,,,,,  , , , ,cCs,     ,   ,,,,,,,,,,,,, ,,,                                                                  
                                                                  ,,cTTcccccccccccccc,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,ccccc,                                                                       
                                                                     ,,ccscccccccccsccc,,,,,,,,,,,,,,,,,,,,,,,,,,ccccsscc,,,                                                                         
                                                                         ,,,,,,,,,,cccccccc,ccccccccc,,,,,,,,,,,,cccc,,                                                                                 
                                                                        ,,,, , ,   ,,csccccccccccccccccc,,,,,,cccc,,                                                                                    
                                                                        ,cc,,,,,,,, ,,ccccccccccccccccccccccccc,,                                                                                       
                                                                         ,,c,,,,,,,,,,,ccccccccccccccccssTcc,,                                                                                          
                                                                             ,,,,,,,,,,,,,,,,,ccccc,c,,                                                                                                 
                                                                             ,,c,c,,,,,,,,,,,,,,,,,,,,,,                                                                                                
                                                                            ,,,,,,c,,,,,,,,,,,,,,,,,,,,,,                                                                                               
                                                                           ,cc,,,c,,,,,,,,,,,,,,,,,,,,,,,                                                                                               
                                                                           ,ccc,cc,,,,,,,,,,,,,,,,,,,,,,,                                                                                               
                                                                            ,ccc,,,c,,,,,,,,,,,,,,,, ,,,                                                                                                
                                                                             ,,cc,,,,,,,,,,,,,, , , , ,,,,                                                                                              
                                                                               ,,,,,,,,,,,,,,, , , , , ,,,,                                                                                             
                                                                                ,,,,,,,,,,,,,,, ,,,,,,,,,,,                                                                                             
                                                                                ,ccccc,c,,,,,,,,,, , , ,,,,                                                                                             
                                                                             ,ccccccccc,,,,,,,,,,,,,, , ,,,                                                                                             
                                                                           ,cTcccccc,cc,,,,,,, ,,, ,,, , ,,,                                                                                            
                                                                          ,ccc,,ccccccc,,,,,,,,,,,,,,,,,,,,,                                                                                            
                                                                         ,ccc,,,ccccccc,,,,,,,,,,, , ,,,,,,,                                                                                            
                                                                        cscc,,,,ccccccc,,,,,,,,,,,,,,,,,,,,,,                                                                                           
                                                                       ,csc,,,,,cccc,c,,,,,,   ,,,,, ,,, ,,,,                                                                                           
                                                                        ,ccc,,,,ccccc,,,,,,,, , , ,,,,, ,,,,,                                                                                           
                                                                        ,ccc,,,ccccc,,,,,,,,,,,,   ,,,,, ,,,                                                                                            
                                                                         ,Tcc,,ccccccccc,,,,,,,,, ,,,,,,,,,,                                                                                            
                                                                          ,ccccccccc,ccc,,,,,,,,,, , ,,,,,,,                                                                                            
                                                                           ,ccsccccccccc,,c,,,,,, , ,,,,,,,,                                                                                            
                                                                             ,cccccccccc,,,,,,,,,, , ,,,,,,,                                                                                        
                                                                              ,cccccccc,,,,,,,,,  ,,,,,,,,,,                                                                                         
                                                                               ,cccc,,,,,,,,,,,,,,,,,,,, ,,,                                                                                            
                                                                                ccc,,,,,,,,,,,,,, ,,,,,,  ,,,                                                                                           
                                                                               ,ccc,,,,,,,,,,,,, , ,,,,, ,,,,                                                                                           
                                                                               ,cc,,,,,,,,,,,,, ,,,,,,,   ,,,                                                                                           
                                                                                ,cc,,,,,,,,,,,,, ,,,,,,, ,,,,,                                                                                          
                                                                                 ,sc,,,,,,,,,,,,, ,,,,, ,,,,,,                                                                                          
                                                                                 ,csc,,,,,,,,,,,,,,,,,,, ,,,,,                                                                                          
                                                                                  ,csc,,,,,,,,,,,,,,,,, ,,,,,,                                                                                          
                                                                                   ,TTTcc,,,,,,,,,,,,, ,,,,,,,                                                                                          
                                                                                    ,cccTcc,,,,,,,,,,,,,,,,,c,                                                                                          
                                                                                       ,,ccTcc,,,,,,,,,,,ccc,,                                                                                          
                                                                                          ,,,,,cccccccccc,,                                                                                             
                                                                                                ,,,,                                                                                                                                              
 </PRE></DIV>
<DIV id=cat16><PRE>
                                           
                                                                  ,cTc,                                                                                                                                 
                                                                 ,TRRRACTc,                                                                                                                             
                                                                ,cCRRAARRRAT,                                              ,,,                                                                          
                                                                ,ccsCRAACARRRT,,                                       ,,TCRRAc,                                                                        
                                                                ,cc,ccAAACACRRRTc                                   ,,CARRRRRRC,,                                                                       
                                                                 ,cc,ccTARAACAARAAT,    ,,,,,,,,,,       , , ,    ,cTRRRRRRRCsc,                                                                        
                                                                 ,c,,,,ccCRAACACARRRCc,,, ,,,,,,,,,,,,,,,,,,,   cTAARAAAAcccc,,,                                                                        
                                                                 cc,,,,,,ccAAACACAARRRC,,, ,,,      ,,,,,,  ,cARARRAARACcc,,,,,                                                                         
                                                                 ,c,,,,,,,ccTARAARRTcc,,,,,,,         ,,  , ,TRRRAAARCcc,,,,,,,                                                                         
                                                                 ,cc,, ,,,,,,cCAccc,,,,,,,,,,,            ,,  ,CRRRAcc,,,, ,,,                                                                          
                                                                 ,csc,, ,,,,ccc,,,,,,,,,,,,,,                   ,cAAT,,,  ,,c,                                                                          
                                                                  ,cc,,  ,,,,,,,,,,,,,,,,,,,                      ,cc,,  ,,c,,                                                                          
                                                                   ,sc,,,,,,,,,,,,,,,,,,,,, ,,,,, ,,,,,,,,,,,,,   ,,,,  ,,cc,                                                                           
                                                                    ,sc,,,,,,,,,,,,,,,,,,, , , ,,, , ,,,,, ,,, , ,,,   ,,c,                                                                             
                                                                     ,ccc,,,,,c,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,cc,                                                                              
                                                                      ,ccc,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,c,,                                                                               
                                                                      ,,,,c,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                                 
                                                                     ,cc,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,, ,,,,, ,,,,,,,,,                                                                                
                                                                   ,ccc,,,,,,,,,,,,,,,,cTCCTc,,,,,,,,,,,,,,,,,ccscc,,,,,,                                                                               
                                                                  ,cc,,,,,,,,,,,,,,,,cARATcCAAc,,,,,,,,,,,,,,CRACRAT,,,,,,,                                                                             
                                                                 ,ccc,,,,,,,,,,,,,,,cARRc  ,CRAc,,,,,,,,, ,cCAc,,CRRT,,,,,,,                                                                         
                                                                ,cccc,,,,,,,,,,,,,,,,,cAACCCARA, , ,,, , ,,cAAccCRRRc,,,,,,,                                                                       
                                                              ,cTcc,,,,,,,,,,,,,,,    ,,CRRTccc   ,         ,cARRATc, ,,,,,,,                                                                       
                                                             ,sCscc,,,,,,,,,,,,,,,,,,    ,,,,                 ,,c,   ,,,,,,,,,,,                                                                        
                                                             ,,,,cccccccccccccc,c,,,,,,,,       , ,   ,   ,       ,,,,,,,,,,  ,                                                                         
                                                                 ,scccccccccccccc,,,,,,,,,,,   , ,  ,CAc   ,     ,,,,,,,,cc,                                                                         
                                                                 cCTscccccccccccccccc,,,,,,,, ,,,,, ,cc,,,,,,,,,,,,,,cccc,,                                                                         
                                                                  ,,,ccTccccccccccccccccc,,,,,,,,,,,,,,,,,,,,,,,,,,cccc,                                                                             
                                                                       ,,cTTccccccccccccccccc,,,,,,,,,,,,,c,,,,,,,cc,                                                                                   
                                                                           ,cTTTcccccccccccccccccccccccccc,,,,ccc,,                                                                                     
                                                                               ,,cccTACcccccccccccccc,,,ccccccc,,                                                                                       
                                                                                   ,ccccccccccccccc,,,,,,,,,,,                                                                                          
                                                                                   ,c,,,,,,,,,,,cc,,,,,,,,,,,                                                                                           
                                                                                  ,,cc,,,,,,,,,,,,,,,,,,,,,,,,                                                                                          
                                                                                 ,cc,,,,,,,,, ,,,,,,,,,,,,,,,                                                                                           
                                                                                 ,cc,,,,,, , , ,,,,,   ,,,,,,                                                                                           
                                                                                 ,ccc,  , ,,, , ,,,   ,,,,,,                                                                                            
                                                                                 ,cTc,   , , ,,,,,   ,,,,,,                                                                                             
                                                                                 ,sTc,,   , , , , ,,,,,,,,,                                                                                             
                                                                                 ,ccc,,,,,,,,,   ,,,,,,,,                                                                                               
                                                                           ,cc,  ,ccccc,,,,,,,,,,,,cc,,   ,                                                                                             
                                                                        ,,ccc,,  ,cc,,,ccccc,,,,,cc,,   ,,,,                                                                                            
                                                                       ,scc,,,   ,,,,,,,ccccccccc,,,  , ,,,,                                                                                            
                                                                      ,scc,,,,  ,,cc,,,,,,,,,,,,,, ,,, ,,,,,                                                                                            
                                                                    ,,cc,,,,,,  ,,,,,,,,,,,,,,,,,,,,,,,,, ,,,                                                                                           
                                                                   ,,c,,,,,,,,  ,c,,,,,,,,,,,,,,,,,,,,,,,, ,,                                                                                           
                                                                   ,c,,,,,,,c,, ,cc,,,,,,,,,,,,,,,,,,,, ,,,,,                                                                                           
                                                                   ,,c,,,,,,,c,,,c,,,,,,,,,,,,,,,,,,,, , ,,,,                                                                                           
                                                                    ,cc,,,,,,,,,,c,,,,,,,,,,,,,,,,,,, , ,,,,,                                                                                           
                                                                    ,ccccc,,,,,,,,,c,,,,,,,,,,,,,,,,,,,, ,,,                                                                                            
                                                                    ,,ccccc,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                                           
                                                                      ,,cccccccccccc,,,,,,,,,,,,   , ,,,,,,,                                                                                            
                                                                        ,cccccccccc,,,,,,,,,,,,,,,, ,   ,,,,                                                                                            
                                                                          ,,cTscccc,,,,,,,,,,,,,,,,,,  ,,,,                                                                                         
                                                                              ,cccccc,,,,,,,,,,,,,,,,   ,,,                                                                                           
                                                                               ,cccc,,,,,,,,,,,,,,,,,  ,,,,                                                                                             
                                                                                cTccc,,,,,,,,,,,,,,,,,,,,,,,                                                                                            
                                                                                ,cscccc,,,,,,,,,,,,,,,,,,,,,                                                                                            
                                                                                 ,c,,,,,,,,,,,,,,,,,, , ,,,,                                                                                            
                                                                                     ,,,,,,,,,,,,,,,,, , ,,,                                                                                            
                                                                                    ,,c,,,,,,,,,,,,,,,, ,,,,                                                                                            
                                                                                   ,ccc,,,,,,,,,,,,,,, ,,,,,,                                                                                           
                                                                                   ,ccc,,,,,,,,,,,,,, ,,,,,,,                                                                                           
                                                                                    ,csc,,,,,,,,,,,,,, ,,,,,,                                                                                           
                                                                                     ,ccccc,,,,,,,,,,,,,,,c,,                                                                                           
                                                                                      ,cscc,,,,,,,,,,,,,cc,,                                                                                            
                                                                                       ,cscc,,,,,,,,,,,cc,                                                                                              
                                                                                        ,cTTccc,,,,,,,,                                                                                                 
                                                                                          ,,ccssTcc,,                                                                                                   
                                                                                              ,,,c,,,                                                                                                                                            
</PRE></DIV>
<DIV id=cat17><PRE>
                                          
                                                                           ,CAAc,                                                                                                                       
                                                                          cRRRRRACc,                                                                                                                    
                                                                         ,cTCARAARRAc                                                                                                                   
                                                                         ,ccccCAAAARRC,,  ,,                                                                                                            
                                                                         ,ccccCRRCACARRT,                                 ,sCTc,                                                                        
                                                                         ,cc,,cTARAACAARAT,    , ,                     ,cCRRRRRT,                                                                       
                                                                         ,c,,,,ccTRAACAARRAs,,  ,,,,,,,,,     ,,,    ,CARRRRRRCc,                                                                       
                                                                         ,cc,,,,,ccCAACACARRRC,, , ,,,,,,,,, ,,,  ,cTRRRRRCccsc,                                                                        
                                                                         ,c,,,,,,,cccCRAARRCsc,,,,,,,         , ,,ARRRAAAcc,,,,,                                                                        
                                                                         ,sc,, ,,,,,cARRscc,,,,,,,,,     , , ,   ,,CRRATc,,,,,,                                                                         
                                                                         ,sc,   ,,,,ccc,,,,,,,,,,,, ,,,             ,TRT,,,,cc,                                                                         
                                                                          ,c,,   ,,,,,,,,,,,,,,,,,,,,,               ,,,,,,,c,                                                                          
                                                                           ,c,   ,,,,,,,,,,,,,,,,,,,,,,,,,,   ,       ,  ,,cc,                                                                          
                                                                           cc,,,,,,,,,,,,,,,,,,,,,,,,, , ,,,,,,,,,,,    ,,cc,                                                                           
                                                                          ,ccc,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,, , ,,,                                                                             
                                                                         ,cc,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                              
                                                                         ,cc,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                              
                                                                        ,ccc,,,,,,,,,,,,,,,,,,,,,,,,,, ,,,,,,,,,,,,,,, ,,,                                                                              
                                                                        ,cc,,,,,,,,,,,,,,,,,,,,,,cTTTc,,,,,,,,,,,,,,,,c,,,                                                                              
                                                                       ,cccc,,,,,,,,,,,,,,,,,,,sRRTsCRRc,,,,,,,,,,,,TRRRc,                                                                              
                                                                      ,cccc,,,,,,,,,,,,,,,,,,,TRRT, ,TRTc,,,,,,, ,cCTcCRRc,                                                                          
                                                                     ,cscc,,,,,,,,,,,,,,,,,,,,,TRRATCRRT,, ,,,   ,TAc,,ARs,                                                                         
                                                                    ,cccc,,,,,,,,,,,,,,,,,,,,   ,TARRCc,    ,     ,cRRRCc,,,                                                                         
                                                                   cTCcc,,,,,,,,,,,,,,,,,,,,,,,   ,,,              ,,Tc, ,,,,,                                                                          
                                                                   ,,,ccccc,,,,,,,,,,,,,,,,,,,,,,,,     , ,             ,,,,,,,                                                                         
                                                                      ,ccccccc,,,,,,,,,,,,,,,,,,,,,,   , ,  ,sAc      ,,,,,                                                                         
                                                                      ,ccsccccccccccccccccccc,,,,,,,, ,,,,,,,,c,,,,,,,,,c,,                                                                        
                                                                        ,,cTTsccccccccccccccccccc,,,,,,,,,,,,,,,,,,,,,cc,                                                                            
                                                                           ,,cTscccccccccccccccccc,,,,,,,,,,,,,,,,,,c,,                                                                                 
                                                                               ,cTssccccccccccccccccccccccccccc,,ccc,                                                                                   
                                                                                  ,,ccsccccccccccccccccccccccccccc,,                                                                                    
                                                                                        ,ccccc,,,c,c,ccccccssscc,,                                                                                      
                                                                                      ,,ccccc,,,,,,,,,,cc,,,,                                                                                           
                                                                                   ,ccccccccc,,,,,,,,,,,,                                                                                               
                                                                                   ,Tcccccccc,,,,,,,,,,,,,                                                                                              
                                                                                  ,cccccccccc,,, , ,  ,,,,,                                                                                             
                                                                                 ,ccccc,ccccc,,,      ,,,,,,                                                                                            
                                                                                 ,cccc,,,cccc,,, ,,,   ,,,,,     ,                                                                                      
                                                                                ,cccccc,,,,,,,,,, ,        ,,,,,,,,,,,,                                                                                 
                                                                                ,ccc,,,,,,,,,,,,,, ,         ,,,,, ,,,,,                                                                                
                                                         ,,,,                   ,,cc,,,,,,,,c,c,,,, ,   ,   ,,, ,,,,,,,,                                                                                
                                                         ccc,,,                  ,cc,,,,,,,,,,ccc,,,,,   ,   ,  ,,,, ,,,                                                                                
                                                        ,cc,,,c,,                 ,,c,,,,,,,,,,cccc,,,,,,,,,,,,,,,,,,,,,                                                                                
                                                        ,,,,,,,c,,                 ,c,,,,,,,,,,,,,cccccc,c,c,,,,cccccc,                                                                                 
                                                       ,,,,,,,,,,,,                ,c,,,,,,,,,,,,,,,,,,,,,c,c,,,,,,                                                                                     
                                                       ,cc,,,,,,,,,,              ,,c,,,,,,,,,,,,,,,,,,,,,,,,,                                                                                          
                                                       ,ccc,,,,,,,,,              ,,,,,,,,,,,,,,,,,,,,,,,,, ,,                                                                                          
                                                       ,ccc,,,,,,,,,,            ,,c,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                                          
                                                       ,ccc,,,,,,,,,,,           ,cc,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                                         
                                                        ,ccc,,,,,,,,,,,,         ,cc,,,,,,,,,,,,,,,,,,,,,,,,,                                                                                           
                                                         cTcc,,,,,,,,,,,,,       ,ccc,,,,,,,,,,,,,,,,,,,,,,,,                                                                                           
                                                          ,ccc,,,,,,,,,,,,,,    ,ccc,ccc,,,,,,,,,,,,,,,,,,,,                                                                                            
                                                            ,cccc,,,,,,,,,,,,,,,ccccccccc,,,,,,,,,,,,,,,, , ,                                                                                           
                                                              ,,cccc,,,,,,,,,,cccccccc,ccc,,,,,,,,,,,,,,,,,,,,                                                                                    
                                                                  ,,ccccccccccccccscccccccc,,,,,,,,,,,,,,,,,,,,                                                                                      
                                                                      ,,,,,,,,,,,,,cccccccccc,,,,,,,,,,,,,,,,,,                                                                                         
                                                                                    ,cscccccccc,,,,,,,,,,,,,,,,                                                                                         
                                                                                     ,ccccccccc,,,,c,,,,,,,,,,,,                                                                                        
                                                                                   ,ccccc,ccccc,,,,,,,,,,,,,,,,                                                                                         
                                                                                 ,,ccccc,,,ccc,,,,,,,,,,,,,,,,,,                                                                                        
                                                                                ,cscc,c,,,,,,,,,,,,,,,,,,,,,,,,                                                                                         
                                                                                cscc,,,,,,,c,,,,,,,,,,,,,,,,,,,,                                                                                        
                                                                                ,cccc,,,,,cc,,,,,,,,,,,,,,,,,,,                                                                                         
                                                                                 ,cTcc,,,,cc,,,,,,,,,,,,,,,,,,,                                                                                         
                                                                                   ,csscccc,c,,,,,,,,,,,,,,,,,,                                                                                         
                                                                                     ,,ccccssc,,,,,,,,,,,,,,,,,                                                                                         
                                                                                        ,,,ccsTTscc,,,,,,,,,,,,                                                                                         
                                                                                            ,,,cccsTcc,,,,,,,,,                                                                                         
                                                                                                  ,,csTsc,,,,,,,                                                                                        
                                                                                                     ,,ccsTCTTc,                                                                                        
                                                                                                          ,,,,,                                                                                         
</PRE></DIV>
<DIV id=cat18>
<PRE>
  
                                                                                      ccc,                                                                                                              
                                                                                    ,CRRRT,                                                                                                             
                                                                                   ,TRRARRAc,                                                                                                           
                                                                                   ,sTTAAARRT,                                                                                                          
                                                                                   ,ccTARCAARAc                                                                                                         
                                                                                  ,ccc,cCAAAARCc   ,                                                                                                    
                                                                                  ,c,,,cARACAARAT,  ,,,                   ,,,,                                                                          
                                                                                 ,cc,,,,cTAACAARRAc,   ,,,             ,cARRAc                                                                          
                                                                                  c,,,,,,,cTAAAARRRC,   ,,,,,,, ,,,  ,ARRRRRAc                                                                          
                                                                                 ,cc,,,,,,,TARARRAcc,,,,,,,,,,   , ,CRRRAcccc,                                                                          
                                                                                ,cc,, ,,,,cCRsccc,,,,,,,,,, ,      ,ARRTc,c,,                                                                           
                                                                             ,,ccTc,   ,,,cc,,,,,,,,,,,,,,,,,,,,     ,cc,,c,                                                                            
                                                                            ,cTcccc,,   ,,,,,,,,,,,,,,,,,,,,,,,         ,,c,                                                                            
                                                                            ,cccccc,,, ,,,,,,,,,,,,,,,,,,,,,,, ,   ,    ,sc                                                                             
                                                                           ,ccccc,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,, ,     ,,,                                                                             
                                                                          ,ccccc,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,, ,,, ,                                                                                
                                                                         ,scccc,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                              
                                                                        ,ccccccc,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                             
                                                                         ,scccc,,,,,,,,,,,,,,,,,,,,,,,,,,   ,,,,,,,,,,,,,,,                                                                             
                                                                         ,cccccccc,,,,,,,,,,,,,,,,,,,,,,,ccc,,,,,,,, ,,,,,                                                                              
                                                                         ,cccccccc,,,,,,,,,,,,,,,,,,,,cTAAAACc,,,,,,, ,cTc,                                                                           
                                                                         ,,ccccccc,,,,,,,,,,,,,,,,,,,cCRT,,cRA,,,,,,,,cCRA,                                                                       
                                                                          ,cccc,c,,,,,,,,,,,,,,,,,,,,,sRRccTRC,,,,, ,,c,sRC                                                                          
                                                                         ,cccccc,,,,,,,,,,,,,,,,,,,,  ,cRRAsc,   ,   cARAAc                                                                             
                                                                          ccccc,,,,,,,,,,,,,,,,,,,,,,,  ,cc,         ,TAC,                                                                              
                                                                           csccc,,,,,,,,,,,,,,,,,,,,,,,,,               ,,                                                                         
                                                                           ,ccc,,,,,,,,,,,,,,,,,,,, ,,,,,,, ,    ,cc,   ,,                                                                          
                                                                            ,sTcccccccccccccccccccc,,,,,,,,, , ,,,,c,  ,,                                                                            
                                                                              ,cTsscccccccccc,,,c,ccc,,,,,,,,,,,,,,,,,,,,                                                                               
                                                                                ,ccTcccccccccccc,c,,,,,,,,,,,,,,,,,,,c,,                                                                                
                                                                                  ,,ccscccccccccccccccccccc,,,,cccccc,,                                                                                 
                                                                                       ,ccccccccccccccccccccccccccc,,                                                                                   
                                                                                  ,,,,,,,,,,,,ccccc,,,,,,cccsscc,,                                                                                      
                                                                                 ,cc,c,,,,,,,,,ccc,,,,,,,,,,                                                                                            
                                                                                ,cccc,c,,,,,,,cccc,,,,,,,,,                                                                                             
                                                                                cTccc,,,,,,,,,ccc,,,,, , ,,                                                                                             
                                                                               ,csc,,,,,,,,,,,,cc,,,,   , ,                                                                                             
                                                                               ,cscc,,,,,,,,,,,,,,,,,, ,,,                                                                                              
                                                                              ,,cccc,,,,,,,,,,,,,,,,,,,                                                                                                 
                                                                               ,csc,,,,,,,,,,, ,,c,,,,,,,,                                                                                              
                                                                               ,csc,,,,,,,,,,,  ,ccc,,,,, ,                                                                                             
                                                         ,cc,,                   ,cc,,,,,,,,,,,, ,ccc,,,,, ,,,                                                                                          
                                                         ,TTTcc,,                 ,c,,,,,,,,,,,,  ,,c,,,,,, , ,,,,                                                                                      
                                                          ,csccccc,,,,            ,,,,,,,,,,,,,,,,,,,cc,,,,, , ,,,,,,,                                                                                  
                                                           ,ccccccccccc,         ,,,,,,,,,,,,,,,,,,,,,ccc,,,,   , ,,,,,                                                                                 
                                                            ,ccc,ccc,ccc,,,      ,c,,,,,,,,,,,,,,,,,,,,ccc,,,, ,   ,,,,                                                                                 
                                                             ,ssccccccccc,,,,    ,c,,,,,,,,,, ,,,,,,,,,,,ccc,,,,,,,,,,,                                                                                 
                                                              ,csscccccc,,,,,,   ,cc,,,,,,,,,,,,,,,,,,,,,,,ccccccccc,                                                                                   
                                                                ccscccccc,,,,,,,,,c,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                                     
                                                                 ,cssccccc,,,,,,,,cc,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                                         
                                                                   ,csccc,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                                        
                                                                     ,csccc,,,,,,,,,,c,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                                       
                                                                       ,,cccc,,,,,,,,,cc,,,,,,,,,,,,,,,,,,,,,,,,,                                                                                       
                                                                          ,ccccc,,,,,,,c,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                                  
                                                                             ,,,ccccc,,,,,cccccccc,,,,,,,,,,,,,,,,,                                                                                   
                                                                                ,ccccccccccccccccccc,,,,,,,,,,,,,,,,                                                                                    
                                                                                cscccccccccccccccccc,,,,, , ,,,,,,,,                                                                                    
                                                                               ,cTcccccccccc,,,,,,cc,,,,,, ,,,,,,,,,                                                                                    
                                                                               ,cc,,ccccccc,,,,,  cc,,,,,,, ,,,,,,,,,                                                                                   
                                                                              ,ccc,,,,       ,,, ,cc,,,,,,,, ,,,,,,,,,                                                                                  
                                                                              ,ccc,,,,      ,,,,,,ccc,,,,,,,,,,,,,,,,,                                                                                  
                                                                              ,ccc,,,, , , ,,,,,,,,c,,,,,,,,,,,,,,,,,,                                                                                  
                                                                              ,cc,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                                 
                                                                             ,,c,,,,,,,,cc,,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                                 
                                                                              ccccsTTTCTccTCTccc, ,,c,,,,,,,,,,,,,,,,,,                                                                                 
                                                                              ,TCARATCCCccTATccT,  ,csc,,,,,,,,,,,,,,,,                                                                                 
                                                                               ,CRRCccTcccTTTTc,   ,cTCTTcscccccccccTc,                                                                                 
                                                                                 ,CRRRRRTTRRAc,      ,,,,,,,,,,,,,,,,,                                                                                  
                                                                                   ,,,,,,,,,                                                                                                                                                     
</PRE></div>
<DIV id=cat19>
<PRE>
                                          
                                                                                               ,,,                                                                                                      
                                                                                              ,ARC,                                                                                                     
                                                                                             ,CRRAc,                                                                                                    
                                                                                           ,,cTAARAc                                                                                                    
                                                                                          ,,ccsCAARs,                                                                                                   
                                                                                         ,ccc,cAAAARC,                                                                                                  
                                                                                        ,ccc,,cARCARRc  ,                                                                                               
                                                                                        ,cc,,,,cTACAARs, ,                                                                                              
                                                                                      ,,ccc,,,,cTAACARAc, ,          ,AAc                                                                               
                                                                                    ,,,cccc, ,,cTRAAARAT,, ,,,,,,, ,CRRRc                                                                               
                                                                                  ,,,,ccccc,  ,,ccARAsccc,,,,,,,  ,TRRRT,                                                                               
                                                                               ,,ccccccc,cc,  ,,cccc,,,,,,,,,,,, , ,cTc,                                                                                
                                                                              ,cccccc,,,,,,   ,,,,,,,,,,,,,,,,,,,    ,,                                                                                 
                                                                             ,ccccc,,,,,,,,, ,,,,,,,,,,,,,,,,,,,,,,                                                                                     
                                                                            ,cccccc,,,,,c,,,,,,,,,,,,,,,,,,,,,,,, ,                                                                                     
                                                                           ,cccccc,,,,,,,,,,,,,,,,,,,,,,,,,,,, ,,,,,,,                                                                                  
                                                                          ,cccc,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                               
                                                                         ,sccc,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                               
                                                                         ,cccc,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                              
                                                                         ,cccc,,,,ccccccc,,,,,,,,,,,,,,,,,,,,,   ,,,,,,,,,                                                                              
                                                                         ,cccccc,,cccccc,,,,,,,,,,,,,,,,,,,,,,ccc,,,,,,,,                                                                           
                                                                          ,ccccc,,cccccc,,,,,,,,,,,,,,,,,,,,cARACCc,,,,,,                                                                          
                                                                          ,cscc,,,ccc,cc,,,,,,,,,,,,,,,,,,,cRRA,cRC,, ,cc                                                                           
                                                                           cscc,,,,c,,,,,,,,,,,,,,,,,,,,,,,,TRRAAAc, ,,cc                                                                               
                                                                           ,ccccc,,,,,,,,,,,,,,,,,,,,,,,,,  ,cART,   ,cCc                                                                               
                                                                            ,ccccccccc,,,,,,,,,,,,,,,,,,,,,,  ,,     ,cc,                                                                          
                                                                             ,cccccccc,,,,,,,,,,,,,,,,,,,,,,,,,                                                                                    
                                                                              cTcccccccc,,,,,c,c,c,,,,,,,  ,,,,,   ,,,,,                                                                            
                                                                              ,,ccccccccccccccccccccccccc,,,,,,,,,,,,,,                                                                                 
                                                                                 ,cccccccccccccc,ccc,,,,,,,,,,,,,,,,,,,                                                                                 
                                                                                ,,cccccccccccccccccc,,,,,,,,,,,,,,ccc,,                                                                                 
                                                                                ,,,ccccccccccccccccccccccc,,,,,,ccccc,                                                                                  
                                                                                ,,,,c,,,,,,cccccccccccccccccccccccc,                                                                                    
                                                                               ,,,,,,,,,,,,,,,,,,,,cc,,,,ccccc,,                                                                                        
                                                                             ,,cc,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                                           
                                                                            ,ccccc,,,,,,,,,,,,,,,ccc,,,,,,,,                                                                                            
                                                                            ,cscc,,,,,,,,,,,,,,,ccc,,,, , ,,                                                                                            
                                                                            ,ccccc,,,,,,,,,,,, ,,c,,,, ,   ,                                                                                            
                                                                           ,ccsccc,,,,,,, , ,   ,,,,,,, ,,                                                                                              
                                                                            ,csccc,,,,,, ,,,,, ,,c,,,,,,                                                                                                
                                                                             ,cssc,,,,, , ,,,,  ,cc,,,,,, , ,,                                                                                          
                                                                              ,ccc,,,,,, ,,,,, ,,,cc,,,,,, ,                                                                                            
                                                               ,cc,,,,,         ,,,,,,, ,,, ,,,   ,cc,,,,,,,, , ,                                                                                       
                                                               ,TCTscsccc,,,,   ,c,,,,,  ,,, ,,,,, ,,cc,,,,, ,,,,,,,,,,,,                                                                               
                                                                ,,csTcccccc,cc,,,,,,,,,,, ,,, ,,,,, ,,ccc,,,,   ,,,,,,,,,,                                                                              
                                                                  ,ccscc,,,,,c,c,,,,,,,,,  ,,,,,,,,,  ,,cc,,,,,,     ,,,,,                                                                              
                                                                    ,csc,,,,,,,,,,,,,,,,,,, , , , , ,  ,,ccc,,,,, ,,,,,,,                                                                               
                                                                      ,ccc,c,c,,,,,,,,,,,,, ,, , ,,,,,,,,,,cccc,,,,ccc,,                                                                                
                                                                       ,cTccccc,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,ccc,c,,,,                                                                                 
                                                                        ,,cTcccc,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                                      
                                                                           ,csccc,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                                     
                                                                             ,cTcc,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                                     
                                                                               ,c,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                                    
                                                                                 ,ccccccccc,,,,,,,,,,,,,,,,,,,,,,,,,                                                                               
                                                                                ,cccccccccc,ccc,,,cc,,,,,,,,,,,,,,,,                                                                                 
                                                                                ,ccccccccccccccccscccc,c,,,,,,,,,,,,,                                                                                   
                                                                                csccccccccccccc,  ,,cc,,,,, , ,,,,,,,                                                                                   
                                                                               ,csccccccccccccc,   ,cc,,,,   ,,,,,,,,,                                                                                  
                                                                               ,cscccccccccccccc, ,,cc,,,,, ,,,,,,,,,,                                                                                  
                                                                               ,cTcccccccccccc,,,,,,cc,,,,,, ,,,,,,,,,                                                                                  
                                                                                 ,ccc,,,,,c,,,    ,,cc,,,,, ,,,,,,,,,,,                                                                                 
                                                                                 ,cccc,,,,,,,, , ,,,cc,,,,,,,,,,,,,,,,,                                                                                 
                                                                                  ,cccc,,,,,,,,,,,,,cc,,,,,,, ,,,,,,,,,                                                                                 
                                                                                  ,ccc,,,,,,,,csTTCTc,,,,,,,,,,,,,,,,,,,                                                                                
                                                                                  ,ccc,,,,ccccTARRRTc,,,,,,,,,,,,,,,,,,,                                                                                
                                                                                  ,cccccccccccccc,  ,cc,,,,,,,,,,,,,,,,,                                                                                
                                                                                  ccccc,c,ccccsc,    ,cc,,,,,,,,,,,,ccc,                                                                                
                                                                                 ,sTcccTTTCRAc,      ,cTTTscccccccccccc,                                                                                
                                                                                  csscARRRRCc          ,,,,,,,,,,,,,                                                                                    
                                                                                   ,cc,cc,                                                                                                                                                        
</PRE>
</DIV>
<DIV id=cat20>
<PRE>
                                         
                                                                                                                           ,                                                                            
                                                                                                                      ,,,,,,                                                                            
                                                                                                                   ,,,,,,,,,                                                                            
                                                                                                                 ,,,,,,,,,,                                                                             
                                                                                                               ,,,,,,,,,,,                                                                              
                                                                                                     ,,,,   ,,,,,,,,,,,,,                                                                               
                                                                                             ,,, ,,,,,,,,,,,,,,,,,,,,,,,                                                                                
                                                                                          ,,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                                 
                                                                                       ,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                                  
                                                                                    ,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                                   
                                                                                   ,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                                   
                                                                                  ,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,cc,,                                                                                 
                                                                                 ,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                                
                                                                                ,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                               
                                                                              ,ccc,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                              
                                                                              ,cc,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                             
                                                                              ,cc,,,,c,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                              
                                                                              ,cc,,,ccc,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                              
                                                                              ,ccccccccc,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                              
                                                                              ,ccccccccccccc,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                          
                                                                              ,Tcccccccccccccc,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                          
                                                                              ,cccccccccccccccccc,,,,,,,,,,,,,,,,,,,,,,,,,                                                                          
                                                                               ,ccccccccccccccccccc,,,,,,,,,,,,,,,,,,,,,,                                                                               
                                                                                cccccccccccccccccccc,,c,,,,,,,,,,,,,,,,,,                                                                               
                                                                                cTcccccccccccccccccccccc,,,,,,,,,,,,,,,,,                                                                          
                                                                                ,cccccccccccccccccccccccc,,,,,,,,,cc,,,,,                                                                         
                                                                                ,csTcccccccccccccccccc,c,cccc,,,,c,ccc,,,                                                                          
                                                                                  ,cTsccccccccccccccccccccccccc,,,,,,c,,                                                                                
                                                                                     ,cscccccccccccccccccccccccc,c,,,,,                                                                                 
                                                                                ,,,    ,csccccccccccccccccccccccccccc,                                                                                  
                                                                            ,,,,,,,,,, ,,,,,,,,,,,,,,ccccccccccccccc,                                                                                   
                                                                           ,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,ccTsc,                                                                                    
                                                                         ,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                                      
                                                                        ,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                                        
                                                                      ,,cc,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                                        
                                                                      ,,c,,,,,c,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                                       
                                                                      ,,,,,,,ccc,,,,,,,,,,,,,,,, , ,,,,,,,,, , ,,                                                                                       
                                                                      ,,cc,cccccc,,,,,, , ,,,,, , , ,,,,,,, ,,,,,                                                                                       
                                                                       ,cTcccsccc,,,,,,,,, ,,,,,,, , ,,,,,,,,,,,,,                                                                                      
                                                                        ,,,,,,cccc,,,,,,,,, ,,,,,,, ,,,,ccc,,,,,,,,                                                                                     
                                                                              ,ccc,,,,,,,,,,,,,,,,,, , ,,,c,,,,,,,                                                                                      
                                                                        ,,    ,ccc,,,,,,, ,,, ,,,,, , , ,,,,,,,,,,,,                                                                                    
                                                                       ,cTcc,,,ccc,,,,,,,,   ,,,,,,, ,,,,,,,,,,,,,,,,                                                                                   
                                                                       ,cccccc,,,,,,,,,,,,,   , , ,,,,,,,,,,,c,,,,,,,                                                                                   
                                                                         ,cccc,,,,,,,,,,,,,,   , , ,,,,,,,,,,,cc,,,,,,                                                                                  
                                                                          ,cccc,,,,,c,,,,,,,,,,,, ,,, ,,,,,,,,,cc,,,,,,,,                                                                               
                                                                            ,ccc,,,,,,,c,c,c,,,,,,,, , ,,,,,,,,,cc,,,,,,                                                                                
                                                                             ,ccc,,,,,,,,,,,c,,,,,,,,,,,,,,,,,,,,,ccc,,,                                                                                
                                                                               ,cc,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,c,,                                                                                 
                                                                                ,cc,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                                    
                                                                                 ,cccc,c,,,,,c,,,,,,,,,,,,,,,,,,,,,,                                                                                    
                                                                                 ,ccccccc,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                                   
                                                                                 ,cccccccccc,,,,,,,,,,,,,,,,,,,,,,,,,                                                                          
                                                                                ,,ccc,,,,,c,,,,cccc,,,,,,,,,,,,,,,,,,                                                                              
                                                                                ,cccccc,,,,,,ccccccc,ccc,c,,,,,,,,,,,,                                                                                  
                                                                                csccccccc,,,cccc,,ccccc,,,,,,,, ,,,,,,                                                                                  
                                                                               ,cTcccccccccccccc,   cc,,,,,,   ,,,,,,,                                                                                  
                                                                               ,cscccccccccccccc,   cc,,,,, , ,,,,,,,,,                                                                                 
                                                                                ,ccc,c,ccccccc,,,, ,cc,,,,,, , ,,,,,,,,                                                                                 
                                                                                 ,ccc,,,,,,,,    ,,,cc,,,,,,,,,,,,,,,,,                                                                                 
                                                                                 ,cccc,,,,,, ,     ,cc,,,,,,,,,,,,,,,,,,                                                                                
                                                                                  ccccc,,,,,,,, ,,,,cc,,,,,,,,,,,,,,,,,,                                                                                
                                                                                  ,ccccc,,,,,,,,,,,ccc,,,,,,,,,,,,,,,,,,                                                                                
                                                                                  ccccc,,,,,,,,cTCsccc,,,,,,,,,,,,,,,,,,,                                                                               
                                                                                 ,cccccccccccccTAC, ,,c,,,,,,,,,,,,,,,,,,                                                                               
                                                                                 ,ccccccccccTTT,,    ,cc,,,,,,, ,,,,,cc,,                                                                               
                                                                                ,ccccTCAAATcc,,      ,,TTTccccccccccccc,                                                                                
                                                                                 ,cARRRCCc,            ,,,,,,,c,,,,,,                                                                                   
                                                                                  ,cc,                                                                                                                                                             
</PRE>
</DIV>
<DIV id=cat21>
<PRE>
                                          
                                                                                             ,,,,,                                                                                                      
                                                                                  ,,,,,,,,,,,,,,,,,,,,,,                                                                                                
                                                                     ,           ,,,,,,,,,,,,, ,,,,,,,,,,,,,,,  ,,,,,,                                                                                  
                                                                 ,,,,,,,,,,,,   ,,,,,,,,, ,,, ,,, ,   ,,,,,,,,,,,,,,,,,                                                                                 
                                                                ,cc,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,, ,,,,,,,,,,,,,,,,,,,,,                                                                                
                                                                ,,c,,,,,,,,,,,,,,,,,,,,,,,,,,,, , ,,, , ,,,,,,,,,,,,,,,,                                                                                
                                                                 ,c,,,,c,,,c,,,,,,,,,,,,,,,,,, ,,,,, , ,,,,,,,,,,,,,,,,,                                                                                
                                                                 ,,,c,,,ccc,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                                
                                                                  ,ccccccccc,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                                
                                                                  ,cTcccccc,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                                 
                                                                    ,cscccc,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                                 
                                                                     ,,ccc,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                               
                                                                       ccc,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                              
                                                                      ,cc,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                          
                                                                    ,ccc,,,,,,,,,c,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                 
                                                                   ,csc,,,c,,,,,,,,,c,c,c,c,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                       
                                                                  ,ccccccccccc,c,c,ccccccccc,c,ccc,,,,,c,,,,,,,,,,,,,,,,,,,,,,                                                                          
                                                                 ,ccc,c,ccccccccccc,c,ccccccccccccc,c,ccc,,,,,,,,,,,,,,,,,,,,,,,                                                                        
                                                               ,cTccccccc,cc,c,cccccccccccccccccccccccccc,,,,,,,,,,,,,,,,,,,,,                                                                    
                                                              cCCTscccccccccccccccccccccccccccccccccccc,,,,,,,,,c,,,,,,,,,,,,                                                                     
                                                              ,,,,,ccccccccccccccccccccccccccccccccc,cc,,,,,,,,cccccccccc,,,                                                                         
                                                                  ,cCsscccccccccccccc,,,,,c,c,c,,,,,,,,,,,ccc,ccccccsc,,,                                                                               
                                                                     ,,csTcccccccc,,,,,,,,,,,,,,,,,,,,,,,ccccccccTcc,                                                                                   
                                                                          ,cTcsc,,,,,,,,,,,,,,,,,,,,,,,,c,cccccsc,                                                                                      
                                                                             ,cc,,,,,,,,,,,,,,,,,,,,,,,,,,,cccc,                                                                                        
                                                                              ,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                                        
                                                                             ,c,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                                     
                                                                            ,cc,,,,,,,c,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                                   
                                                                           ,,c,,,,,,,ccc,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                                  
                                                                           ,c,,,,,,,ccc,,,, ,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                                  
                                                                           ,ccc,,,,,,cc,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                                  
                                                                            ,cscc,,cccc,,,,,      , , , ,,, ,,,,,,,,,,                                                                                  
                                                                             ,cccccccc,,,,,,   ,,,   , , , ,,,,,,,,,,,                                                                                  
                                                                              ccccccccc,,,,,,,,,,,, ,   , , ,,,,,,,,,,,                                                                                 
                                                                              ,ccccccc,,,,,,,,,ccc,,,,,,     ,,,,, , ,                                                                                  
                                                                               ,cccccc,,,,,,, ,cc,,,,,,,,,,   ,,,,,,,,,                                                                                 
                                                                               ,,ccccc,,,,,,  ,cccc,,,,,,,,,,  ,,,,,,,,                                                                                 
                                                                                 ,ccc,,,,,,,, ,,ccc,,,,,,,,,,,,,,ccc,,                                                                                  
                                                                                 ,cccc,,,,,,,, ,,ccc,c,,,,,,,,,,,ccc,                                                                                   
                                                                                 ,ccccc,,,,,,,, ,,ccc,,,,,,,,,,,,,,,                                                                                    
                                                                                 ,ccc,,,,,,,,, , ,cccc,,,,,,,,,,,,,,                                                                                    
                                                                                 ,ccc,,,,,,,,,,   ,cccc,,,,,,,,,,,c,,                                                                                   
                                                                                 ,cccc,,,,,,,,,,  ,,cccc,,,,,,,,,,,,,                                                                                   
                                                                                 ,ccccc,,,,,,,,,,,,,cccccc,,,,,,,,,,,                                                                                   
                                                                                 ,cccc,,,,,,,,,,,,,,,ccccc,,,,,,,,,,,                                                                                   
                                                                                  cccc,,,,,,,,,,,,,,,,cccc,,,,,,,,,,,                                                                                   
                                                                                 ,cccc,,,,,,,,,,,,,,,,,ccc,c,,,,,,,,                                                                                
                                                                                ,ccccccc,,,,,,,,,,,,,,,,ccc,,,,,c,,,                                                                                 
                                                                               ,cscccccc,,,,,,,,,cccccccccccccccc,,,                                                                                    
                                                                              ,sscccccccc,,,,,ccccccccccccccccc,,,,,                                                                                    
                                                                              ,Tcccccccccccccccccccccccc,,,,,,,, ,,,,                                                                                   
                                                                              ,cc,,,,,,ccccccccc,,,,ccc,,,,,    ,,,,,,                                                                                  
                                                                              ,sc,,,,,,, ,,,,,,,   ,cc,,,,,,   , ,,,,,                                                                                  
                                                                             ,ccc,,,,,,     ,,,,   ,cc,,,,, ,,, ,,,,,,,                                                                                 
                                                                             ,cc,,,,,  ,   ,,,,,   ,ccc,,,,, ,,,,,,,,,,,                                                                                
                                                                             ,ccc,,,,,, , ,,,,,,,  ,ccc,,,,,,,, ,,,,,,,,,                                                                               
                                                                             ccc,,,,,,,,,,,,,,cc,  ,cc,,,,,,,,,,,,,,,,,,                                                                                
                                                                            ,cccc,,,,,,,,,,,ccTTc  ,ccc,,,,,,,,,,,,,,,,,,                                                                               
                                                                             ,cccc,,,,,,cccccTsc,  ,TTc,,,,,,,,,,,,,,,,,,                                                                               
                                                                              ,cc,c,c,ccccccTc,    ,cTTc,,,,, , ,,,,,,c,                                                                                
                                                                              ,ccccccTTccTTc,,       ,cCTc,,,,,,,,,,,,,                                                                                 
                                                                               ,cCAARRRsc,,            ,ccccccccc,,,,                                                                                   
                                                                                 ,sCCTc,                  ,,,,,,,,                                                                                      
</PRE>
</DIV>
<DIV id=cat22>
<PRE>
                                          
                                                           ,,,,,                                                                                                                                        
                                                          ,,,,,,,,,,,,                                                                                                                                  
                                                           ,,,,,,,,,,,,,,,        ,,,,,,,,,, ,                                                                                                          
                                                            ,,,,,,,,,,,,,,,,, ,,,,,,,,,,,,,,,,,,,,,                                                                                                     
                                                              ,c,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                                                  
                                                               ,cc,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                                               
                                                                ,,cc,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                                              
                                                                 ,,cc,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                                            
                                                                  ,,cc,,,,,,,c,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                                           
                                                                     ,,cccccc,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                                         
                                                                      cccccc,,,c,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                                        
                                                                    ,cccccccccc,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                                       
                                                                   ,,ccccccccc,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                                      
                                                                   ,cccccccc,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                                       
                                                                   ,cccccc,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                                      
                                                                   ,ccccc,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                                 
                                                                   ,cccc,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                                 
                                                                   ,cccc,,c,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                                  
                                                                    ,ccc,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                                      
                                                                    ,cscccc,c,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                                       
                                                                    ,ccc,ccccc,,,,,,,,,,,,,,,,,,,,,ccc,,,,,,,,,c,                                                                                  
                                                                     ,cccccc,,,,,,,,,,,,,,,,,,,,,cccc,,,,,,,,,,,,                                                                                   
                                                                      ,Tcccc,c,c,ccc,c,c,ccc,ccccccccc,,,,,,cc,                                                                                      
                                                                       ,cccccccccccccccccccccccccccc,,,,,,c,,,                                                                                      
                                                                       ,cTcccccccccccccccccccccccc,,,c,,,ccc,                                                                                           
                                                                        ,,scccccccccccc,c,,,,,,,,,,,,,,,cc,                                                                                             
                                                                          ,ccccccccc,,,,,,,,,,,,,,,,,,,,,,,                                                                                             
                                                                           ,cccsRAc,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                                         
                                                                             ccssc,,,,,,,,,,c,,,,,,,,,,,,,,,,,,,,,                                                                                      
                                                                                ,,,,,,,,,,,,c,,,,,,,,,,,,,,,,,,,,,,                                                                                     
                                                                                ,c,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                                   
                                                                               ,,,,,,,,,,,,c,,,,,,, ,,,,,,,,,,,,,,,,,,                                                                                  
                                                                              ,,,,,,,,,,,,,c,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                                  
                                                                              ,c,,,,,,,,,,,,,,,,,,,,,,, ,,, ,,, ,,,,,,                                                                                  
                                                                             ,,c,,,,,,,,,c,,,,,,,,,, , ,,, , , ,,,,,,                                                                                   
                                                                             ,,,,,,,,,,,,,,,,,,,,,, ,,,,,,,,,,,,,,,,    ,cc,,                                                                           
                                                                             ,,,,,,,,cc,,,,,,,,,,, , ,,,,,,, ,,,,,,,    ,ccc,,                                                                          
                                                                             ,,,,,,cccc,,,,,,,,,,,, ,,,,,,,,, , ,,,     ,cc,c,,,                                                                        
                                                                             ,,,,,csc,,,,,,,,,,,,,,, , , ,,,,,, ,,,     ,cccc,,,,                                                                       
                                                                             ,,,cc,,,,,,,,,,,,,,,,,,,,,,,,,,,,, ,,,     ,cccc,,,,,,                                                                     
                                                                             ,,ccccc,,,,,,,,,,,,,,,,,,,,,,,,,,,,        ,ccc,,,,,,,                                                                     
                                                                              ,,csccc,,,,,,,,,,,,,,,, , , , ,,,,,       ,cccc,,,,,,                                                                     
                                                                                ,,,,,c,,,,,,,,,,,,,,,, ,,,,,,,,,,,     ,cccccc,c,,,,                                                                    
                                                                                   ,ccc,c,,,,,,,,,,,,,,,,,,,,,,,,,     ,cccccccc,,,,,                                                                   
                                                                                   ,cccc,,,,,,,,,,,,,,,,,,,,,,,,,,     ,cccccc,,,,,,                                                                    
                                                                                    ,cccc,,,,,,,,,,,,,,,,,,,,,,,,,,     ccccc,,,,,,,                                                                    
                                                                                    ,ccccc,c,,,,,,,,,,,,,,,,,,,,,,,    ,cccccc,,,c,,                                                                    
                                                                                   ,ccccccccc,,,,,,,,,,,,,,,,,,,,,, ,,ccccc,,,,,cc,                                                                     
                                                                                  ,ccccccccccc,c,,,,,,,,,,,,,,,,,,,ccscccccc,,,c,,                                                                 
                                                                                 ,ccccccccccc,,,,,,,,,,,,,,,,,,,,,ccccccccccccc,,                                                                    
                                                                                cTccccccccccc,,,,,,,,,,,,ccccc,ccccccccccccsTc,                                                                         
                                                                                cTccccccccccc,,,,,,,,cccccccccccscscscsssc,,,                                                                           
                                                                               ,ccc,,,,,,ccccccc,,,,cccccccccc,,,                                                                                       
                                                                               ,ccc,,,,,   ,,,ccc,cccccccc,,,,,                                                                                         
                                                                               ,cccc,,,,       ,,,,ccc,,,,,,,,,,                                                                                        
                                                                               ,ccc,,,,,, , ,   ,,,,ccc,,,,,,,,,,,                                                                                      
                                                                               ,ccc,,,,,,,,,,,,,,,,cccccc,,,,, , ,,,                                                                                    
                                                                              ,,ccc,,,,,,,,,,,,,ccccccccc,,,,,,,, ,,                                                                                    
                                                                              ,ccccc,,,,,,,ccTTccccccccc,,,,,,,,,,,,                                                                                    
                                                                                csccc,c,cccccACccccccccc,,,,,,,,, ,,,                                                                                   
                                                                                cTcccccccccccccccccccccc,,,,,,,, , ,,,                                                                                  
                                                                                ,cccccccccccc,ccccscccccc,c,,,,,,,,,,                                                                                   
                                                                                 ,cccccc,c,,cCCT, ,cTTTTsccccc,ccc,,,                                                                                   
                                                                                  ,cTcsCACATTAC,    ,,,,ccccTcc,,,,                                                                                     
                                                                                   ,,sCRRRCc,              ,,,                                                                                          
                                                                                     ,,,,                                                                                                                                                           
</PRE>
</DIV>
<DIV id=cat23>
<PRE>
                                          
                                                                       ,,,,                                                                                                                             
                                                                       ,,c,,,,                                                                                                                          
                                                                         ,,,,,,,,                                                                                                                       
                                                                          ,,,,,,,,                                                                                                                      
                                                                          ,,,,,,,,,,                                                                                                                    
                                                                           ,c,,,,,,,,,   ,,,,,,,                                                                                                        
                                                                           ,cc,,,,,,,,,,,,,,,,,,,,,                                                                                                     
                                                                            cRc  ,,,,,,,,,,,,,,,,,,,,,                                                                                                  
                                                                            cRRA, ,,,,,,,,,,,,,,,,,,,,,,,                                                                                               
                                                                            ,cRR, ,,,,,,,,,,,,,,,,,,,,,,,,,                                                                                             
                                                                           ,,cARC,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                                           
                                                                          ,ccccCRC,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                                          
                                                                        ,cssscccscc,,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                                        
                                                                       ,csssccccccc,,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                                        
                                                                      ,cccccccccccccc,,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                                      
                                                                     ,,ccccccccc,ccccc,,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                                     
                                                                     ,ccccccc,c,ccc,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                                     
                                                                     ,,scccccc,c,c,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                                    
                                                                     ,csccccccccc,ccc,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                                    
                                                                     ,cTsccccccccc,c,c,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                                    
                                                                      csccccccccccccccc,,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                                    
                                                                      ,cCCcccccccccc,c,,,,,,,,,,,,,,,,,,,,,,,,,,,c,                                                                                     
                                                                       cRRccccccscc,,,,,,,,,,,,,,,,,,,,,,,,,,,,,c,                                                                                      
                                                                       ,TAcccccccccc,,,,,,,,,,,,,,,,,,,,,,,,,,,c,,                                                                                      
                                                                         ,TTccccccccccccc,,,,,,,,,,,,,,,,,,,,,,c,                                                                                       
                                                                          ccccccccccccc,,,,,,,,,,,,,,,,,,,,c,cc,                                                                                        
                                                                          ,cTccccccccccccc,,,,,,,,,,,,ccccccccc                                                                                         
                                                                          ,csccsAAcccccccccccccccccccccsscccc,,                                                                                         
                                                                          ,cscARAsccccccccscssscccsccsscscc,                                                                                            
                                                                          ,sTTTTcccccccccccccscscscTssccc,                                                                                              
                                                                           ,csccccccssTTTsTsssTsTsscc,cc,                                                                                               
                                                                            ,TCTcsccc,,,,c,,,,,,,,,,,,,,,,,                                                                                             
                                                                             ,cTCscc,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                                         
                                                                               ,,cc,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                                      
                                                                                 ,c,,,,,,,,,c,,,,,,,,,,,,,,,,,,,c,,                                                                                     
                                                                                ,c,,,,,,,,,,cc,,,,,,,,,,,,,,,,,,,,,,                                                                                    
                                                                                ,c,,,,,,,,,,,cc,,,,,,,,,,,,,,,,,,,c,                                                                                    
                                                                                ,c,,,,,,,,,,,cc,,,,,,,,,,,,,,,,,,,c,                                                                                    
                                                                                cc,,,,,,,,,,ccc,c,,,,,,,,,,,,,,,,,c,            ,,,,                                                                    
                                                                                ,c,,,,,,,,,ccc,,,,,,,,,,,,,,,, ,,,,            cTc,,,                                                                   
                                                                                cc,,,,,,,,,cc,,,,,,,,,,,,,,,,,,,,,,           ,cc,,,,                                                                   
                                                                                ,c,,,,,c,,,,,,,,,,,,,,,,,,,,,,,,,,            cTcc,,,,                                                                  
                                                                                ,c,,,cTTTc,,,,,,,,,,,,,,,,,,, ,,,            ,sTcc,,c,,                                                                 
                                                                                ,,,,,ccscc,,,,,,,,,,,,,,,,,,,,,,             ,cTcc,,,,,,                                                                
                                                                                 ,c,cccc,,,,,,,,,,,,,,,,,,,,,,,             ,cscccccc,c,                                                                
                                                                                 ,cc,sTc,,,,,,,,,,,,,,,,,,,,,,,,            ,ccsccccccc,,                                                               
                                                                                 ,cc,,ccc,,,,,,,,,,,,,,,,,,,,,,,            ,cscscccccc,,                                                               
                                                                                 ,,c,,,c,,,,,,,,,,,,,,,,,,,,,,,,,           ,Tsccsccccc,,                                                               
                                                                                  ,,ccc,,,,,,,,,,,,,,,,,,,,,,,,,,           ,Tscccccccc,,                                                               
                                                                                   ,cccc,,,,,,,,,,,,,,,,,,,,,,,,,,         ,cTcccccccccc,                                                               
                                                                                   ,ccccccc,ccc,,,,,,,,,,,,,,,,,,,       ,sTTcccccccccc,,                                                               
                                                                                   ,,ccccccccccc,,,,,,,,,,,,,,,,,,,    ,cTTsccccccccccc,,                                                               
                                                                                    ,,cccccccccc,,,,,,,,,,,,,,,,,,,  ,csTsscccccccccc,                                                                  
                                                                                    ,ccccccccc,,,,,,,,,,,,,,,,,,,,,,,ccccccccccccscc,                                                                   
                                                                                    ,,ccc,ccccc,,,,,,,,,,,,,ccc,,,,,c,,,ccTTTTTTc,,                                                                     
                                                                                    ,ccc,ccccc,,,c,,,,,,,,ccsscccscTsscssCTTc,,                                                                         
                                                                                   ,,cccccc,,,,,,,,,,,,,,cccccccc,,,,,,                                                                                 
                                                                                   ,cccccc,,,,,,,,,,,,,,,ccccc,,                                                                                        
                                                                                   ,ccc,,,,,,,,   , ,,,,ccc,,,,                                                                                         
                                                                                   ,cccc,,,,,,,,,,,,,,,,,,,,,,,,                                                                                        
                                                                                   ,cccccc,,,,,,, , ,,,,,,,,,,,,                                                                                        
                                                                                   ,cTccccc,,,,,,,,,,,,,,,,,,,,,,,                                                                                      
                                                                                    ,cTcccc,,,,,,,,,,,,,c,,,,,,,,,                                                                                      
                                                                                    ,cTccc,,,,,,,ccsTCTccc,,,,,,,,,,                                                                                    
                                                                                    ,cCcccc,,,,cCCsTRRRTc,,,,,,,,,,                                                                                     
                                                                                     cCscccccccTARTccccsc,,,,,,,,,,                                                                                     
                                                                                     ,TcccccTsscccccccccc,,,,,,,,,,                                                                                     
                                                                                     ,cssccccccccccccTTTTTsTTTcc,,                                                                                      
                                                                                     ,csscccc,,,,,ccTscccccccc,,                                                                                        
                                                                                      ,TcTAACTTCCRRA,                                                                                                   
                                                                                      ,CTsARRRRRRRC,                                                                                                    
                                                                                       ,TCTCAACTc,                                                                                                      
                                                                                        ,,,                                                                                                             
</PRE>
</DIV>
<DIV id=cat24>
<PRE>
                                          
                                                                                ,sCc                                                                                                                    
                                                                                ,RRT,,,                                                                                                                 
                                                                                ,TRT,,,,,                                                                                                               
                                                                                 cRRT, ,,,,                                                                                                             
                                                                                ,cRRR,,,,,,,                                                                                                            
                                                                                ,TRRAc,,,,,,,,,,,,                                                                                                      
                                                                                ,cRRRRs,,,,,,,,,,,,,,,,                                                                                                 
                                                                             ,,,,cRRRRC,,,,,,,,,,,,,,,,,,                                                                                               
                                                                            ,,,, cRRRRAc,,,,,,,,,,,,,,,,,,,                                                                                             
                                                                             ,,,,,cARRAc,,,,,,,,,,,,,,,,,,,,                                                                                            
                                                                          ,,,,,,cccARRAc,,,,,,,,,,,,,,,,,,,,,,                                                                                          
                                                                          ,,,,,ccscccccc,,,,,,,,,,,,,,,,,,,,,,,,                                                                                        
                                                                        ,,,,,,ccccccccsc,,,,,,,,,,,,,,,,,,,,,,,,,                                                                                       
                                                                      ,,,,,,ccccccccccccc,,,,,,,,,,,,,,,,,,,,,,,,,                                                                                      
                                                                     ,cc,,,cccc,c,,,,,c,ccc,,,,,,,,,,,,,,,,,,,,,,,,                                                                                     
                                                                     ,cc,,,,,c,,,,,,,c,cccccc,,,,,,,,,,,,,,,,,,,,,,,                                                                                    
                                                                    ,cccccc,c,,,,,,,,,,cc,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                                    
                                                                    ,ccc,c,c,ccc,ccccccc,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                                    
                                                                    ,,ccccccccccccccccc,,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                                    
                                                                     ,cTcccccccccccccc,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                                    
                                                                      cTcTTcccccccc,c,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                                    
                                                                      ,ccRRAsccccc,c,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                                    
                                                                       ,sARRAccccc,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                                     
                                                                        ,ARRCccccccccc,,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                                     
                                                                         ,ARRccccccccccccc,,c,,,,,,,,,,,,,,,,,,,cc,                                                                                     
                                                                          ,TTccccccscccccccc,c,,,,,,,,,,,,,,,,,ccc,                                                                                     
                                                                         ,ccccccccccccccscccccc,,,,,,,,,,,,,,,csc,                                                                                      
                                                                        ,cTTcccccccccccccccccc,,,,,,,,,,,,,ccTsc,                                                                                       
                                                                        ,cTccccccTRRAscccccccccccccc,,,,,ccssc,                                                                                         
                                                                         ,ccsccccsTCsccccccscccccscscccTCCc,                                                                                            
                                                                          ,cCsccccccccssTTTsscscscssTsTTc,                                                                                              
                                                                           ,cTTTccccccc,,,,,csTTsTsscc,,                                                                                                
                                                                            ,cTTTTTccc,,,,,,,,,,,,,,,,,,,,,,                                                                                            
                                                                                ,,ccc,,,,,,,,,,,,,,,,,,,,,,,,,                                                                                          
                                                                                   ,ccc,,,,,,,,,,,,,,,,,,,,,,,,,                                                                                        
                                                                                    ,cc,,,,,,,,,,,,,,,,,,,,,,,,c,,                                                                                      
                                                                                    ,,c,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                                      
                                                                                     ,cc,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                                      
                                                                                     ,ccc,,,,,,,c,,,,,,,,,, ,,,,,,                 ,,,c,                                                                
                                                                                   ,,ccc,,,,,,,,,,,,,,,,,,,, ,,,,                 ,scc,,                                                                
                                                                                   ,cccc,,,,,,,c,,,,,,,,,,,,,,,,                 ,ccc,,,,                                                               
                                                                                   ,cccc,,,,,,cc,,,,,,,,,,,,,,,,                ,cscc,,c,,                                                              
                                                                                  ,,cc,,cc,,,,,c,,,,,,,,,,,,,,                 ,ccccc,,cc,                                                              
                                                                                  ,cc,,,,c,,,,cc,,,,,,,,,,,,,,                 ,TTc,,,,,,,,                                                             
                                                                                  ,cc,,,,,cc,,ccc,,,,,,,,,,,,,,               ,cTcc,c,c,c,,                                                             
                                                                                  ,cc,,,,,,c,,,ccc,,,,,,,,,,,,,               ,ccccccccccc,                                                             
                                                                                 ,cc,,,,,,,,,,,,,,,,,,,,,,,,,,,               cTccccc,cccc,                                                             
                                                                                 ,cc,,,,,,,,,,,,,,,,,,,,,,,,,,,,             ,cCcccccc,ccc,                                                             
                                                                                  ,cc,,,,,,,,,,,,,,,,,,,,,,,,,,,             ,cTccccc,ccc,,                                                             
                                                                                   ,cc,,,,,,,,,,,,,,,,,,,,,,,,,,            ,ssscccccc,c,,                                                              
                                                                                   ,ccc,,,,,,,,,,,,,,,,,,,,,,,,,,        ,,cTsccccccc,ccc,                                                              
                                                                                    ,cc,,,,,,,,,,,,,,,,,,,,,,,,,,      ,,sCTsccscscccccc,                                                               
                                                                                    ,cc,,,,,,,,,,,,,,,,,,,,,,,,,c,   ,,cTscccccccccccc,                                                                 
                                                                                     ,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,c,,,,ccccccsTc,                                                                  
                                                                                    ,,c,,,,,,,,,,,,,,,,,,,,,,,ccc,,,,,,,,,ccTTCsc,,                                                                     
                                                                                   ,,c,,,,,,,,,,,,,,,,,,,,,,,cTCTscccTcscsTCcc,                                                                         
                                                                                   ,c,,,,,,,,,,,,,,,,,,,,,,,csc,,,,,,,,                                                                                 
                                                                                   ,cc,,,,,,,,,,,,,,,,,,,,,cc,,                                                                                         
                                                                                   ,cc,,,,,,,,,,,,,   , ,,,c,                                                                                           
                                                                                   ,c,,,,,,,,,,,,,,,,,,, ,,,,                                                                                           
                                                                                   ,cc,,,,,,,,,,,,,,,,, ,,,,,,,                                                                                         
                                                                                    ,cc,,,,,,,,,,,,,,,,,,,,,,,,,                                                                                        
                                                                                     ,ccc,,,,,,,,,,,,,,,,,,,,,,,,                                                                                       
                                                                                      ,ccc,,,,,,,,,,,,,,,,,,,c,,,,                                                                                      
                                                                                       ,cc,,,,,,,,,,,,,,,cTCTcc,,                                                                                       
                                                                                        ,cc,,,,,,,,,,c,ccTRRT,,,,,                                                                                      
                                                                                         ,ccc,,,,,,cccccccACc,,,,                                                                                       
                                                                                          ,c,ccccccccsTRACccccc,                                                                                        
                                                                                         ,ccccccccccTTCAT,,,,                                                                                           
                                                                                         ,csccsAARRRc,                                                                                                  
                                                                                         ,TCTcRRRRC,                                                                                                    
                                                                                          ,csccc,                                                                                                                                                  
</PRE>
</DIV>
<DIV id=cat25>
<PRE>
                                         
                                                                                       ,Tc                                                                                                              
                                                                                     ,cRRRc,                                                                                                            
                                                                                    cARRRRRc,                                                                                                           
                                                                                   ,TRRRARRC,,,                                                                                                         
                                                                                 ,ccsRRARRRAc,,,,                                                                                                       
                                                                                ,c,,cRRRARRCc,,,,,,,                                                                                                    
                                                              ,cc,  ,         ,,,,,sRRRARRRCcc,,,,,,,,,                                                                                                 
                                                              ,ARRAc,,,,,,   ,,,,,,ARRARARRCcc,,,,,,,,,,,                                                                                               
                                                              ,TRRRRT,,,,,,,,,,  cRRRRRARRRCccc,,,,,,,,,,,,                                                                                             
                                                               ,sRRRRRc,,,,, ,   ,TRRRRRRRRAcc,c,,,,,,,,,,,,,                                                                                           
                                                                 cTsRRc,,,,,,,,,,,,cTRRRRATcc,,,,,,,,,,,,,,,,,,                                                                                         
                                                                  ,cc,,,,, ,,,,,,,,cccccccccc,,,cc,,,,,,,,,,,,,,                                                                                        
                                                                   ,c,,,,,,,,,,,,,,,c,,,,,ccc,,,,c,,,,,,,,,,,,,,,                                                                                       
                                                                  ,c,,,,,,,,,,,,,,,,,,,,,ccc,, ,,,,,,,,,,,,,,,,,,,,                                                                                     
                                                                 ,c,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,c,,,,,,,,,,,,,,,,,,                                                                                    
                                                                 ,cc,,,,,,,,,,,,,,,,,,,,,,,,,c,cccc,,,,,,,,,,,,,,,,,                                                                                    
                                                                 ,ccc,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                                    
                                                                 ,cc,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                                    
                                                                 ,Tc,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                                    
                                                                 ,ccccccc,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                                    
                                                                 ,ccccccccccc,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                                    
                                                                  ,cccccccccc,,c,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                                    
                                                                  ,cTcccc,cTACATc,cc,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                                     
                                                                  ,cTccccTARRRRRATcccc,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                                      
                                                                   cRATccARRRRRRRAccccc,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                                      
                                                                   ,ARC,ccCRRRRRRAcccccccc,,,,,,,,,,,,,,,,,,,,,c,                                                                                       
                                                                    cATcc,,cTTRRCcccscccscccccccc,,,,,,,,,,,,,,,,                                                                                       
                                                                    ,cc,,,,,,,cccccccccscccccccccccccc,c,,,,,,,,                                                                                        
                                                                    ,,ccccccccccccccccccccccccccccscc,,,c,ccc,,                                                                                         
                                                                     ,cARAcccscccccccccccccccccccccssscssTTc,                                                                                           
                                                                       ,CCccccccccccTRAcccccccccccTsTTCCTc,                                                                                             
                                                                       ,cCTscccccccccTsccccccccsssc,,,,,,                                                                                               
                                                                         cCCTsTsscccccccccccccscc,,,,  ,,,,                                                                                             
                                                                          ,,cTTTTTTTTTccccccccc,,,,,,,,,,,,,,,                                                                                          
                                                                              ,,,,ccscscccccccccc,,,,,,,,,,,,,                                                                                          
                                                                                       ccccccccccccc,,,,,,,,,,                                                                                          
                                                                                      ,cTccccccccccc,,,,, ,,,,,                                                                                         
                                                                                    ,TCTcccccccssTcc,,,,,,,,,,,                                                                                         
                                                                                   ,TTTssccccccccccc,,,,,,,,,,                                                                                          
                                                                                   ,,ccccccccc,c,c,c,,,,,,,,,,                       ,,cc,,                                                             
                                                                                    ,,c,c,,,,cccc,cc,,,,,,,,,,                      ,ccccc,                                                             
                                                                                   ,cccc,,,,,,cc,,cc,, ,,,,,,,                     ,ccc,,c,                                                             
                                                                                  ,,cc,,,,,,,,,,,,c,,,,,,,,,,,                    csTc,,,c,,                                                            
                                                                                  ,ccc,,,,,,,,,,,,cc,,,,,,,,,,                   cTcc,,,,c,,                                                            
                                                                                  ,cscc,,,,,,,,,,,cc,,, ,,,,,,,                ,cccc,,,,,,,,,                                                           
                                                                                  ,ccccc,,,,,,,,,,cc,,,,,,,,,,,,               ,TCcc,,,,,,,c,                                                           
                                                                                  ,ccccc,,,,,,,,,,c,,,,,,,,,,,,               ,cTscc,,,,,,cc,                                                           
                                                                                  ,ccc,c,,,,,,,,,,,cc,,,,,,,,,,,              cTsccc,,,,,c,,,                                                           
                                                                                   ,Tccc,,,,,,,,,,,,ccscc,,,,,,,,            ,sCsccc,,,,,c,,                                                            
                                                                                   ,cccc,,,,,,,,,,,,,,,c,,,,,,,,,           ,ssTcccc,,,,,c,                                                             
                                                                                   ,cccc,,,,c,,,,,,,,,,,,,,,,,,,,         ,cCTccccc,cc,,cc,                                                             
                                                                                    ,Tsc,,,,,,,,,,,,,,,,,,,,,,,,,,      ,cCCTccccccccccc,,                                                              
                                                                                     csc,,,,,,,,,,,,,,,,,,,,,,,,,,,   ,cTTTcc,ccccccccc,                                                                
                                                                                     ,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,cccc,,,,,,cccsc,                                                                  
                                                                                     ,c,,,,,,,,,,,,,,,,,,,,,,,,cc,,,,,,,,,,,cccTsc,,                                                                    
                                                                                    ,cc,,,,,,,,,,,,,,,,,,,,,,,cTCTcccccTsssTcc,,                                                                        
                                                                                    ,cc,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                            
                                                                                   ,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                                           
                                                                                    ,,c,,,,,,,,,,,,,, , ,,,,                                                                                            
                                                                                    ,cc,,,,,,,,,,,,,,,,,,,,,                                                                                            
                                                                                    ,cc,,,,,,,,,,,,,,,,,,,,,,,                                                                                          
                                                                                     ,cccccc,,,,,,,,,,,,,, ,,,,                                                                                         
                                                                                     ,,cccc,,,,,,,,,,,,,,,,,,,,,                                                                                        
                                                                                      ,ccc,,,,,,,,,,,,,,,,,,,cc,                                                                                        
                                                                                       ,ccc,,,,,,,c,,,,,,,,ccsc,,                                                                                       
                                                                                        ,ccc,,,,,,,,,,,,,ccTTTc,                                                                                        
                                                                                         ,ccc,,,,,,,,,ccTCACc,,                                                                                         
                                                                                          ,c,,,,,,,ccsTATcc,,                                                                                           
                                                                                          ,ccccccccTCCTc,                                                                                               
                                                                                          cscccccsTCc,                                                                                                  
                                                                                         ,sTssTTRRs,                                                                                                    
                                                                                          ,TAATcc,                                                                                                      
                                                                                           ,,,,                                                                                                                                                   
</PRE>
</DIV>
<DIV id=cat26>
<PRE>
                                         
                                                                                                        ,,                                                                                              
                                                                                                    ,cCRRRc,                                                                                            
                                                                                                 ,,cARRRRRRC,                                                                                           
                                                                                             ,,,,cCRRRRARRRRT,                                                                                          
                                                       ,                               ,,,,,,,,,cRRRARARRRCCT,                                                                                          
                                                     ,RRRAT,                    ,,,,,,,,,,,,, ,CRRRAAAAARRTcc,                                                                                          
                                                     cRRRRRRRC,,   ,         ,,,,, ,,,,,,,,, ,sRRRARARRRCsccc,,                                                                                         
                                                     ,CRRRRRRRRTc,  ,,,     ,,,,  ,,,,,,,  ,cARRRAAARARRCcccc,,                                                                                         
                                                       cCRRRRRRRRRT,   ,,,,,,,,, ,,,,,,, ,cARRRRARARARATccc,,c,                                                                                         
                                                       ,csccARRRRRRRAc,,,,,,,,,,,,,,,,,  cRRRRRRRARARRAcccc,,cc,                                                                                        
                                                        ,ccc,TRRRRRRRRc  ,,,,,,,,, ,,,,,,,,,cARRRRRRRCcccc,,,cc,,                                                                                       
                                                         ,ccc,cTRRRRC,, ,,,,,,,,,   ,,,,,,,,,,cccsRAccccc,,,,ccc,,                                                                                      
                                                          ,TTc,,cRRc,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,cccc,,,,,,cc,,,,                                                                                     
                                                           ,cTs,,,c,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,, ,,,,c,,,,,,                                                                                   
                                                             ,cTcc,,,,,,,,,, ,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,cc,,,,,,,                                                                                  
                                                              ,csc,,, ,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,ccc,,,,,,,                                                                                  
                                                               ,cc,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,ccc,,,,,,,,                                                                                  
                                                               ,cc,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                                 
                                                              ,ccccccc,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                                 
                                                              ,,TTccccccccccc,,,c,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                                 
                                                               ,cTcccssccccc,ccccc,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                                 
                                                               ,Tsccccccccccc,c,c,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                                
                                                               ,cccccccccccccc,,,c,,,,c,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                                
                                                               ,TCACACccccccccccc,csAAACCTc,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                               
                                                               ,TRRCARs,cccccccccsARRAARRRAsc,,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                              
                                                                cRRCARATsccccccccARRc,cARRRRAc,,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                             
                                                                ,sAAARRRcccccc,,,cCAAAARRRRRTc,,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                             
                                                                 ,cccTCsc,ccc,c,,,,cTCRRRRCc,,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                               
                                                                  ,ssc,,,,,,,,,c,c,,,,cccc,,,,,cccc,,,,,,,,,,,,,,ccccc,,                                                                                
                                                                   ,sTc,,,cc,,,,c,,,,,,,,,,,ccccc,,,,,,cccccccccscc,,                                                                                   
                                                                    ,cccccccCRCc,,,ccc,,,ccssccc,,,ccccccssTTCTc,                                                                                       
                                                                     ,csccccccccccccccccccscccccccccccccscTcc,,                                                                                         
                                                                       ,sCsscccccccccccccccccccccsccccsscc,,,,,,,                                                                                       
                                                                        ,cCTTsTsscscccccccccccccccscssc,,,,,,,,,,,,                                                                                     
                                                                           ,,TTTTTsTcccccccscscscssc,,,,,,,,,,,,,,,,                                                                                    
                                                                                ,,ccccscccscccc,c,,,,,,,,,,,,,,,,,,,,                                                                                   
                                                                                     ,cc,,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                                   
                                                                                    ,cc,,,,,,,,,,,,,,,,,,,,,,,, ,,,,,,                                                                                  
                                                                                   ,,cc,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                                  
                                                                           ,,,,,,, ,ccc,,,,,,,,,,,,,,,,,,,ccc,,,,,,,,,,                                                                                 
                                                                         ,cTCCTc,,,ccc,,,,,,,,,,,,,,,,,,,,,ccc,,,,,,,,,                                                                                 
                                                                      ,cTcccccTcc,,cc,,,,,,,,,,,,,,,,,,,,,c,cc,,,,, ,,,               ,,cc,                                                             
                                                                     ,cCTccccTTsc,,c,,,,,  ,,,,,,,,,,,,,,,,,cc,,,, ,,,             ,,c,,,c,                                                             
                                                                     ,,cccTccssc,,ccc,,,, , ,,,,,,,,,,,,,,,,c,,,,,,,,,           ,cccc,,,,,                                                             
                                                                        ,,,,,,,,,cccc,,,,,,,,,,,,,,,,,,,,,,cc,,,,,,,,          ,cscc,,,,,,                                                              
                                                                                ,,ccc,,,,,,,, ,,,,,,,,,,,,ccc,,,,,,,,         ,TCscc,,,,,,                                                              
                                                                                  cc,,,,,,,,,,,,,,,,,,,,,,cc,,,, ,,,         cTTcccc,,,,,,                                                              
                                                                                 ,ccc,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,       ,cTscccc,,,,cc,                                                              
                                                                                 ,,ccc,,,,,,,,,,,,,,,,,,,,,,,,,, ,,,      ,cTcccc,,,,cc,                                                                
                                                                                  ,cccc,,,,,,,,,,,,,,,,,,,,,cc,,,,,,     ,sTscccc,,,ccc,                                                                
                                                                                   cTc,,,,,,,,,,,,,,,,,,,,,,ccccc,,    ,cTTccccc,,,csc,                                                                 
                                                                                   ,ccc,,,,,,,,,,,,,,,,,,,,,,,,,c,,  ,,cTscc,,,,,,ccc,                                                                  
                                                                                    ,ccc,c,c,,,,,,,,,,,,,,,,,,,,,,,,,ccccc,,,,,,,c,,                                                                    
                                                                                     ,ccccccc,,,,,,,,,,,,,,,,,,,,,,,cc,,,,,,,,c,,                                                                       
                                                                                     ccssscc,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,ccc,,                                                                         
                                                                                    ,cTccc,,,,,,,,,,,,,,,,,,,,,,,,,cccccc,,,                                                                            
                                                                                   ,csTcc,,, ,,, ,,,,,,,,,,,,,,,,,,,,,                                                                                  
                                                                                   ,ccTcc,,   ,,,,,,,,,,,,,,,,,,c,,                                                                                     
                                                                                   ,cscc,,   ,,,,,,,,,,,,,,,,,,,,,                                                                                      
                                                                                   ,csTcc,,,,,,,,,,,,,,,,,,,,                                                                                           
                                                                                   ,cTTsc,,,,,,,,,,,,,,,,,,,,,                                                                                          
                                                                                    ,cTTsc,,,,,,,,,,,,,,,,,,,,,,                                                                                        
                                                                                      ,ccsc,,,,,,,,,,,,,,,,,,,,,,,                                                                                      
                                                                                        ,csc,,,,,,,,,,,,,,,,,,,,,,,,                                                                                    
                                                                                         ,cTc,,,,,,,,,,,,,,,,,,,,,,,                                                                                    
                                                                                          cTTcc,,,,,,,,,,,,,,,,,,,,,                                                                                    
                                                                                          cTcscc,,,,,,,,,,,,,,,,,c,                                                                                     
                                                                                          cTTcscc,,,,,,,,,,,,,,,,,,                                                                                     
                                                                                           ,TTTTcc,ccc,,,,,,,,,cc,                                                                                      
                                                                                            ccTcTcc,ccc,c,,,cccTc                                                                                       
                                                                                              ,,cTcc,,,c,,ccTCc,                                                                                        
                                                                                                ,TTcc,,cccTTc,,                                                                                         
                                                                                                 ,,sTccsCCc,                                                                                            
                                                                                                    ,,TCT,                                                                                              
                                                                                                       ,                                                                                                                                          
</PRE>
</DIV>
<DIV id=cat27>
<PRE>
                                          
                                                                                                                     ,ccc,                                                                              
                                                                                                                  ,cTRRRRRT,                                                                            
                                                                                                                ,TRRRRRRRRRT,                                                                           
                                                       ,CCTs,,                                               ,,TRRRRARRRACTT,                                                                           
                                                      ,CRRRRRRAs,                       , ,,,,,,,,,,   ,,   ,TRRRRRARARRRccc,                                                                           
                                                      ,ARRRRRRRRRAT,,            , ,,,,,,,,,,,,,,,,,,,,   ,cARRRRRARARRAsccc,                                                                           
                                                       ,ARRRRRRRRRRRT,,       , ,,,,,,,,,,,,,,,,,,,,,   ,CRRRRRARARRRATcc,cc,                                                                           
                                                       ,cTssARRRRRRRRRAT,   ,,,,,,,,,,,,,,,,,,,,,,,  ,cARRRRRRARARRRRAc,,,cc,                                                                           
                                                        ,ccccTRRRRRRRRRRRRAc,,,,,,,,,,,,,,,,,,,,,,,,cARRRRRRRAAARRRRCccc,,cc,                                                                           
                                                         ,sccccccARRARARRRRRC, ,,,,,,,,,,,,,,,   ,,,,cCRRRRRRRRRRRCccc,c,,cc,                                                                           
                                                          ccccccccTRRARRRRRc, ,           ,,    ,,,,,,,,csRRRRRRAcccc,,,,,cc,                                                                           
                                                          ,TCc,,ccsRRRRRRT,  ,,,,,   ,   ,,,   ,,,,,,,,,,,,ccccscccc,,,,,,cs,                                                                           
                                                           ,cTc,,,ccCRRC,  ,,,,,        ,,,,,,,,,,,,,,,,,,,,,,,cccc,,,,,,cc,                                                                            
                                                            ,TTsc,,ccccc,,,,,,,,        ,,,,,,,,,,,,,,,,,,,,,,,,,,,, ,,,,sc                                                                             
                                                             ,cCTcccccc,,,,,,,,,,,,,,       ,,,,,,,,,,,,,,,,,,,,,,,   ,,cc,                                                                             
                                                               ,sCTcccc,,,,,,,,  , ,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,cTc,                                                                              
                                                                 ,TTscc,c,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,ccc,                                                                               
                                                                   ccc,,,ccc,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,cc,,,                                                                              
                                                                   ,ccc,ccccc,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                             
                                                                  ,cTccccc,ccccc,,,c,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                            
                                                                 ,csscccccccccccccc,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                           
                                                                ,cTscccccc,ccccccc,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                         
                                                               ,sTscccTTTTCCTcccccccccccccc,,,cTCCCc,,c,,,,,,,,,,,,,,,,,,,,,,,,,                                                                        
                                                                csccccARRRRRAc,ccccccccccccccTRRRRRRCCTc,,,,,,,,,,,,,,,,,,,,,,,,,                                                                       
                                                               ,ccccccARRTTARCccccccc,,,,,cTRRRc,,CRRRRRs,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                     
                                                             ,sATTcccsRRRCsARRCc,c,,,,,,,,,TRRC,,CRRRRRRc,,,,,,,,,,,,,,,,,,,,,,,,c,,                                                                    
                                                             ,ccTsTcccsTCRRRRCc,,,,,,,,,,,,,cTRRRRRRRRs,,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                    
                                                                 cTTcc,,,cTCc,,,,,,,,,,,,,,, ,,TAAACc,,  ,,,,,,,,,,,,,,,,,,,,,,,                                                                        
                                                                  ,sCTccc,,,,,,,,,,,,,,,,,,,,   ,,,,   ,,,,,,,,,,,,,,,,,,,,cc,,,                                                                        
                                                                   ,,sTTsccc,,,,,,,,,,,,,,,,,,,,   ,,,cccc,,,,,,,,,,ccccccc,,,                                                                          
                                                                      cCTTscc,c,,,,CRRT,,,,,,,,,,,,,,,,,,,,,,cccccTTCCT,,                                                                               
                                                                       ,cCTscccc,,,cCCc,,,,,,,,,,,,,,,,ccccccssTTCsc,                                                                                   
                                                                         ,cTTssccccc,,,,c,c,c,,,c,c,,cccssscTsTTc,                                                                                      
                                                                           ,TCTTcccccccccccccccccccccccscscTsccc,,,                                                                                     
                                                                             ,cTTcccccscscscscssscTsTsTsTssc,,,,,,,,,                                                                                   
                                                                                cTcccccscTsTsTsTTTsTTTcc,,,,,,,,,,,,,,                                                                                  
                                                                                cTscc,c,,,cccc,,,,,,,,,,,,,,,,,,,,,,,,,                                                                                 
                                                                         ,,ccc,,,ccTcc,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                                 
                                                                         ,c,cccccc,,cc,,,,, ,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                                
                                                                         ,,c,,,,ccc,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                               
                                                                          ,cccc,,,scc,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                               
                                                                           ,cc,,,,ccc,,,,,,,,,,,,,,,,,,,,,,,,cccccc,,,,,,,       ,,,,                                                                   
                                                                            ,cc,,,,,c,,,, ,,,,,,,,,,,,,,,,,,ccccc,,,,,,,,     ,,ccc,,                                                                   
                                                                             cccc,,,,,,  ,,,,,,,,,,,,,,,,,,,,ccc,, , ,      ,,,c,,,                                                                     
                                                                             ,cTTccc,,,,,,,,,,,,, ,,,,,,,,,,,,cccc,,,,,,,,,,,,,,,,,                                                                     
                                                                               ,ccccc,,,,,,,,,,,,,,,,,,,,,,,,c,,cTc,,,,,,,,,,,,,,                                                                       
                                                                                 ,ccc,,,,,,,,,,,,,,,,,,,,,,,,,,,,cTc,,,,,,,,,,c,                                                                        
                                                                                  ,ccc,,,,,,,,,,,, , ,,,,,,,,,,,,,cc,,,,,,,,,,,,                                                                        
                                                                                 ,ccccc,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,   ,,,,,,                                                                          
                                                                                 ,cc,ccc,,,,,,,,,,,,,,,,,,,,,,,,,,cc,,  ,,,,,                                                                           
                                                                                  ,cccc,,,,,,,, ,,,,,,,,,,,,,,,,,cccc,,,,,c,                                                                            
                                                                                  ,ccc,,,,,,,,,, ,,,,, ,,,,,,,,,,,,csTcc,,                                                                              
                                                                                  ,cccccc,,,,,,,,,, ,,,,,,,,,,,,,,,,cc,,                                                                                
                                                                                   ,scccc,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                                   
                                                                                   ,cccccc,,,,,,,,,,,,,,,,,,,,,,,,,                                                                                     
                                                                                   ,,sTccccc,,,,,,,,,,,,,,,,,,,,,,                                                                                      
                                                                                   ,ccccscsccccc,,,,,,,,,,,,,,,,,,                                                                                      
                                                                                   ,cc,ccccTsTcccc,,,,   ,,,,,,,,,                                                                                      
                                                                                  ,,c,,,,,ccccsccc,,,,, ,,,,,,,,,,,                                                                                     
                                                                                  ,,cc,,,,,,,ccccc,,,,   ,,,,,,,,,                                                                                      
                                                                                  ,cc,,,,,,,,,ccc,,,,,,  ,,,,,,,,,,                                                                                     
                                                                                 ,,c,,,,,,,,,,csc,,,,,   ,,,,,,,,,,                                                                                     
                                                                                  ,cc,,,,,,,,,cccc,,,,, ,,,,,,,,,,,                                                                                     
                                                                                  ,cc,,,,,,,,,,csc,,,,,  ,,,,,,,,,,,                                                                                    
                                                                                  ,cc,,,,,,,,,,cccc,,,, ,,,,,,,,,,,,                                                                                    
                                                                                  ,cTc,,,,,,,,,cccc,,,,, , ,,,,,,,,,,                                                                                   
                                                                                   cCccc,,,,,,,,ccc,,,,,, ,,,,,,,,,,,                                                                                   
                                                                                   ,Tccc,,,,,,,,cTcc,,,,,, ,,,,,,,,,,,                                                                                  
                                                                                   ,Tcc,,,,,,,,,ccccc,,,, ,,,,,,,,,,,,                                                                                  
                                                                                   ,cTTTsscccccccccc,,,,,,,,,,,,,,,,,,                                                                                  
                                                                                    ,,cc,,,,cc,,,,csc,,,,,,,,,,,,,ccT,                                                                                  
                                                                                                 ,cTc,,,,,,, ,,,,cTT,,                                                                                  
                                                                                                 ,cCc,,,,,,,,,,cTc,                                                                                     
                                                                                                  ,CCCTscc,,,ccc,                                                                                       
                                                                                                   ,,,,cccsTTc,                                                                                         
                                                                                                           ,,                                                                                           
</PRE>
</DIV>
<DIV id=cat28>
<PRE>
                                           
                                                                                                                          ,ccsCAT,                                                                      
                                                                                                                        ,cRRRRRRRA,,                                                                    
                                                           ,ccc,,                                                ,,  ,sCRRRRRRRACTc,                                                                    
                                                          ,RRRRRRCc,                                         ,,,   ,cRRRRRAAARRCccc,                                                                    
                                                         ,CRRRRRRRRRAT,                   ,    ,,,,,, ,   ,,,,   ,cARRRAAAARRRCcccc                                                                     
                                                         ,TRRRARARRRRRRTc,     ,   , , ,,,,,,,,,,,,,,,,,,,     cCRRRRAAAARRRCcc,,c,                                                                     
                                                          ,TCTRRRRAAARRRRACc,  ,,,,,,,,,,,,,,,,,,,,,,,,,,   ,cARRRRAAAAARRAcc,,,,cc                                                                     
                                                           cccccsARRAAARRRRRAAc,,, ,,,,,,,,,,,,,,,,,,, , ,TRRRRRAAAAAARRRTccc,,,,c,                                                                     
                                                           ,ccc,ccTRRARAAARRRRRRC,, , ,,,,,,, ,,, ,,  , ,,cRRRRRRAAARRRCcccc,,,,,c,                                                                     
                                                            ,Tcc,cccCRRRAAARRRRRc,              ,,   ,,,,,,,,cTRRRRRRAccccc,,,,,cc,                                                                     
                                                            ,TTc,,,cccARRARRRRT,  ,,,     ,,,  ,,,   ,,,,,,,,,,,ccARCcccc,,,,,,,c,,                                                                     
                                                             ,cc,,,,cccTRRRT,,   ,                   ,,,,,,,,,,,,,cccccc,,,,,,,cc,                                                                      
                                                              cCTc,,cccsRRRc,,,,,,,,,,,         ,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,cc,                                                                       
                                                              ,CRAc,,,ccccc,,,,,,,,,,,             ,,, ,,,,,,,,,,,,,,,,, , ,,cc,                                                                        
                                                                ccTcc,,cccc,,,,,,,,,,,,,,,  ,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,cc,                                                                         
                                                                 ,cTcccccccc,,,,,,,,,,,,,,,,,,,,,,,, , ,,,,,,,,,,,,,,,,,,,,cc,                                                                          
                                                                   cCTcccccc,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,cc,                                                                           
                                                                    ,ccccccc,c,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                            
                                                                     ,ccccc,c,c,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                          
                                                                    ,Tscccccc,,c,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                        
                                                                   cTcccccccccc,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                       
                                                                 ,cTsccccccccTCCTc,,,c,,,,,,,,,,,,,,,sCACCTscc,,,,,,,,,,,,,,,,,c,,,                                                                     
                                                                ,cCsccccccccARRARRT,,,,,,,,,,,,,,,,cCRRARRRRCc,,,,,,,,,,,,,,,,,,,,,,                                                                    
                                                                ,csccccccsARRT,,CRRT,,,,,,,,,,,,,cCRRc  cRRRRRAc,,,,,,,,,,,,,,,,,,,c,,                                                                  
                                                                ,csccccccTRRRscTARRTc,,,,,,,,,,,,cARRs,cTTARRRCc,,,,,,,,,,,,,,,,,,,,,,,                                                                 
                                                             ,,TCTccccccc,ccARRRRRRT,,,,,, , ,,,,,,,TRRRRARRC,,,,,,,,,,,,,,,,,,,,,,,,c,,,                                                               
                                                             ,csccsccccccc,,,cCCTTc,,,, ,            ,sCCTs,,   ,,,,,,,,,,,,,,,,,,,,, , ,                                                               
                                                                 ,,ccccccccc,,,,,,,,,,,,,        ,           ,,,,,,,,,,,,,,,,,,,,,,,                                                                    
                                                                  cTCsccccccccc,,,,,,,,,,,,   ,,, ,,,     ,,,ccc,,,,,,,,,,,,ccccc,,,                                                                    
                                                                   ,csTTsccccccc,,,,,,,,,cRRc,  ,,,,,  , ,,,,,,,,,,,cccccTTTcc,,,                                                                       
                                                                      ,,sTTccccccccc,,,,,,sc,,,,,,,,,,,,,,,,,cccccccccTTTcc,                                                                            
                                                                         ,cTTTccccccccc,,,,,,,,,,,,,,,,,,,,,,cccccsTTTc,                                                                                
                                                                           ,cTCssccccccccccccc,,c,c,c,ccc,ccccccccc,,                                                                                   
                                                                              ,ccTcccscccccscccccccccccccccscscTcc,                                                                                     
                                                                                ,csTssscscscscccccscssscscTsTcc,,,,,,                                                                                   
                                                                              ,c,,,,,,,ccTcscTcTsTsssTcccc,,,,,,,,,,,,                                                                                  
                                                                             ,ccc,,,,,,,,,,,,,,c,,,,,,,,,,,,,,,,,,,,,,,                                                                                 
                                                                             ,ccccc,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                                 
                                                                            ,cc,c,,,,,,,,,,,,,, ,,,,,,,,,,,,,,,,,,,,,,,,                                                                                
                                                                            ,ccc,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                                
                                                                           ,ccc,c,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                               
                                                                           ccccc,c,,,,,,,  ,,,,,,,,,,,,,,,,,,,,,,cc,,,,,,,,,                                                                            
                                                                          ,cTcccc,,,,cc,, , ,,,,,,,,,,,,, ,,,,,,ccc,,,,,,,,,                                                                            
                                                                           ,,Tsc,,,,,cc,,,, ,,,,,,,,,,,,,,,,,,,cccc,,,,,,,                                                                              
                                                                             ,cscc,,ccc,,,,,,,,,,,,,,,,,,,,,,,,,c,c,,,,,,,,                                                                             
                                                                              ,ccc,ccccc,,,, ,,,,,,,,,,,,,,,,,,,,cccc,,,,,,,                                                                            
                                                                                  ,cTcc,,,,,,,,,,,,,,,,,,,,,,,,,,,,cTTc,,,,                                                                             
                                                                                   cscc,,,,, ,,,,,,,,,,,,,,,,,,,,,,,,cCTc,,                                                                             
                                                                                  ,cTcc,,,,,, ,,,,,,,,,,, ,,,,,,,,,,  css,,,                                                                            
                                                                                  ,ccc,,,,,, ,,,,,,,,,,,,,,,,,,,,,,,   cCCcc,                                                                           
                                                                                  ,cc,,,,,,,, ,,,,,,,,,,,,,,,,,,,,,     ,cTc,                                                                           
                                                                                 ,cccc,,,,,,,,,, ,,,,,,,,,,,,,,,,,,,                                                                                    
                                                                                 ,ccccc,,,,,,,,,,,,,, ,,,,,,,,,,,,,                                                                                     
                                                                                 ,cscccc,c,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                                    
                                                                                 ,scccccc,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                                     
                                                                                ,ccscccc,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                                    
                                                                                cssccccccccc,,,,,,,,,,,,,,, ,,,,,,,                                                                                     
                                                                                cCccc,cccccsccccccccc,,,,,,,,, ,,,,,                                                                                    
                                                                               ,csc,,,c,ccccccccTccc,,,,,,,,,   ,,,,                                                                                    
                                                                               ,csc,,c,,,,,c,,cccccc,,,,,,,,,, ,,,,,                                                                                    
                                                                              ,sTcccc,,,,,,,,,,,,,cc,,,,,,,,,   ,,,,                                                                                    
                                                                              ,TTccc,,,,,,,,,,,,,,cc,,,,,,,,,,  ,,,,,                                                                                   
                                                                              cTTcc,c,,,,,,,,,,,,,ccc,,,,,, ,   ,,,,,                                                                                   
                                                                             ,cc,,,,,,,,,,,,,,,,,,csccc,,,,,,, ,,,,,,                                                                                   
                                                                             ,cc,,,,,,,,,,,,,,,,,,csccccc,,,,   ,,,,,,                                                                                  
                                                                             ,cc,,     ,,,,,,,,,,ccscccc,,,,,, ,,,,,,,                                                                                  
                                                                             ,ccc,, ,,,,,,,,,,,,ccccccc,,,,,,,, ,,,,,,                                                                                  
                                                                              ,cc,,,,,,,,,,,,,,c,ccscccc,,,,,, ,,,,,,,                                                                                  
                                                                              ,,cccc,,,,,,,,cc,,,,csccc,,,,,,,,,,,,,,,,                                                                                 
                                                                               ,cTTCCTsTsscc,,   ,cCcccc,,,,,,,,,,,,c,                                                                                  
                                                                                 ,,,,,,,,,,       csscc,,,,,,,,,,,,cc,                                                                                  
                                                                                                   ,cc,,,,,,,,,,,,cc,                                                                                   
                                                                                                    ,,,,,cc,c,cccc,                                                                                     
                                                                                                     ,CCccccccccc,                                                                                      
                                                                                                      ,,,                                                                                               
</PRE>
</DIV>
<DIV id=cat29>
<PRE>
                                          
                                                                                                                                ,                                                                       
                                                                                                                            ,cTARRT,                                                                    
                                                                                                                         ,cARRRRRRRC,                                                                   
                                                                                                                      ,,CARRRRRRRACTc                                                                   
                                                            cCTc,                                              ,,,   ,TRRRRRARRRTccc,                                                                   
                                                          ,cRRRRRAACc,                                      ,,,,   ,TRRRRARARATcc,cc,                                                                   
                                                          cRRRRRRRRRRAAc,                  , ,,,,,,,,,,,,,,,,    ,sRRRRAARARRRccc,,c,                                                                   
                                                          ,CRRRRRRRRRRRRRc,         , ,,,,,,,,,,,,,,,,,,,,,   ,cARRRRAAARRRRAcc,,,,,,                                                                   
                                                           cTscCRRRRARARRRRAT,,  ,,,,,,,,,,,,, ,,,,,,,,, ,,,cCRRRRRRARARRRATcc,,,,,c,                                                                   
                                                           ,ccccTARRRRRARRRRRRRCs,,,,,,,,,,,,,  ,,,,,    ,,,TRRRRRRRRARRRTccc,,,,,c,,                                                                   
                                                            cTcc,cccCRRRARARRRRRRRc,,    ,   ,,, ,,,,  ,,,,,,,cRRRRRRRRCcccc,,,,,,c,,                                                                   
                                                            ,cc,,,ccccARRARARRRRAc, ,,,     ,,, , ,,,,,,, ,,,,,,cccTRRTcccc,,,,,,cs,,                                                                   
                                                             ,cc,,,ccccTRRRRRRAc,            , ,       ,,,,,,,,,,,,,cccccc,,,,,,cTc,                                                                    
                                                              cTc,,,cccccCRRAc,,  , ,,,,,,,   ,   ,,,,,,,,,,,,,,,,,,,,,,,,, , ,,sc,                                                                     
                                                              ,TTc,,,,cccART,,,,,,,,,,,,,,           ,,,,,,,,,,,,,,,,,,,,,   ,,cc,                                                                      
                                                               ,TCTc,,,,cccc,,,,,,,,,,,,,,,         ,,,,, ,,,,,,,,,,,,,,,,,,,,cc,                                                                       
                                                                 cCCc,,,cccc,c,,,,,,,,,, ,,,,,,,,,,,   ,,,,,,,,,,,,,,,,,,,,,ccc,                                                                        
                                                                  ,sTccccsc,,c,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,cc,                                                                         
                                                                   ,cTTscccc,c,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                          
                                                                     ,csccccccc,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                        
                                                                      ,Tcccccccc,c,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                      
                                                                     ,csccccccccc,c,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                     
                                                                    cTTccccccccc,cc,,,,,,,,,,,,,,,,,,,,,cAACTTTcc,,,,,,,,,,,,,,,,,,,,                                                                   
                                                                   cTcscccccccsCAAACTc,,,,,,,,,,,,,,,,cCRRRRRRRAs,,,,,,,,,,,,,,,,,,,,,                                                                  
                                                                 ,cTsccccccccCRRATCRRc,,,,,,,,,,,,,,,CRR,  cRRRRRRc,,,,,,,,,,,,,,,,,,,,,                                                                
                                                                 ,csccccccccCRRC,,sARAc,,,,,,,,,,,,,cCRAc,cTTCRRRAc,,,,,,,,,,,,,,,,,,,,,,,                                                              
                                                                 ,cccccccccccCRRCARRRRA,,,,,,,,,,,,,,,cARRRRARRA,, ,,,,,,,,,,,,,,,,,,,,,,,,                                                             
                                                               ,cTTccccccccc,,cARRRRRCc,,,,     ,     ,,csAAATc   ,,,,,,,,,,,,,,,,,,,                                                                   
                                                              ,TCACTcccccccccc,,csccc, ,,,,,         ,     ,    ,,,,,,,,,,,,,,,,,,,,,,                                                                  
                                                              ,,  ,,ccsccccccccc,,,,,,,,,,,,       ,,,,       ,,ccc,,,,,,,,,,,ccccc,,,                                                                  
                                                                   cTTTscccccccscccc,,,,,,,,,AAc,  , , ,   ,,,,,,,,,,,,ccccccTcc,,,                                                                     
                                                                   ,,,cTTTscccccccccc,,,,,,,,AAc,,,,,,,,,,,,,,,,,,ccccccTTTcc,,                                                                         
                                                                        ,cCCssccccccccccc,,,,,,,,,,,,,,,,,,,,,,,ccccssssc,,                                                                             
                                                                          ,,cTCsscccccccccccccc,,,c,cccccc,,,,c,ccccsc,                                                                                 
                                                                             ,,ccscccccccccscscccccccccccc,ccccccsc,,                                                                                   
                                                                                cTTcscscscscccccccccccccccccTsTssc,,,                                                                                   
                                                                               ,,c,csTcssscscscssssTsssssTsTsTc,,,,,,,,,                                                                                
                                                                               ,c,,,,,,,ccccccccTsTsTccc,,,,,,,,,,,,,,,,,,                                                                              
                                                                              ,ccc,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                              
                                                                              ccc,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                             
                                                                             ,,ccc,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                             
                                                                            ,cccccc,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                             
                                                                            ,csccccc,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                             
                                                                            ,cssscccc,,,,,,,  ,,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                             
                                                                             ,,cTTcc,,,,,,,,,,,,,,,,,,,,,,,,,,,,,cc,,,,,,,,                                                                             
                                                                                ,cccc,,,,,,,,,,,,,,,,,,,,,,,, ,,ccc,,,,,,,                                                                              
                                                                                 ,,ccccc,,,,,,,,,,,,,,,,,, ,,,,ccc,,,,,,,,                                                                              
                                                                                  csscc,,,,,,,,,,,,,,,,,,,  ,,,,,,,   ,,,                                                                               
                                                                                 ,cTcccc,,,,,,,, ,,,,,,,,,,,,,,,,,,,,, ,                                                                                
                                                                                 ,TTccc,c,,,,,,,,,,,,,,,, ,,,,,,,,c,,,,,,                                                                               
                                                                                 ccTccc,cc,,,,,,,,,,,,,, , ,,,,,,,cccc,,                                                                                
                                                                                ,cscccccc,,,,,, ,,,,,,,,,,,,,,,,,,,,,,c,                                                                                
                                                                                cTcccccccc,,,,,,,,,,,,,,,,,,,,,,,,,                                                                                     
                                                                                cTscccccc,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                                     
                                                                               ,cTcccccccc,,,,,,,,,,,,,,,,,,,,,,,,,                                                                                     
                                                                               ,cTccccc,c,,,,,,,,,,,,,,,,,,,, ,,,,,                                                                                     
                                                                               ,cscccccc,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                                      
                                                                              ,cscccccccc,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                                     
                                                                              ,ccccccccscccccc,ccccc,,,,,,,,,,,,,,,                                                                                     
                                                                              ,TTcccc,,cccccTccccccc,,,,,,,,,,,,,,,,                                                                                    
                                                                              ,TTccccc,,,cccccc,,,cc,,,,,,,, ,,,,,,,                                                                                    
                                                                              cTsccccc,,,,,,,,,,  cc,,,,,,,   ,,,,,,                                                                                    
                                                                             ,cTsccc,c,,,,,,,,,,  ,c,,,,,,,,   ,,,,,,                                                                                   
                                                                             ,cTTcccccc,,,,,,,,,, cTc,,,,,,,,   ,,,,,                                                                                   
                                                                             ,cccc,,,,,,,,,,,,,,,,cTsccc,,,,,  ,,,,,,,                                                                                  
                                                                            ,cc,,,,,,   ,,,,,,,,,,csscccc,,,,   ,,,,,,                                                                                  
                                                                            ,ccc,,,  ,,,,,,,,,,,,,cTcccc,,,,,,,,,,,,,,                                                                                  
                                                                            ,cs,,,,,,,,,,,,,,,,,,,csccccc,,,, ,,,,,,,,                                                                                  
                                                                             ccc,,,,,,,,,,,,,cc,,,cTcccc,,,,,, ,,,,,,,                                                                                  
                                                                              cTTcccccc,,,,ccc,, ,cTsccc,,,,,,,,,,,,,,                                                                                  
                                                                               ccTTTcscTTTcc,,   ,cCcccc,,,,,, ,,,,,,,                                                                                  
                                                                                  ,,, ,,,,,       csc,,,,,,,,,,,,,,,c,                                                                                  
                                                                                                  ,ccc,,,,,,,,,,,,cTc,                                                                                  
                                                                                                   ,CCscccc,,,,ccTc,,                                                                                   
                                                                                                   ,,ccTTTTCCACTc,                                                                                      
                                                                                                          ,,,,,                                                                                                                                   
</PRE>
</DIV>
<DIV id=cat30>
<PRE>
                                          
                                                                                                                           ccTTc,                                                                       
                                                                                                                        ,cRRRRRRc,                                                                      
                                                                                                                     ,cARRRRRRRRsc,                                                                     
                                                                                                               ,,  ,cRRRRRRRRRATcc,                                                                     
                                                                                                            ,,,   ,ARRRRRRRRAscccc,                                                                     
                                                         ,cTCc,,                              , ,   , , ,,, ,   ,TRRRARARRATccc,,,,                                                                     
                                                        ,ARRRRRRAAs,                 , ,,,,,,,,,,,,,,,,,,,    ,CRRRRARARRRAccc,,,,                                                                      
                                                       ,CRRRRRRRRRRRACc,          ,,,,,,,,,,,,, ,,,,,,,,,  ,TRRRRRRARRRRRCscc,,,,,,                                                                     
                                                       ,sRRRRRRRRRRRRRRRAc,  ,,,,,,,,,,,,,,,,,,, ,,,,,,, ,CRRRRRRRARRRRAcc,,,,,,c,                                                                      
                                                        ,cCccTRRRRRRRRRRRRRRC,,,,,,,,,,,,,,,, ,,,,,,    ,,TRRRRRRRRRRAsccc,,,,,cc,                                                                      
                                                         ,cccccARRRRRRARRRRRRRRRc,,, ,,,,, , , , ,    ,,,,,,,cTRRRRRTcccc,,,,,,cc,                                                                      
                                                          ,cccccccTRRRRARARRRRRT,,,         ,,, ,,,,,,,,,,,,,,,,ccsccccc,,,,,,ccc,                                                                      
                                                          ,TTc,,ccccCRRRRRRRRRc, ,,,             ,,,,,,,,,,,,,,,,,,,,c,,,, ,,,cc,                                                                       
                                                           ,scc,,cccccARRRRRAc, ,,,     , , ,   ,,,,,,,,,,,,,,,,,,,,,,,,    ,cc,                                                                        
                                                            cCsc,,,ccccTRRRT,,,,,,,,,,     ,         ,,,,,,,,,,,,,,,,,,, ,,,cc,                                                                         
                                                            ,TCTc,,,ccccccc,,,,,,,,,,,,,,         ,,,,,,,,,,,,,,,,,,,,,,,,csc,                                                                          
                                                              cCTc,,,,cccccc,,,,,,,,,,,,,,,, ,,,,,,,,,,,,,,,,,,,,,,,,,,,,,cc,                                                                           
                                                               ,cCTc,,ccccccccc,,,,,,,, ,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                           
                                                                 ,TCTTcccccc,c,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                         
                                                                   ,ccscccccc,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                       
                                                                     csccccccc,c,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                      
                                                                    ,cTcccccccccc,c,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                    
                                                                   ,cTcccccccccc,,,c,c,,,,,,,,,,,,,,,,,,cCCCTCTc,,,,,,,,,,,,,,,,,,,,,,                                                                  
                                                                  ,cCcccccccccccTsc,,,,,,,,,,,,,,,,,,,cCRRRRRRRAT,,,,,,,,,,,,,,,,,,,c,,                                                                 
                                                                 ,cTsccccccccCTARRACc,,,,,,,,,,,,,,,,TAAc,,cRRRRRT,,,,,,,,,,,,,,,,,,,ccc,,                                                              
                                                                ,cCsccccccccCRRRccCRRAc,,,,,,,,,,,,,cRRR, cCTARRRc,,,,,,,,,,,,,,,,,,,,,,,,                                                              
                                                                 cTsccccccccTRRAccsARRA,,,,,,,,,,,,,,cCRRRRRRAAC,, ,,,,,,,,,,,,,,,,,,                                                                   
                                                                ccTccccccccccCRRRRRRRAc,,,, , , ,      ,cCAACc,   ,,,,,,,,,,,,,,,,cc,                                                                   
                                                              ,CAATccccccccc,,cTTRRRs,,,,,   ,     ,            ,,,,,,,,,,,cccccc,,,                                                                    
                                                              ,,,,ccTccccccccc,,,,cc,,,,,,,,,     ,,,,,,     ,,,cc,,,,,,ccTsTc,,                                                                        
                                                                  ,TCTcccccccsccc,,,,,,,,,,,,,,,,, , , ,    ,,,,,,,,cccTTTcc,                                                                           
                                                                   ,csCTTssccccccccc,,,,,,, ,RRC, ,,,,,,,,,,,,,,ccTcsTTTc,                                                                              
                                                                      ,,cTTTssccccccccc,,,,,,cc,,,,,,,,,,,,,,,,ccccssc,,                                                                                
                                                                          ,cTTTsccccccccccc,,,,,,cc,ccccc,ccc,ccccTT,                                                                                   
                                                                             ,,ccTcccccscscscccccccccccccccccccTTc,                                                                                     
                                                                                cTTsssscccssTsscscssTsTsTTTTTTT,,                                                                                       
                                                                               ,cc,,csTTcTsssTsTTTsTTTTTsccc,,,,,,                                                                                      
                                                                              ,cc,,,,,,,,,,,,,ccccc,,,,,,,,,,,,,,,,,                                                                                    
                                                                              ,c,,,, ,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                                  
                                                                              ,c,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                                 
                                                                             ,,c,, ,,, ,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                                  
                                                                             ,,,,,, ,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                                  
                                                                             ,,,,,,,,,,,,,,, ,,,,,,,,,,,,,,,,,,,,,,,,,                                                                                  
                                                                            ,,c,,,,,,,,,,,,,, ,,,,,,,,,,,,,,, ,,,,,,,,,                                                                                 
                                                                             ,,,,,,,,,,,,,,, , ,,,,,,,,,,,,,,,,,,,,,,,,                                                                                 
                                                                             ,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                                 
                                                                             ,,c,,,,,,,,,,,,,,,,,,,,,,,,,,,, ,,,,,,,,,                                                                                  
                                                                              ,c,,,,,,,,,,,,,,,,,,,,,,,,,,,,, ,,,,,,,,,                                                                                 
                                                                              ,c,, ,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                                  
                                                                              ,c,,,,,,,c,,,,,,, ,,,,,,,,,,,,,,,,,,,,,,,                                                                                 
                                                                              ,c,, ,,,,c,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                                  
                                                                              ,,,,, ,,ccc,,,,,,,,,,,,,,,,,,,,,, ,cc,,,                                                                                  
                                                                              ,c,,,,,,cc,,,,,,,,,,,,,,,,,,,,,,  ,TTc,,                                                                                  
                                                                              cTc,cccccc,,,,,,,,,,,,,,,,,,,,,,, ,csc,,,                                                                                 
                                                                               ,cTcccc,c,,,,,, ,,,,,,,,,,,,,,,  ,cRRc,,,                                                                                
                                                                                cTcccccc,,,,,,,,, , , , ,,,,,,,,,,TAAc,                                                                                 
                                                                               ,cTcc,ccc,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                                  
                                                                              ,,ssccccccccc,,,,,,,,,,,,,,,,,, ,,,,,                                                                                     
                                                                              ,cTc,,,,,ccccccccccccccccc,,,, ,,,,,,,                                                                                    
                                                                              ,Tsc,,,,,,,,,,ccTc, ,ccc,,,,,,,,,,,,,,                                                                                    
                                                                              ,Tcc,,,,,,,,,,,ccc  ,sc,,,,,,,,,,,,,,,                                                                                    
                                                                             ,csccc,,,,,,,,,,,c,  ccc,,,,,  ,,,,,,,,,                                                                                   
                                                                            ,csTsc,,,,,,,,,,,,,,  csc,,,,,  ,,,,,,,,,                                                                                   
                                                                            ,cssTcc,c,,,,,,,,,,,, ,ccc,,,,,,, ,,,,,,,,                                                                                  
                                                                             csscccccc,,,,,,,,,c, ,ccc,,,,,, ,,,,,,,,,                                                                                  
                                                                            ,cTccccccc,,,,,,,,,,, ,,ccc,,,,   ,,,,,,,,,                                                                                 
                                                                             ccc,,,c,,,,,,,,,,,c, ,ccc,,,,,,  ,,,,,,,,,                                                                                 
                                                                             ,cTc,,,,,,,,,,,,,c,   cTcc,,,,,,,,,,,,,,,,                                                                                 
                                                                              cTc,,,,,,,,,,,,,,   ,csc,,,,,,,,,,,,,,,,,                                                                                 
                                                                              ,ccc,,,,,,,,,,c,    ,,scc,,,,,,,,,,,,,,,,                                                                                 
                                                                               ,TCccccc,,,,,,     ,ccc,,,,,, ,,,,,,,,,,                                                                                 
                                                                                ,cccccccccc,      cTscc,,,,,,,,,,,,ccc,                                                                                 
                                                                                        ,,        ,cTCccc,,,,,,ccTCCCc,                                                                                 
                                                                                                   ,cTCCCCTTTTCTTc,,,                                                                                   
                                                                                                     ,,,,,,ccc,,                                                                                                                                  
</PRE>
</DIV>
<DIV id=cat31>
<PRE>
                                         
                                                                                                                             ,,                                                                         
                                                                                                                          ,cCAAT,                                                                       
                                                                                                                       ,TARRRRRRTc,                                                                     
                                                                                                                ,   ,cARRRRRRRRAsc,                                                                     
                                                                                                             ,,,   cCRRRRRARRRCTcc,                                                                     
                                                         ,,,,                                 ,       , ,   ,,   ,TRRRRARRRRAcc,,,,                                                                     
                                                       ,cRRRAACCT,                   ,  ,,,,,,,,,,,,,,,,,,,,   cARRRRRARRRATcc,,,,,                                                                     
                                                       ,CRRRRRRRRRRAc,        ,   ,,,,,,,,,,,,,,,,,,,,,,,    ,ARRRRAAARRRTccc,,,,,,                                                                     
                                                       ,CRRRRRRRRRRRRRAT,      ,,,,,,,,,,,,,,,,,,,,,,,,,  ,cARRRARAAARRRAcccc,,,c,,                                                                     
                                                        cRRRRRRRRARRRRRRRRC,      ,,,,,,,,,,,,,,,,,,,   ,cARRRRRRAAARRRCccc,,,,cc,                                                                      
                                                        ,cTccTRRRRRRARARRRRRRRCc,,,,,,,,,,,,,,,,,,,, , ,,,ccsARRRRRRRAcccc,,,,,cc,                                                                      
                                                         ,cccccccARRRAAARARRRRRRc,,,, , ,,, ,,,,, ,  ,,,,,,,,,ccCRRRTcccc,,,,,,cs,                                                                      
                                                          ,Tcc,cccTRRRARARARRRCc,,,,     , ,,,   ,,,,,,,,,,,,,,,,ccccccc,,,,,,cc,                                                                       
                                                          ,cTc,,,cccCRRRRRRRAc,  ,,,,,,   ,,,   ,,,  ,,,,,,,,,,,,,,,,,,,, ,,,cs,                                                                        
                                                           ,cCcc,,,cccCRRRAT,,,,,,,        ,    ,,,  ,,,,,,,,,,,,,,,,,,,   ,cc,                                                                         
                                                            ,CCcc,,,cccTRCc,,,,,,,,,,,,           ,   ,,,,,,,,,,,,,,,,,,,,,cTc                                                                          
                                                             ,cCTc,,,ccccccc,,,,,,,,,,,,           ,,,,,,,,,,,,,,,,,,,,,,,cc,                                                                           
                                                               ,TCTccccccccc,cc,,,,,,,,,,,,,,,,,,,,,,,, ,,,,,,,,,,,,,,,,,,c,,                                                                           
                                                                 cTCTscccccc,c,,,,,,,,,, ,,,,,,,,,   ,,,,,,,,,,,,,,,,,,,,,,,,,                                                                          
                                                                  ,cTsccccc,,,c,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                        
                                                                    ,ccccscc,,,c,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                      
                                                                    ,cscccccccc,c,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                     
                                                                   ,cTcccccccccc,c,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                   
                                                                  ,cCcccccccccccc,,,,,,,,,,,,,,,,,,,,,,,sCACCCTc,,,,,,,,,,,,,,,,,,,,,,,                                                                 
                                                                 ,cTcccccccccccCCCTc,,,,cc,,,,,,,c,,,,cARRARRRRRTc,,,,,,,,,,,,,,,,,,,,,,,,                                                              
                                                                 cCscccccccccTRRRRRRT,,,c,c,,,,,,,,,cTRCc ,cRRRRRc,,,,,,,,,,,,,,,,,,,,,,,,                                                              
                                                                 cTscccccccCRRRAccRRRAsc,,,,,,,,,,,,cRRAccsCsARRTc,,,,,,,,,,,,,,,,,,                                                                    
                                                                ccsccccccccCRRRAcsRRRRA,,,,,,,,,,,,,,cCARRRRRACc, ,,,,,,,,,,,,,,,,,,,                                                                   
                                                              ,CAATcccccccc,cTRRRRRRRRc, ,,,   , ,     ,,sTCTc,  ,,,,,,,,,,,,,,ccc,,,                                                                   
                                                              ,,,,cccccccccc,,,cTTCsc,,,,,,                    ,,,,,,,,,,,ccTcc,,                                                                       
                                                                  ,sCTcccccccc,,,,,,,,,,,,       ,,,,,,,     ,,c,,,,,,ccsTTT,,                                                                          
                                                                   ,ccCTTsscccccccc,,,,,,,,,,,c,, ,,,,, , ,,,,,,,,ccscTTCc,                                                                             
                                                                      ,,cTTTsscscscc,,,,,,,,,RRC,, ,,,,,,,,,,,,ccscssCsc,                                                                               
                                                                          ,cCTTsccccccccc,,,,cc,,,,,,,,,,,,,c,,,ccTTc,                                                                                  
                                                                             ,ccsscccccscccccc,,,c,c,ccccc,cccccTT,                                                                                     
                                                                               ,cTTsscscscccscscccccccccccsTTTTcc,,                                                                                     
                                                                               ,,,,cTTcccssTcTsTsTTTTTsTTTccc,,,,,,,,,                                                                                  
                                                                              ,c,,,,,,c,,cccc,ccccccc,,,,,,,,,,,,,,,,,,                                                                                 
                                                                             ,,c,,,,,,,c,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                                
                                                                            ,cc,,,,,,,,ccc,,,,, , , ,,,,,,,,,,,,,,,,,,,,                                                                                
                                                                            ,cc,,,,,,,,ccc,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                               
                                                                            ,cc,,,,,,,cccc,,,,, ,,,,,,,,,,,,,,,,,,,,,,,,,                                                                               
                                                                           ,,,,,,,,,,ccccc,, ,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                               
                                                                           ,,  ,,,,,cccc,,,,,,,,,,,,,,,,,,,,, ,,,,,,,,,,,,                                                                              
                                                                           ,,, ,,,,,cccc,,   ,,,,,,,,,,,,,,,, ,,,,,,,,,,,,                                                                              
                                                                          ,,,,,,,,,ccc,,,,, ,,,,,,,,,,,,,,,,, ,,,,,,,,,,,                                                                               
                                                                          ,,,,,,,,cccc,,,,, ,,,,,,,,,,,,,,,,  ,csc,,   , ,                                                                              
                                                                         ,cc,,,,,,cccc,,,,, ,,,,,,,,,,,,,,,,  ,cCTc,, ,,,                                                                               
                                                                        ,,cc,,,,,csscc,,,,  ,,,,,,,,,,,,,,,, , ,,Tsc,,,,                                                                                
                                                                        ,c,,,,c,,,sccc,,,,,,,,,,,,,,,,,,,,,,,,  ,cAAc,,,,                                                                               
                                                                       ,ccccc,,  ,sscc,,,,,,,,,,,,,,,,,,,,,,,, , ,RRCc,,,                                                                               
                                                                        ,csc,   ,cscc,,,,,,,,,,,,,,,,,,,,,,,,,,,,,cCATc,                                                                                
                                                                                ,ccccc,,,,,,,,,,,, ,,,,,,,,,,,,,,, ,,,,                                                                                 
                                                                                ,cTccc,,,,,,,,,,,,,,,,,,,,,,,,, ,,,                                                                                     
                                                                                ,ssc,,,,,,,,,, , , , , , , ,,,,,,,,                                                                                     
                                                                                cscc,,,,,,,,,,,,, , , , ,,,,,,,,,,,                                                                                     
                                                                                cTcc,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,                                                                                    
                                                                                cTcc,,,,, ,,,,,,,,,,cccccc,,,,,,,,,,                                                                                    
                                                                               ,cTcc,,,, ,,,,,,,,,cTsTscc,,,,,,,,,,,,                                                                                   
                                                                              cTTcccc,, ,,,,,,,,,,ccTcc,,,,,,  ,,,,,,                                                                                   
                                                                             csTcccc,,,, , , ,,,,,,,cc,,,,,,,,,,,,,,,                                                                                   
                                                                            csTccccc,,,,,,,,,,,,,,,,c,,,,,,,,   ,,,,,,                                                                                  
                                                                           ,cTcccccc,,,,,,,,,,,,,,,,cc,,,,,,,  ,,,,,,,                                                                                  
                                                                           cCsscccccc,,,,,,,,,,,,  ,Tcc,,,,,,,, ,,,,,,,                                                                                 
                                                                           ,cTsccccc,,,,,,,,,,,,   ,TCcccc,,,,,,,,,,,,,                                                                                 
                                                                            ,cTccccc,,,,,,,,,,,,   ,sTscc,,,,,,,,,,,,,,                                                                                 
                                                                             ,cTsccccc,,,,,,,,,     cTcc,,,,,, ,,,,,,,,                                                                                 
                                                                              ,cTsccccc,,,,cc,     ,cccc,,,,, ,,,,,,,,,                                                                                 
                                                                               ,cCTTsTTTcscs,     ,cTscc,,,, ,,,,,,,,,,                                                                                 
                                                                                ,ccc,,,,,,,,      ,,sc,,,,,,,,,,,,,,,,,                                                                                 
                                                                                                  ,ccc,,,,,,,,,,,,,,,,,                                                                                 
                                                                                                  ,cscc,,,,,,,,,,,cTCc,                                                                                 
                                                                                                   cCATTcccc,ccsTTTTc,                                                                                  
                                                                                                   ,,,ccccTTCTcc,,,                                                                                     
                                                                                                           ,,,                                                                                          
</PRE>
</DIV>
*/
 }
}