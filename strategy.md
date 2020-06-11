# Bài giới thiệu về ... 
    
## Giới thiệu
    Thuộc loại mẫu hành vi (behavior pattern). Pattern này cho phép chọn lựa 1 thuật toán để triển khai trong thời gian trương trình chạy (runtime). 
## Trường hợp sử dụng ...

    - Mong muốn một thuật toán nào được chạy trong thời gian trương trình chạy, thay vì là cố định sẵn một thuật toán. 
    - Sử dụng linh hoạt thuật toán trong lúc runtime

## Cấu trúc
|Strategy inteface|Concretes class|Context class|
|-------|:------------|:-------------------------|

## Impl strategy pattern
Các thuật toán xắp xếp

1. Tạo interface mà tất cả các class thuật toán phải impl
--------------------------------

        public interface SortingStrategy {
            void sort (List<String> sortedArray);
        }

2. Định nghĩa một số thuật toán impl interface sort
---------------------------------
        public class QuickSort implements SortStrategy {
            @Override
            public <T> void sort(List<T> items) {
                System.out.println("Quick sort");
            }
        }
---------------------------------
        public class MergeSort implements SortStrategy {
            @Override
            public <T> void sort(List<T> items) {
                System.out.println("Merge sort");
            }
        }

---------------------------------
        public class SelectionSort implements SortStrategy {
            @Override
            public <T> void sort(List<T> items) {
                System.out.println("Selection sort");
            }
        }
3. Định nghĩa stategy context: Class này chứa tham chiếu tới đố tượng strategy. (Injection stategy interface by contructor )
----------------------------------
    public class SortedList {
        private SortStrategy strategy;
        private List<String> items = new ArrayList<>();
        
        public void setSortStrategy(SortStrategy strategy) {
            this.strategy = strategy;
        }
    
        public void add(String name) {
            items.add(name);
        }

        public void sort() {
            strategy.sort(items);
        }
    }
4. Client request stategy context - Khởi tạo thuật toán muốn sử dụng
-----------------------------------
    public static void main(String[] args) {
        SortedList sortList = new SortedList(new QuickSort());
        sortList.add("item1");
        sortList.add("item2");
        sortList.sort();
    }