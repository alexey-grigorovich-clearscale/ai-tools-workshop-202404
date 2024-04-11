# TCP Packet Capture lab for AI workshop

# Pre-requisites

This lab contains pre-fabricated packet capture files to use for the lab.

To recreate the packets on your machine, you'll need the following tools:

- `tcpdump` or Wireshark to capture packets
- python3 to simulate a web server
- `curl` or any other HTTP client

# Challenge

Analyze the provided packet capture
[packet-capture.txt](https://github.com/alexey-grigorovich-clearscale/ai-tools-workshop-202404/blob/master/labs/packet-capture/packet-capture.txt?plain=1)
in text format corresponding to the output of `tcpdump -Ax` using AI assistants
and determine the network protocol and the payload exchanged.

# Build

Use the following procedure to rebuild the packet capture:

1. Create a sample file and serve it using a local web server:
    ```bash
    echo 'Hello, World!' > hello.txt
    python3 -m http.server 8000
    ```

2. In another console, begin capturing TCP packets on localhost via `tcpdump`:
    ```bash
    sudo tcpdump -U -Ax -i lo0 host localhost and tcp port 8000 2>/dev/null > packet-capture.txt 
    # on linux, replace the loopback network interface name `lo0` with `lo`
    ```

3. In another console, request the `hello.txt` file you've just created using `curl`:
    ```bash
    curl http://localhost:8000/hello.txt
    ```

4. Use the 
