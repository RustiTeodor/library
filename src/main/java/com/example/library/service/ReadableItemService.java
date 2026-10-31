package com.example.library.service;

import com.example.library.model.ReadableItem;
import com.example.library.repository.ReadableItemRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReadableItemService {
    private final ReadableItemRepository readableItemRepository;

    public ReadableItemService(ReadableItemRepository readableItemRepository) {
        this.readableItemRepository = readableItemRepository;
    }

    public ReadableItem saveReadableItem(ReadableItem item) {
        return readableItemRepository.save(item);
    }

    public List<ReadableItem> getAllReadableItems() {
        return readableItemRepository.findAll();
    }

    public Optional<ReadableItem> getReadableItemById(String id) {
        return readableItemRepository.findById(id);
    }

    public void deleteReadableItem(String id) {
        readableItemRepository.delete(id);
    }
}