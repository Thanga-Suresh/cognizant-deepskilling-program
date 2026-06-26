package com.designpatterns.exercise2;

public abstract class DocumentFactory {

 // Factory Method
 public abstract Document createDocument();

 public void openDocument() {
     Document doc = createDocument();
     doc.open();
 }
}