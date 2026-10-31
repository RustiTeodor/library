package com.example.library.repository;

import com.example.library.model.ReadableItem;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class ReadableItemRepository {
    private final List<ReadableItem> items = new ArrayList<>();

    public ReadableItem save(ReadableItem item) {
        delete(item.getId());
        items.add(item);
        return item;
    }

    public List<ReadableItem> findAll() {
        return new ArrayList<>(items);
    }

    public Optional<ReadableItem> findById(String id) {
        return items.stream().filter(i -> i.getId().equals(id)).findFirst();
    }

    public void delete(String id) {
        items.removeIf(i -> i.getId().equals(id));
    }
}