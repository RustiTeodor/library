package com.example.library.controller;

import com.example.library.model.ReadableItem;
import com.example.library.service.ReadableItemService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/readable-items")
public class ReadableItemController {
    private final ReadableItemService readableItemService;

    public ReadableItemController(ReadableItemService readableItemService) {
        this.readableItemService = readableItemService;
    }

    @GetMapping
    public List<ReadableItem> getAllReadableItems() {
        return readableItemService.getAllReadableItems();
    }

    @GetMapping("/{id}")
    public Optional<ReadableItem> getReadableItemById(@PathVariable String id) {
        return readableItemService.getReadableItemById(id);
    }

    @PostMapping
    public ReadableItem createReadableItem(@RequestBody ReadableItem item) {
        return readableItemService.saveReadableItem(item);
    }

    @DeleteMapping("/{id}")
    public void deleteReadableItem(@PathVariable String id) {
        readableItemService.deleteReadableItem(id);
    }
}