package com.epam.jf.common.homework.task7;

public abstract class AbstractIntArrayList {

  protected int[] values;

  public AbstractIntArrayList() {
    this.values = new int[10];
  }

  public AbstractIntArrayList(int capacity) {
    this.values = new int[capacity];
  }

  public AbstractIntArrayList(AbstractIntArrayList list) {
    this.values = new int[(int) (list.values.length * 1.5)];
    for (int i = 0; i < list.size(); i++) {
      this.values[i] = list.values[i];
    }
  }

  public abstract boolean add(int value);

  public abstract boolean add(int value, int index);

  public abstract int get(int index);

  public abstract boolean contains(int value);

  public abstract boolean containsAll(AbstractIntArrayList list);

  public abstract int remove(int index);

  public abstract int set(int value, int index);

  public abstract boolean addAll(AbstractIntArrayList list);

  public abstract void clear();

  public abstract int size();

  public abstract boolean isEmpty();

  public abstract int indexOf(int value);

  public abstract int lastIndexOf(int value);

  public abstract AbstractIntArrayList subList(int fromInclusive, int toInclusive);


}
