class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        word = s.split(" ")

        if len(pattern) != len(word):
            return False
        
        seen = {}

        # zip은 이렇게 생각하면 돼요: "abba" + "dog cat cat dog" → (a,dog), (b,cat), (b,cat), (a,dog)

        for p, w in zip(pattern, word):
            key_p = ("p", p)
            key_w = ("w", w)

            if key_p in seen and seen[key_p] != w:
                return False
            if key_w in seen and seen[key_w] != p:
                return False
            seen[key_p] = w
            seen[key_w] = p
        return True

