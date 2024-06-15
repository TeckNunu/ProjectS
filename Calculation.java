import java.util.Arrays;

public class Calculation {

    /**
     * Phương thức tính tổng bình phương của hai số nguyên.
     *
     * @param a Số nguyên thứ nhất
     * @param b Số nguyên thứ hai
     * @return Tổng bình phương của hai số nguyên
     */
    public int sumOfSquares(int a, int b) {
        int result;
        if (a > 0 && b > 0) {
            result = a * a + b * b;
        } else if (a <= 0) {
            result = b * b;
        } else {
            result = a * a;
        }
        return result;
    }

    /**
     * Phương thức tính lũy thừa với số mũ dương.
     *
     * @param base     Số cơ sở
     * @param exponent Số mũ (phải lớn hơn hoặc bằng 0)
     * @return Giá trị lũy thừa
     * @throws IllegalArgumentException Nếu số mũ là số âm
     */
    public double power(double base, int exponent) {
        if (exponent < 0) {
            throw new IllegalArgumentException("Exponent must be non-negative");
        }
        double result = 1.0;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        return result;
    }

    /**
     * Phương thức kiểm tra xem một số có phải là số nguyên tố hay không.
     *
     * @param n Số cần kiểm tra
     * @return True nếu là số nguyên tố, False nếu không phải
     */
    public boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * Phương thức tính số Fibonacci thứ n.
     *
     * @param n Vị trí của số Fibonacci cần tính (phải lớn hơn hoặc bằng 0)
     * @return Giá trị của số Fibonacci thứ n
     * @throws IllegalArgumentException Nếu n là số âm
     */
    public int fibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Fibonacci sequence is not defined for negative numbers");
        }
        if (n == 0 || n == 1) {
            return n;
        }
        int a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            int temp = a + b;
            a = b;
            b = temp;
        }
        return b;
    }

    /**
     * Phương thức tính số lượng ước số của một số nguyên dương.
     *
     * @param n Số nguyên dương
     * @return Số lượng ước số của số nguyên dương
     * @throws IllegalArgumentException Nếu n không phải số nguyên dương
     */
    public int countDivisors(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("Number must be positive");
        }
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        return count;
    }

    /**
     * Phương thức kiểm tra xem một số có phải là số hoàn hảo hay không.
     *
     * @param n Số cần kiểm tra
     * @return True nếu là số hoàn hảo, False nếu không phải
     */
    public boolean isPerfectNumber(int n) {
        if (n <= 0) {
            return false;
        }
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum == n;
    }

    /**
     * Phương thức tính số lượng chữ số của một số nguyên.
     *
     * @param n Số nguyên
     * @return Số lượng chữ số của số nguyên
     */
    public int countDigits(int n) {
        n = Math.abs(n); // Chuyển đổi thành giá trị tuyệt đối để xử lý số âm
        int count = 0;
        while (n > 0) {
            n /= 10;
            count++;
        }
        return count;
    }

    /**
     * Phương thức tính tổng các chữ số của một số nguyên.
     *
     * @param n Số nguyên
     * @return Tổng các chữ số của số nguyên
     */
    public int sumDigits(int n) {
        n = Math.abs(n); // Chuyển đổi thành giá trị tuyệt đối để xử lý số âm
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    /**
     * Phương thức kiểm tra xem một năm có phải là năm nhuận hay không.
     *
     * @param year Năm cần kiểm tra
     * @return True nếu là năm nhuận, False nếu không phải
     */
    public boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        } else {
            return false;
        }
    }

    /**
     * Phương thức kiểm tra xem một chuỗi có phải là chuỗi đối xứng hay không.
     *
     * @param str Chuỗi cần kiểm tra
     * @return True nếu là chuỗi đối xứng, False nếu không phải
     */
    public boolean isPalindrome(String str) {
        if (str == null || str.length() <= 1) {
            return true;
        }
        str = str.toLowerCase(); // Chuyển đổi chuỗi về chữ thường để so sánh
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    /**
     * Phương thức tính tổng các phần tử trong một mảng số nguyên.
     *
     * @param arr Mảng số nguyên
     * @return Tổng các phần tử trong mảng
     */
    public int sumArray(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    /**
     * Phương thức tính trung bình cộng của các phần tử trong một mảng số thực.
     *
     * @param arr Mảng số thực
     * @return Trung bình cộng của các phần tử trong mảng
     */
    public double averageArray(double[] arr) {
        if (arr.length == 0) {
            return 0.0;
        }
        double sum = 0.0;
        for (double num : arr) {
            sum += num;
        }
        return sum / arr.length;
    }

    /**
     * Phương thức kiểm tra xem một mảng số nguyên có phải là mảng tăng dần hay không.
     *
     * @param arr Mảng số nguyên cần kiểm tra
     * @return True nếu là mảng tăng dần, False nếu không phải
     */
    public boolean isIncreasing(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] <= arr[i - 1]) {
                return false;
            }
        }
        return true;
    }
    // (Các phương thức đã cung cấp ở trên đã được bao gồm)

    /**
     * Phương thức tính giai thừa của một số nguyên dương.
     *
     * @param n Số nguyên dương
     * @return Giai thừa của số nguyên dương
     * @throws IllegalArgumentException Nếu n không phải là số nguyên dương
     */
    public int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers");
        }
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    /**
     * Phương thức kiểm tra xem một số có phải là số Armstrong hay không.
     *
     * @param n Số cần kiểm tra
     * @return True nếu là số Armstrong, False nếu không phải
     */
    public boolean isArmstrongNumber(int n) {
        if (n < 0) {
            return false;
        }
        int originalNumber = n;
        int numberOfDigits = countDigits(n);
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += Math.pow(digit, numberOfDigits);
            n /= 10;
        }
        return sum == originalNumber;
    }

    /**
     * Phương thức tính ước chung lớn nhất của hai số nguyên dương.
     *
     * @param a Số nguyên dương thứ nhất
     * @param b Số nguyên dương thứ hai
     * @return Ước chung lớn nhất của hai số nguyên dương
     * @throws IllegalArgumentException Nếu một trong hai số không phải là số nguyên dương
     */
    public int gcd(int a, int b) {
        if (a <= 0 || b <= 0) {
            throw new IllegalArgumentException("Both numbers must be positive");
        }
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    /**
     * Phương thức tính số nguyên tố thứ n.
     *
     * @param n Vị trí của số nguyên tố cần tính (phải lớn hơn hoặc bằng 1)
     * @return Số nguyên tố thứ n
     * @throws IllegalArgumentException Nếu n không phải là số nguyên dương
     */
    public int nthPrime(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("Position must be positive");
        }
        int count = 0;
        int number = 2;
        while (count < n) {
            if (isPrime(number)) {
                count++;
            }
            number++;
        }
        return number - 1;
    }

    /**
     * Phương thức kiểm tra xem một số có phải là số Palindrome hay không.
     *
     * @param n Số cần kiểm tra
     * @return True nếu là số Palindrome, False nếu không phải
     */
    public boolean isPalindrome(int n) {
        int reversed = 0;
        int original = n;
        while (n > 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n /= 10;
        }
        return original == reversed;
    }

    /**
     * Phương thức tính số Catalan thứ n.
     *
     * @param n Vị trí của số Catalan cần tính (phải lớn hơn hoặc bằng 0)
     * @return Giá trị của số Catalan thứ n
     * @throws IllegalArgumentException Nếu n là số âm
     */
    public int catalanNumber(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Catalan number is not defined for negative numbers");
        }
        int[] catalan = new int[n + 1];
        catalan[0] = 1;
        for (int i = 1; i <= n; i++) {
            catalan[i] = 0;
            for (int j = 0; j < i; j++) {
                catalan[i] += catalan[j] * catalan[i - 1 - j];
            }
        }
        return catalan[n];
    }

    /**
     * Phương thức tính tổng các số nguyên tố nhỏ hơn hoặc bằng một số nguyên dương n.
     *
     * @param n Số nguyên dương
     * @return Tổng các số nguyên tố nhỏ hơn hoặc bằng n
     * @throws IllegalArgumentException Nếu n không phải là số nguyên dương
     */
    public int sumPrimesUpTo(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("Number must be positive");
        }
        int sum = 0;
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                sum += i;
            }
        }
        return sum;
    }

    /**
     * Phương thức kiểm tra xem một số có phải là số thuận nghịch hay không.
     *
     * @param n Số cần kiểm tra
     * @return True nếu là số thuận nghịch, False nếu không phải
     */
    public boolean isPalindrome(long n) {
        long reversed = 0;
        long original = n;
        while (n > 0) {
            long digit = n % 10;
            reversed = reversed * 10 + digit;
            n /= 10;
        }
        return original == reversed;
    }

    /**
     * Phương thức tính tổng các ước số chẵn của một số nguyên dương.
     *
     * @param n Số nguyên dương
     * @return Tổng các ước số chẵn của số nguyên dương
     * @throws IllegalArgumentException Nếu n không phải là số nguyên dương
     */
    public int sumEvenDivisors(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("Number must be positive");
        }
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0 && i % 2 == 0) {
                sum += i;
            }
        }
        return sum;
    }

    /**
     * Phương thức tính số nguyên tố lớn nhất nhỏ hơn hoặc bằng một số nguyên dương n.
     *
     * @param n Số nguyên dương
     * @return Số nguyên tố lớn nhất nhỏ hơn hoặc bằng n
     * @throws IllegalArgumentException Nếu n không phải là số nguyên dương
     */
    public int largestPrimeBefore(int n) {
        if (n <= 1) {
            throw new IllegalArgumentException("Number must be greater than 1");
        }
        int largestPrime = 2;
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                largestPrime = i;
            }
        }
        return largestPrime;
    }

    /**
     * Phương thức tính số Fibonacci thứ n bằng đệ quy.
     *
     * @param n Vị trí của số Fibonacci cần tính (phải lớn hơn hoặc bằng 0)
     * @return Giá trị của số Fibonacci thứ n
     * @throws IllegalArgumentException Nếu n là số âm
     */
    public int fibonacciRecursive(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Fibonacci sequence is not defined for negative numbers");
        }
        if (n == 0 || n == 1) {
            return n;
        }
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    /**
     * Phương thức tính số nguyên tố lớn nhất trong một mảng số nguyên.
     *
     * @param arr Mảng số nguyên
     * @return Số nguyên tố lớn nhất trong mảng
     */
    public int largestPrimeInArray(int[] arr) {
        int maxPrime = Integer.MIN_VALUE;
        for (int num : arr) {
            if (isPrime(num) && num > maxPrime) {
                maxPrime = num;
            }
        }
        return maxPrime;
    }

    /**
     * Phương thức tính tổng các số Fibonacci nhỏ hơn hoặc bằng một số nguyên dương n.
     *
     * @param n Số nguyên dương
     * @return Tổng các số Fibonacci nhỏ hơn hoặc bằng n
     * @throws IllegalArgumentException Nếu n không phải là số nguyên dương
     */
    public int sumFibonacciUpTo(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("Number must be positive");
        }
        int sum = 0;
        int fib1 = 0, fib2 = 1;
        while (fib2 <= n) {
            sum += fib2;
            int temp = fib1 + fib2;
            fib1 = fib2;
            fib2 = temp;
        }
        return sum;
    }

    /**
     * Phương thức kiểm tra xem một số có phải là số tự do hay không.
     *
     * @param n Số cần kiểm tra
     * @return True nếu là số tự do, False nếu không phải
     */
    public boolean isPrimeFree(int n) {
        if (n <= 0) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % (i * i) == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * Phương thức kiểm tra xem một mảng có phải là mảng số nguyên tố hay không.
     *
     * @param arr Mảng số nguyên cần kiểm tra
     * @return True nếu là mảng số nguyên tố, False nếu không phải
     */
    public boolean isPrimeArray(int[] arr) {
        for (int num : arr) {
            if (!isPrime(num)) {
                return false;
            }
        }
        return true;
    }

    /**
     * Phương thức tính tổng các số nguyên tố trong một mảng số nguyên.
     *
     * @param arr Mảng số nguyên
     * @return Tổng các số nguyên tố trong mảng
     */
    public int sumPrimeArray(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            if (isPrime(num)) {
                sum += num;
            }
        }
        return sum;
    }

    /**
     * Phương thức tính tổng các số nguyên tố trong một mảng số thực.
     *
     * @param arr Mảng số thực
     * @return Tổng các số nguyên tố trong mảng
     */
    public double sumPrimeArray(double[] arr) {
        double sum = 0;
        for (double num : arr) {
            if (isPrime((int) num)) {
                sum += num;
            }
        }
        return sum;
    }

    /**
     * Phương thức tính tổng các số nguyên tố trong một mảng số nguyên từ một vị trí bắt đầu đến một vị trí kết thúc.
     *
     * @param arr Mảng số nguyên
     * @param start Vị trí bắt đầu tính tổng
     * @param end Vị trí kết thúc tính tổng
     * @return Tổng các số nguyên tố từ vị trí start đến end trong mảng
     * @throws IllegalArgumentException Nếu start hoặc end không hợp lệ
     */
    public int sumPrimeArray(int[] arr, int start, int end) {
        if (start < 0 || end >= arr.length || start > end) {
            throw new IllegalArgumentException("Invalid start or end position");
        }
        int sum = 0;
        for (int i = start; i <= end; i++) {
            if (isPrime(arr[i])) {
                sum += arr[i];
            }
        }
        return sum;
    }

    /**
     * Phương thức tính tổng các số nguyên tố trong một mảng số thực từ một vị trí bắt đầu đến một vị trí kết thúc.
     *
     * @param arr Mảng số thực
     * @param start Vị trí bắt đầu tính tổng
     * @param end Vị trí kết thúc tính tổng
     * @return Tổng các số nguyên tố từ vị trí start đến end trong mảng
     * @throws IllegalArgumentException Nếu start hoặc end không hợp lệ
     */
    public double sumPrimeArray(double[] arr, int start, int end) {
        if (start < 0 || end >= arr.length || start > end) {
            throw new IllegalArgumentException("Invalid start or end position");
        }
        double sum = 0;
        for (int i = start; i <= end; i++) {
            if (isPrime((int) arr[i])) {
                sum += arr[i];
            }
        }
        return sum;
    }

    /**
     * Phương thức tính tổng các số nguyên tố trong một mảng số nguyên lớn.
     *
     * @param arr Mảng số nguyên lớn
     * @return Tổng các số nguyên tố trong mảng
     */
    public long sumPrimeArray(long[] arr) {
        long sum = 0;
        for (long num : arr) {
            if (isPrime((int) num)) {
                sum += num;
            }
        }
        return sum;
    }

    /**
     * Phương thức kiểm tra xem một chuỗi có phải là chuỗi hạnh phúc hay không.
     *
     * @param str Chuỗi cần kiểm tra
     * @return True nếu là chuỗi hạnh phúc, False nếu không phải
     */
    public boolean isHappyString(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        for (int i = 1; i < chars.length; i++) {
            if (chars[i] == chars[i - 1]) {
                return false;
            }
        }
        return true;
    }

    /**
     * Phương thức kiểm tra xem một mảng có phải là mảng hạnh phúc hay không.
     *
     * @param arr Mảng cần kiểm tra
     * @return True nếu là mảng hạnh phúc, False nếu không phải
     */
    public boolean isHappyArray(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                return false;
            }
        }
        return true;
    }

    /**
     * Phương thức tính số nguyên tố lớn nhất nhỏ hơn một số nguyên dương n.
     *
     * @param n Số nguyên dương
     * @return Số nguyên tố lớn nhất nhỏ hơn n
     * @throws IllegalArgumentException Nếu n không phải là số nguyên dương
     */
    public int largestPrimeLessThan(int n) {
        if (n <= 2) {
            throw new IllegalArgumentException("Number must be greater than 2");
        }
        for (int i = n - 1; i >= 2; i--) {
            if (isPrime(i)) {
                return i;
            }
        }
        return -1;
    }
}