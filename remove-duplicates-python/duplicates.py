"""
Remove Duplicates from a List — 3 Methods Compared
---------------------------------------------------
Demonstrates three Pythonic ways to remove duplicate values,
and highlights the trade-offs between order, speed, and readability.

Author: Hikman Shinwari
GitHub: github.com/hikman-shinwari
"""

my_list = [1, 1, 1, 2, 2, 3, 3, 3, 3]


# ─── Method 1: Manual loop ─────────────────────────────────
# ✓ Preserves original order
# ✗ O(n²) — slower for large lists
def remove_duplicates_loop(items):
    unique = []
    for item in items:
        if item not in unique:
            unique.append(item)
    return unique


# ─── Method 2: Using set() ─────────────────────────────────
# ✓ Fastest — O(n)
# ✗ Does NOT preserve order
def remove_duplicates_set(items):
    return list(set(items))


# ─── Method 3: Using dict.fromkeys() ───────────────────────
# ✓ Preserves order AND fast — O(n)
# ✓ Best of both worlds (Python 3.7+)
def remove_duplicates_dict(items):
    return list(dict.fromkeys(items))


if __name__ == "__main__":
    print("Original list:   ", my_list)
    print("Method 1 (loop): ", remove_duplicates_loop(my_list))
    print("Method 2 (set):  ", remove_duplicates_set(my_list))
    print("Method 3 (dict): ", remove_duplicates_dict(my_list))
