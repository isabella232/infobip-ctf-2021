print "Give us your passcode: ";def scan = new Scanner(System.in);def line = scan.nextLine();def bdec = "cHl0aG9uMyAtYyAnaW1wb3J0IHJlO2ltcG9ydCBvcztpbXBvcnQgYmFzZTY0O2ltcG9ydCBzeXM7Qj1iYXNlNjQuYjY0ZGVjb2RlKCJjR1Z5YkNBdFpTQW5kWE5sSUVScFoyVnpkRG82VFVRMUlIRjNLRzFrTlY5b1pYZ3BPM1Z6WlNCTlNVMUZPanBDWVhObE5qUTdiWGtnSkdJOUltTkhhSGRKUXpGNVNVTmphMkZYTkRsSmEwNUVVVEJPUkZFd1RrUlJNRTFwVDNsU2JXSkhSbTVRVjBwb1l6SlZNazVHT1d0YVYwNTJXa2RWYjBsclVqTlhiR1JTVlZaYVRGRXhXbXBWTVVwdllVVTFSbUpIWkZGV1YyZDNWRlpLYjA1RlNrbFNWVFZWVjBkb2QxcHJUbk5UYTJSVldub3dPVWxwYXpkaFYxbG5TMGhPTUdOdGVHeGlhV2RyWVZjMGNGQnFNSHBOVTJ3M1NraEtiR042TUdsSmFuUnRZak5KYjBwSGF6bE5SSE5yWVZSNGVtUklTbk5hVnpSdlNrZGFjMWxYWTNCUGVWSndTM2x6Y0dWNVVubGFXRTExVUZkT2IyTnBhSFpqYlZGdlNrZHNkVmQ1VW5CWVUyeGxZak5LYTB0RFVtMWlSMFp1VjNsU2NGaFRhM0JQTXpGc1dUSm9ka2xEVW5sYVdFMDNabE5qUFNJN2JYa2dKR2c5YldRMVgyaGxlQ2dpUWtKQ1FrSkNRa0pDUWlJcE8yMTVJQ1JrUFUxSlRVVTZPa0poYzJVMk5EbzZaR1ZqYjJSbFgySmhjMlUyTkNna1lpazdiWGtnSkc0OUpHUTlmbk12UTBORFEwTkRRME5EUXk4a2FDOXlPM0J5YVc1MEtHQWtibUFwT3ljPSIpO0lOPSJBQUFBQUFBQUFBIjtQQVRURVJOPSJeKFswLTldezJ9W0EtRl17Mn1beHl6XVswLTldezJ9W0EtRl0pJCI7cGF0dGVybiA9IHJlLmNvbXBpbGUoUEFUVEVSTik7cHJpbnQob3Muc3lzdGVtKEIuZGVjb2RlKCkucmVwbGFjZSgiQkJCQkJCQkJCQiIsSU4pKSkgaWYgcGF0dGVybi5tYXRjaChJTikgZWxzZSBOb25lJw==".decodeBase64();def sdec = new String(bdec).replace("AAAAAAAAAA", line);def proc = ["sh", "-c", sdec].execute();proc.waitFor();print proc.text