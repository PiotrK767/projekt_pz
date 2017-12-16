package com.pz.youtube;


import com.pz.youtube.DataBase.test;
import de.felixroske.jfxsupport.AbstractJavaFxApplicationSupport;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class YoutubeApplication extends AbstractJavaFxApplicationSupport {

	public static void main(String[] args) {
		launchApp(YoutubeApplication.class, YoutubeView.class, args);

        test testowy = new test();
        testowy.loadData();


	}
}
