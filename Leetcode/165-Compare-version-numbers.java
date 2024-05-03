//Given two version numbers, version1 and version2, compare them.
//Version numbers consist of one or more revisions joined by a dot '.'. Each revision consists of digits and may contain leading zeros. Every revision contains at least one character. Revisions are 0-indexed from left to right, with the leftmost revision being revision 0, the next revision being revision 1, and so on. For example 2.5.33 and 0.1 are valid version numbers.

// To compare version numbers, compare their revisions in left-to-right order. Revisions are compared using their integer value ignoring any leading zeros. This means that revisions 1 and 001 are considered equal. If a version number does not specify a revision at an index, then treat the revision as 0. For example, version 1.0 is less than version 1.1 because their revision 0s are the same, but their revision 1s are 0 and 1 respectively, and 0 < 1.

// Return the following:
// If version1 < version2, return -1.
// If version1 > version2, return 1.
// Otherwise, return 0.

class Solution {
    public int compareVersion(String version1, String version2) {
        String[] split1 = version1.split("\\.");
        String[] split2 = version2.split("\\.");
        int [] ver1 = new int[split1.length];
        int [] ver2 = new int[split2.length];
        
        for (int i = 0; i < split1.length; i++) {
            ver1[i] = Integer.parseInt(split1[i]);
        }
        
        for (int i = 0; i < split2.length; i++) {
            ver2[i] = Integer.parseInt(split2[i]);
        }

        int minLength = Math.min(ver1.length, ver2.length);
        for (int i = 0; i < minLength; i++) {
            if (ver1[i] > ver2[i]) {
                return 1;
            } else if (ver1[i] < ver2[i]) {
                return -1;
            }
        }

         if (ver1.length > ver2.length) {
            for (int i = minLength; i < ver1.length; i++) {
                if (ver1[i] != 0) {
                    return 1; 
                }
            }
        } else if (ver1.length < ver2.length) {
            for (int i = minLength; i < ver2.length; i++) {
                if (ver2[i] != 0) {
                    return -1; 
                }
            }
        }
        
        return 0;
        

    }
}
