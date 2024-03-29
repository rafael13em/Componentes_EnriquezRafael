/*
 * Copyright (c) 2011, 2014 Oracle and/or its affiliates.
 * All rights reserved. Use is subject to license terms.
 *
 * This file is available and licensed under the following license:
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 *  - Redistributions of source code must retain the above copyright
 *    notice, this list of conditions and the following disclaimer.
 *  - Redistributions in binary form must reproduce the above copyright
 *    notice, this list of conditions and the following disclaimer in
 *    the documentation and/or other materials provided with the distribution.
 *  - Neither the name of Oracle nor the names of its
 *    contributors may be used to endorse or promote products derived
 *    from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 * "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
 * LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR
 * A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT
 * OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
 * SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT
 * LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
 * DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY
 * THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
 * OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

package campotextoboton;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import campotextonumerico.CampoTextoNumerico;
import javafx.event.EventType;
import javafx.scene.control.Label;
import selectordeslizamiento.SelectorDeslizamiento;
import temporizador.Temporizador;
import javafx.scene.layout.VBox;

public class CustomControlExample extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        VBox root = new VBox();
        CampoTextoBoton customControl = new CampoTextoBoton();
        customControl.setText("Hello!");
        CampoTextoNumerico customNumerico = new CampoTextoNumerico();
        SelectorDeslizamiento selectorDes = new SelectorDeslizamiento();
        Temporizador temp = new Temporizador(5);
        root.getChildren().add(customControl);
        root.getChildren().add(customNumerico);
        root.getChildren().add(selectorDes);
        root.getChildren().add(temp);
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.setTitle("Custom Control");
        stage.setWidth(300);
        stage.setHeight(200);
        stage.show();
        
        temp.initTemporizador();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}
