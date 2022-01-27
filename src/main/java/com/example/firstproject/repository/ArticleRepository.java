package com.example.firstproject.repository;

import com.example.firstproject.entity.Article;
import org.springframework.data.repository.CrudRepository;

////////////////////////////////////////////////<관리대상 entity, 관리대상 entity에서 대표값의 타입>
// cruprepository는 save하는 거, id값을 찾아 쓰는 거 정도로 이해
public interface ArticleRepository extends CrudRepository<Article, Long> {

}
