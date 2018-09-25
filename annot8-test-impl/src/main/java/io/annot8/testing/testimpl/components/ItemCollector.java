package io.annot8.testing.testimpl.components;

import io.annot8.core.components.Processor;
import io.annot8.core.components.responses.ProcessorResponse;
import io.annot8.core.data.Item;
import io.annot8.core.exceptions.Annot8Exception;
import java.util.LinkedList;
import java.util.List;

public class ItemCollector implements Processor {

  private final List<Item> items = new LinkedList<>();

  @Override
  public ProcessorResponse process(Item item) throws Annot8Exception {
    items.add(item);
    return ProcessorResponse.ok();
  }

  public List<Item> getItems() {
    return items;
  }

  public void clear() {
    items.clear();
  }
}