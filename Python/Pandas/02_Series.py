# series.py

while True:
    print("\n========== SERIES PROGRAM ==========")
    print("1. Natural Number Series")
    print("2. Even Number Series")
    print("3. Odd Number Series")
    print("4. Fibonacci Series")
    print("5. Prime Number Series")
    print("6. Square Number Series")
    print("7. Cube Number Series")
    print("8. Arithmetic Progression (AP)")
    print("9. Geometric Progression (GP)")
    print("10. Harmonic Series")
    print("11. Exit")

    choice = int(input("\nEnter your choice (1-11): "))

    if choice == 11:
        print("Thank you!")
        break

    if choice in [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]:
        n = int(input("Enter the number of terms: "))

    if choice == 1:
        print("\nNatural Number Series:")
        for i in range(1, n + 1):
            print(i, end=" ")

    elif choice == 2:
        print("\nEven Number Series:")
        for i in range(2, 2 * n + 1, 2):
            print(i, end=" ")

    elif choice == 3:
        print("\nOdd Number Series:")
        for i in range(1, 2 * n, 2):
            print(i, end=" ")

    elif choice == 4:
        print("\nFibonacci Series:")
        a, b = 0, 1
        for _ in range(n):
            print(a, end=" ")
            a, b = b, a + b

    elif choice == 5:
        print("\nPrime Number Series:")
        count = 0
        num = 2
        while count < n:
            is_prime = True
            for i in range(2, int(num ** 0.5) + 1):
                if num % i == 0:
                    is_prime = False
                    break
            if is_prime:
                print(num, end=" ")
                count += 1
            num += 1

    elif choice == 6:
        print("\nSquare Number Series:")
        for i in range(1, n + 1):
            print(i ** 2, end=" ")

    elif choice == 7:
        print("\nCube Number Series:")
        for i in range(1, n + 1):
            print(i ** 3, end=" ")

    elif choice == 8:
        print("\nArithmetic Progression (AP)")
        a = int(input("Enter first term: "))
        d = int(input("Enter common difference: "))
        print("AP Series:")
        for i in range(n):
            print(a + i * d, end=" ")

    elif choice == 9:
        print("\nGeometric Progression (GP)")
        a = int(input("Enter first term: "))
        r = int(input("Enter common ratio: "))
        print("GP Series:")
        term = a
        for _ in range(n):
            print(term, end=" ")
            term *= r

    elif choice == 10:
        print("\nHarmonic Series:")
        for i in range(1, n + 1):
            print(f"1/{i}", end=" ")
        print()

    else:
        print("Invalid Choice!")

    print("\n")