# Valid Parentheses

## Problem Description

You are given a string `s` consisting of the following characters: `'('`, `')'`, `'{'`, `'}'`, `'['` and `']'`.

The input string `s` is valid if and only if:
1. Every open bracket is closed by the same type of close bracket.
2. Open brackets are closed in the correct order.
3. Every close bracket has a corresponding open bracket of the same type.

Return `true` if `s` is a valid string, and `false` otherwise.

## Examples

### Example 1
```text
Input: s = "[]"
Output: true
```

### Example 2
```text
Input: s = "([{}])"
Output: true
```

### Example 3
```text
Input: s = "[(])"
Output: false
```
