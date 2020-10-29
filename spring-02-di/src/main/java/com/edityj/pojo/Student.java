package com.edityj.pojo;

import java.util.*;

public class Student {
  private String name;
  private Address address;
  private String[] book;
  private List<String> hobbies;
  private Map<String, String> cards;
  private Set<String> games;
  private String wife;
  private Properties info;

  @Override
  public String toString() {
    return "Student {" +
        "\n\taddress=" + address +
        ",\n\tname='" + name + '\'' +
        ",\n\tbook=" + Arrays.toString(book) +
        ",\n\thobbies=" + hobbies +
        ",\n\tcards=" + cards +
        ",\n\tgames=" + games +
        ",\n\twife='" + wife + '\'' +
        ",\n\tinfo=" + info +
        ",\n}";
  }

  public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String[] getBook() {
    return book;
  }

  public void setBook(String[] book) {
    this.book = book;
  }

  public List<String> getHobbies() {
    return hobbies;
  }

  public void setHobbies(List<String> hobbies) {
    this.hobbies = hobbies;
  }

  public Map<String, String> getCards() {
    return cards;
  }

  public void setCards(Map<String, String> cards) {
    this.cards = cards;
  }

  public Set<String> getGames() {
    return games;
  }

  public void setGames(Set<String> games) {
    this.games = games;
  }

  public String getWife() {
    return wife;
  }

  public void setWife(String wife) {
    this.wife = wife;
  }

  public Properties getInfo() {
    return info;
  }

  public void setInfo(Properties info) {
    this.info = info;
  }
}
