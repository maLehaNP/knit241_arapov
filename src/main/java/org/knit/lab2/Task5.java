package org.knit.lab2;

public class Task5 {
    public static abstract class FileSystemComponent {
        public abstract String getName();

        public abstract byte getSize();

        public abstract void add(FileSystemComponent component);

        public abstract void remove(FileSystemComponent component);

        public abstract void display(String indent);
    }

    public static class File extends FileSystemComponent {
        String name;
        byte size;

        @Override
        public String getName() {
            return name;
        }

        @Override
        public byte getSize() {
            return size;
        }

        @Override
        public void add(FileSystemComponent component) {

        }

        @Override
        public void remove(FileSystemComponent component) {

        }

        @Override
        public void display(String indent) {

        }
    }

    public static class Folder extends FileSystemComponent {

        @Override
        public String getName() {
            return "";
        }

        @Override
        public byte getSize() {
            return 0;
        }

        @Override
        public void add(FileSystemComponent component) {

        }

        @Override
        public void remove(FileSystemComponent component) {

        }

        @Override
        public void display(String indent) {

        }
    }
}
