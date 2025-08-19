package com.Lucas_Br4ga.gameList.dto;


import com.Lucas_Br4ga.gameList.entities.Game;

public class GameMinDTO {
	private Long id;
	private String title;
	private Integer year;
	private String imgUrl;
	private String shortDescription;


    public GameMinDTO(){

    }

    public GameMinDTO(Game Entity) {
        this.id = Entity.getId();
        this.title = Entity.getTitle();
        this.year = Entity.getYear();
        this.imgUrl = Entity.getImgUrl();
        this.shortDescription = Entity.getShortDescription();
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Integer getYear() {
        return year;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public String getShortDescription() {
        return shortDescription;
    }
}
