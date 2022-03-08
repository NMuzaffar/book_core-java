package com.github.nmuzaffar.books.corejava.v1ch02_introduction.imageViewer;

import javax.swing.*;
import java.awt.*;

/** A program for viewing images. */
public class ImageViewer {

  public static void main(String[] args) {
    EventQueue.invokeLater(
        () -> {
          var frame = new ImageViewerFrame();
          frame.setTitle("ImageViewer");
          frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          frame.setVisible(true);
        });
  }
}
