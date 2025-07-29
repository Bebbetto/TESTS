window.onload = () => {
  const inputField = document.querySelector(".string");
  const buttons = document.querySelectorAll("button");

  let currentInput = "";

  function updateDisplay() {
    inputField.value = currentInput;
  }

  function evaluateExpression() {
    try {
      const expression = currentInput
        .replace(/x/g, "*")
        .replace(/÷/g, "/")
        .replace(/,/g, ".");

      const result = eval(expression);

      if (!isFinite(result)) {
        inputField.value = "Ошибка: деление на 0";
      } else {
        inputField.value = result;
        currentInput = result.toString();
      }
    } catch {
      inputField.value = "Ошибка ввода";
      currentInput = "";
    }
  }

  buttons.forEach(button => {
    button.addEventListener("click", () => {
      const value = button.textContent;

      if (value === "C") {
        currentInput = "";
        updateDisplay();
        return;
      }

      if (value === "=") {
        evaluateExpression();
        return;
      }

      currentInput += value;
      updateDisplay();
    });
  });

  // Клавиатура
  document.addEventListener("keydown", e => {
    const key = e.key;

    if (/\d/.test(key)) {
      currentInput += key;
    } else if (["+", "-", "*", "/", "x"].includes(key)) {
      currentInput += key === "x" ? "*" : key;
    } else if (key === "Enter") {
      e.preventDefault();
      evaluateExpression();
      return;
    } else if (key === "Backspace") {
      currentInput = currentInput.slice(0, -1);
    } else if (key === ".") {
      currentInput += ".";
    } else {
      return; // игнорировать другие клавиши
    }

    updateDisplay();
  });
};