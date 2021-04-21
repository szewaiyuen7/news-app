package com.laioffer.tinnews.model;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.io.Serializable;
import java.util.Objects;

@Entity
public class Article implements Serializable {
    public String author;
    public String title;
    public String description;
    @NonNull
    @PrimaryKey
    public String url;
    public String urlToImage;
    public String content;
    public String publishedAt;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Article article = (Article) o;
        return Objects.equals(author, article.author) &&
                Objects.equals(title, article.title) &&
                Objects.equals(description, article.description) &&
                Objects.equals(url, article.url) &&
                Objects.equals(urlToImage, article.urlToImage) &&
                Objects.equals(content, article.content) &&
                Objects.equals(publishedAt, article.publishedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, title, description, url, urlToImage, content, publishedAt);
    }

    @Override
    public String toString() {
        return "Article{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", url='" + url + '\'' +
                ", urlToImage='" + urlToImage + '\'' +
                ", content='" + content + '\'' +
                ", publishedAt='" + publishedAt + '\'' +
                '}';
    }

    public String getTitle() {
        return title;
    }
}
