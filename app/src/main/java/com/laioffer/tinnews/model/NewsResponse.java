package com.laioffer.tinnews.model;

import java.util.List;
import java.util.Objects;

public class NewsResponse {
    public String status;
    public int totalResult;
    public List<Article> articles;
    public String code;
    public String message;

    @Override
    public String toString() {
        return "NewsResponse{" +
                "status='" + status + '\'' +
                ", totalResult=" + totalResult +
                ", articles=" + articles +
                ", code='" + code + '\'' +
                ", message='" + message + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NewsResponse that = (NewsResponse) o;
        return totalResult == that.totalResult &&
                Objects.equals(status, that.status) &&
                Objects.equals(articles, that.articles) &&
                Objects.equals(code, that.code) &&
                Objects.equals(message, that.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, totalResult, articles, code, message);
    }
}
