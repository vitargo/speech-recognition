package org.vitargo.speechrecognition;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.vitargo.speechrecognition.streaming.MicRecognizer;

@SpringBootApplication
public class SpeechRecognitionApplication {

    public static void main(String[] args) throws Exception {

        SpringApplication.run(SpeechRecognitionApplication.class, args);
        MicRecognizer recognizer = new MicRecognizer();
        recognizer.streamingMicRecognize();
    }

}
