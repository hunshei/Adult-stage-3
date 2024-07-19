package com.example.game;

import javafx.scene.Node;
import javafx.scene.image.ImageView;

public class Drag {

    private double positionX, positionY;
    public boolean isMouseReleased;
    public boolean draggable = true;

    public void makeDraggableSnap(ImageView picture, ImageView album) {
        picture.setOnMousePressed(mouseEvent -> {
            positionX = mouseEvent.getX();
            positionY = mouseEvent.getY();
        });

        picture.setOnMouseDragged(mouseEvent -> {
            picture.setLayoutX(mouseEvent.getSceneX() - positionX);
            picture.setLayoutY(mouseEvent.getSceneY() - positionY);
            System.out.println("Dragging this image");
        });

        picture.setOnMouseReleased(mouseEvent -> {
            System.out.println("Mouse released");
            if (picture.getBoundsInParent().intersects(album.getBoundsInParent())) {
                System.out.println("Snap to album");
                picture.setLayoutX(album.getLayoutX());
                picture.setLayoutY(album.getLayoutY()-50);
            }
        });
    }


    public void makeDraggable(ImageView picture) {
        picture.setOnMousePressed(mouseEvent -> {
            positionX = mouseEvent.getX();
            positionY = mouseEvent.getY();
        });

        picture.setOnMouseDragged(mouseEvent -> {
            picture.setLayoutX(mouseEvent.getSceneX() - positionX);
            picture.setLayoutY(mouseEvent.getSceneY() - positionY);
            System.out.println("Dragging this image");
        });
    }

}
