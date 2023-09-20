package com.example.librarymanagementsystem.Models;

import com.example.librarymanagementsystem.Enums.Genre;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;


@Entity
@Table
@Getter
@Setter
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer bookId;

    private String title;

    private boolean isAvailabe;

    @Enumerated(value = EnumType.STRING)
    private Genre genre;

    private Date publicationDate;

    @ManyToOne
    @JoinColumn
    private Author author;
    //Unidirectional mapping

}
