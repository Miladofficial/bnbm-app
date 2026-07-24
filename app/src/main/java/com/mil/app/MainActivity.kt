Act as a Senior Android & Kotlin Developer. I want you to design and implement a professional, fully-functional, and ultra-modern Calculator Application in Kotlin for Android using modern Android development best practices.

### 1. Architecture & Tech Stack
- Architecture: Clean Architecture with MVVM (Model-View-ViewModel) pattern.
- UI Framework: Jetpack Compose with Material Design 3 (MD3).
- Language: Kotlin (100%), leveraging Coroutines and Flow for reactive state management.
- Dependency Injection: Hilt (or Koin).
- State Management: StateFlow and UIState pattern in ViewModel.

### 2. Core Features & Mathematical Engine
- Dual Display Modes: 
  - Standard Mode (Basic arithmetic: +, -, *, /, %, parenthesis).
  - Scientific Mode (Trigonometric functions sin/cos/tan, logarithms, square root, powers $x^y$, factorials, constants $\pi, e$).
- Expression Parsing: Parse complex expressions safely respecting order of operations (PEMDAS/BODMAS). Implement a robust expression evaluator algorithm (e.g., Shunting-yard algorithm with AST/Lexer) rather than basic string concatenation.
- Calculation History:
  - Store history items (Expression + Result + Timestamp) using Room Database.
  - Display history via a glassmorphic bottom sheet or toggleable panel.
  - Tapping a history item reloads its result/expression back into the input field.
- Precision & Error Safety:
  - Prevent invalid inputs (e.g., multiple consecutive decimal points 1..2, mismatched parenthesis, dividing by zero).
  - Provide clean error feedback (e.g., "Cannot divide by zero", "Format Error").
  - Handle large numbers accurately using BigDecimal or high-precision floating-point formatting.

### 3. Customized UI/UX & High-End Visuals
- Visual Theme: Ultra-modern dark aesthetic with OLED Pitch Black (#000000) background, combined with glowing neon accents (e.g., Cyberpunk Cyan / Electric Amber for operator keys).
- Glassmorphic Touch: Apply translucent frosted-glass blur effects (Glassmorphism) to the top expression display and calculation history sheet.
- Typography & Formatting: Auto-resizing text on the main display to dynamically fit extremely long numbers without layout breaking or clipping.
- Micro-Interactions & Animations: 
  - Smooth scale/press tactile animation on button touch with subtle haptic feedback.
  - Morphing transitions when toggling between Standard and Scientific panels.
  - Animated ripple effects on result updates.
- Button Palette & Visual Hierarchy:
  - Standard Numbers (0-9): Soft matte dark grey surface.
  - Operators (+, -, *, /): Distinct glowing accent highlight color.
  - Action Keys (AC, C, DEL, =): High-contrast primary fill with subtle neon glow.
- Responsive Layout: 
  - Portrait: Standard mode with access to scientific controls via smooth swipe/toggle.
  - Landscape: Side-by-side expanded view showing standard and scientific keypads simultaneously.

### 4. Output Instructions
Please guide me step-by-step:
1. Provide the recommended Project Structure (packages & layers).
2. Write the core expression evaluation domain logic with unit testing in mind.
3. Provide the ViewModel and UI State definitions.
4. Provide the Jetpack Compose UI code with clean, modular components (Display, Keypad, History, Theme).