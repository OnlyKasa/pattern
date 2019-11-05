# Bài giới thiệu về ...

## 1. Giới thiệu.
    ... là một design pattern loại hành vi (behavior).Sử dụng một đối tượng để đóng gói những thông tin cần thiết để thực hiện một hành động hoặc một trigger

## 2. Sử dụng ... trong trường hợp nào?
* Thay thế câu lệnh if-else với những action lặp đi lặp lại. 
* Thực hiện job với tham số khác nhau, action khác nhau 

## 3. Cấu trúc của ...

    Để implement được pattern này thì yêu cầu phải implement đủ các element : invoker, comand class, reciver class và client .
| Component |Khái niệm|Cách khai báo|
|:-----------|:-----------|:-------------|
|Command|Bao gồm nhiều 1 interface và nhiều class khác implment lại class đó.<br> - Interface bao gồm một hoặc nhiều hàm không có body định nghĩa những action mà chúng ta cần chương trình thực hiện <br> - Class impl lại interface vừa tạo. Chúng định nghĩa lại các hàm bởi những action cụ thể. Số lượng class phụ thuộc vào số điều kiện của request muốn xử lý. Trong những class này có định nghĩa class được gọi là receiver|---------------------------|
|Receiver| Là một object chứa một danh sách các action hoặc một mỗi object là một action cụ thể mà khi command method được gọi.   |--------|
| Invoker | Class Runner/Executor đảm nhiệm việc gọi các action method thông qua intance của command class. Class này biết làm thế nào để thực hiện lệnh nhưng lại không biết thực tế  các command hoạt động thế nào|----------------|

## Các bước để impl command pattern

1. Bước 1: Tạo một interface (Command interface)

        /**
        * Định nghĩa một command interface
        */
        public interface JobCommand {

            public void prepare();
            public void execute();

            public void onComplete();
            public void onError(Exception e);
        }

2. Bước 2: Định nghĩa một command class implement command interface (Mỗi class này đồng thời là một receiver class, Các trường hợp xảy ra thể hiện bằng 1 class)

        /**
        * Định nghĩa một command class
        */
        public static class Job1001 implements  JobCommand {

            @Override
            public void prepare() {
                System.out.println("Prepare--------");
                // do something
            }

            @Override
            public void execute() {
                System.out.println("Execute--------");
                // do something
            }

            @Override
            public void onComplete() {
                System.out.println("Complete--------");
                // need log response
                // do something
            }

            @Override
            public void onError(Exception e) {
                System.out.println("Error--------");
                // need log error
                // do something
            }
        }

3. Bước 3: Định nghĩa một lớp invoker class để gọi command

        /**
        * Định nghĩa một invoker class
        */
        public class JobExecutor {
            /**
            * trigger or callable
            */
            public static void runner () {
                JobCommand jobCommand = new Job1002();
                jobCommand.prepare();

                try{
                    jobCommand.execute();
                    jobCommand.onComplete();
                }catch (Exception e) {
                    jobCommand.onError(e);
                    throw e;
                }
            }

            // Client class sẽ chứa method này.
            public static void main(String[] args) {
                runner();
            }
        }