# 🟢 Shape Calculator - Area, Perimeter & Volume

## 📌 Introduction
Welcome to the **Shape Calculator**! This Java program provides a menu-driven system to calculate the **area, perimeter, and volume** of different geometric shapes. The program is designed using **OOP principles** with an **abstract class (`Shape`)** and an **interface (`Volume`)**, ensuring a well-structured and extensible approach.

Users can input dimensions for various shapes and receive computed values instantly.

---

## 📂 File Structure
```bash
📁 Shape-Calculator
├── 📄 Main.java          # Main menu-driven program
├── 📄 Shape.java         # Abstract class defining structure for all shapes
├── 📄 Volume.java        # Interface for volume calculations
├── 📄 Circle.java        # Class for Circle operations
├── 📄 Rectangle.java     # Class for Rectangle operations
├── 📄 Square.java        # Class for Square operations
├── 📄 Sphere.java        # Class for Sphere operations
├── 📄 Cylinder.java      # Class for Cylinder operations
├── 📄 EquilateralPyramid.java  # Class for Equilateral Pyramid operations
└── 📄 README.md          # Documentation
```

---

## 📌 Classes, Methods & Formulas
Each shape has its own **class**, inheriting from `Shape`, and some implement `Volume` for 3D objects. Below are the detailed descriptions of each:

### 🔵 **Circle.java**
**Methods:**
- `calculateArea()` → π × r²
- `calculatePerimeter()` → 2 × π × r

### 🟧 **Rectangle.java**
**Methods:**
- `calculateArea()` → length × breadth
- `calculatePerimeter()` → 2 × (length + breadth)

### 🟩 **Square.java**
**Methods:**
- `calculateArea()` → side²
- `calculatePerimeter()` → 4 × side

### 🔴 **Sphere.java** *(Implements `Volume`)*
**Methods:**
- `calculateArea()` → 4 × π × r² (Surface Area)
- `calculatePerimeter()` → Not applicable (returns 0)
- `calculateVolume()` → (4/3) × π × r³

### 🟦 **Cylinder.java** *(Implements `Volume`)*
**Methods:**
- `calculateArea()` → 2 × π × r × (r + h)
- `calculatePerimeter()` → 2 × π × r (Circumference of base)
- `calculateVolume()` → π × r² × h

### ⏹ **EquilateralPyramid.java** *(Implements `Volume`)*
**Methods:**
- `calculateArea()` → Base area + Lateral surface area
  - Base: side²
  - Lateral: 2 × side × slant height
- `calculatePerimeter()` → 4 × side
- `calculateVolume()` → (1/3) × side² × height

---
