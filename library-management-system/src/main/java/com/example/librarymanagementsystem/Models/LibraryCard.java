package com.example.librarymanagementsystem.Models;


import com.example.librarymanagementsystem.Enums.CardStatus;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table
@Getter
@Setter
public class LibraryCard {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cardNo;

    @Enumerated(value = EnumType.STRING)
    private CardStatus cardStatus;

    private Integer noOfBooksIssued;


//    // Foreign Key to be added in the child table
//    @OneToOne
//    @JoinColumn
//    @PrimaryKeyJoinColumn(name = "rollNo")
//    private Student student;

    @OneToOne
    @JoinColumn
    private Student student;



}
