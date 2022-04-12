package com.thoughtfocus.designpatterns.behavioral.iterator;

public class NameAndAgeRepository implements Container{
    public String namesAndAge[] = {"Sunil 21","Sreekanth 25","Niyati 21","Vignesh 29"};

    @Override
    public Iterator getIterator() {
        return new NameAndAgeIterator();
    }

    private class NameAndAgeIterator implements Iterator{
        int index;

        @Override
        public boolean hasNext() {
            if(index < namesAndAge.length){
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            if(this.hasNext()){
                return namesAndAge[index++];
            }
            return null;
        }
    }
}
