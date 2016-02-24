package web2.adventuregame;

import android.content.Context;
import android.content.res.XmlResourceParser;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

import java.io.IOException;

/**
 * Created by paul.rodrigues on 24/02/16.
 */
public class Data {



    public Data(Context context) throws XmlPullParserException, IOException {

        //instanciations

        // Récupérer le fichier xml
        XmlResourceParser xpp = context.getResources().getXml(R.xml.data);

        //début de l'analyse du xml
        xpp.next();
        int eventType = xpp.getEventType();
        while (eventType != XmlPullParser.END_DOCUMENT){// tant que pas fini...
            if(eventType == XmlPullParser.START_TAG){
            } else if(eventType == XmlPullParser.END_TAG) { // fin d'une image
            } else if(eventType == XmlPullParser.TEXT) {
                //text = xpp.getText(); // On met le text de coté pour la fin de la balise.

            }
            eventType = xpp.next(); // au suivant !
        }

}
