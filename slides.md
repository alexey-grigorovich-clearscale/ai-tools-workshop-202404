---
# try also 'default' to start simple
theme: seriph
# random image from a curated Unsplash collection by Anthony
# like them? see https://unsplash.com/collections/94734566/slidev
# some information about your slides, markdown enabled
title: Clearscale Summit 2024 AI in Software Development Workshop
info: |
  ## Clearscale Summit 2024 AI in Software Development Workshop
  Presentation slides and accompanying resources for the AI in Software Development workshop at the Clearscale Summit 2024.

# apply any unocss classes to the current slide
class: text-center
# https://sli.dev/custom/highlighters.html
highlighter: shiki
# https://sli.dev/guide/drawing
drawings:
  persist: false
# slide transition: https://sli.dev/guide/animations#slide-transitions
transition: slide-left
# enable MDC Syntax: https://sli.dev/guide/syntax#mdc-syntax
mdc: true
---

# AI in Software Development Workshop

## Or, The Lazy Developer’s Guide to AI: How to Code Less and Produce More

To follow along, visit https://bit.ly/3vSuj4T

<center>

<img style="width: 128px; height: 128px" src="data:image/svg+xml;base64,PD94bWwgdmVyc2lvbj0nMS4wJz8+CjwhLS0KQml0bHkgR2VuZXJhdGVkIFFSIENvZGUKdjQKMzN4MzMKLS0+Cjxzdmcgd2lkdGg9JzY1NicgaGVpZ2h0PSc2NTYnCnhtbG5zPSdodHRwOi8vd3d3LnczLm9yZy8yMDAwL3N2ZycKeG1sbnM6eGxpbms9J2h0dHA6Ly93d3cudzMub3JnLzE5OTkveGxpbmsnPgoJPGcgaWQ9J2JhY2tncm91bmQnIHN0eWxlPSdmaWxsOiNmZmZmZmYnID4KPHJlY3QgeD0iMCIgeT0iMCIgd2lkdGg9IjY1NiIgaGVpZ2h0PSI2NTYiIC8+CjwvZz4KPGcgaWQ9J3BpcHMnIHN0eWxlPSdmaWxsOiMwMDAwMDAnID4KPHBhdGggZD0iTTY0LDIyNEw4MCwyMjRMODAsMjQwTDgwLDI1Nkw2NCwyNTZMNjQsMjQwTDY0LDIyNE02NCwzNjhMODAsMzY4TDgwLDM4NEw4MCw0MDBMOTYsNDAwTDk2LDM4NEw5NiwzNjhMMTEyLDM2OEwxMTIsMzUyTDEyOCwzNTJMMTI4LDMzNkwxNDQsMzM2TDE0NCwzNTJMMTQ0LDM2OEwxNDQsMzg0TDE2MCwzODRMMTc2LDM4NEwxNzYsMzY4TDE5MiwzNjhMMTkyLDM4NEwyMDgsMzg0TDIwOCw0MDBMMTkyLDQwMEwxNzYsNDAwTDE2MCw0MDBMMTQ0LDQwMEwxMjgsNDAwTDEyOCwzODRMMTEyLDM4NEwxMTIsNDAwTDEyOCw0MDBMMTI4LDQxNkwxMjgsNDMyTDE0NCw0MzJMMTQ0LDQ0OEwxMjgsNDQ4TDExMiw0NDhMMTEyLDQ2NEw5Niw0NjRMODAsNDY0TDY0LDQ2NEw2NCw0NDhMNjQsNDMyTDY0LDQxNkw2NCw0MDBMNjQsMzg0TDY0LDM2OE04MCw0MTZMODAsNDMyTDgwLDQ0OEw5Niw0NDhMOTYsNDMyTDk2LDQxNkw4MCw0MTZNODAsMjA4TDk2LDIwOEw5NiwyMjRMODAsMjI0TDgwLDIwOE04MCwyODhMOTYsMjg4TDk2LDMwNEwxMTIsMzA0TDExMiwzMjBMOTYsMzIwTDgwLDMyMEw4MCwzMDRMODAsMjg4TTgwLDM1Mkw5NiwzNTJMOTYsMzY4TDgwLDM2OEw4MCwzNTJNOTYsMjQwTDExMiwyNDBMMTEyLDIyNEwxMTIsMjA4TDExMiwxOTJMMTI4LDE5MkwxNDQsMTkyTDE0NCwyMDhMMTYwLDIwOEwxNjAsMjI0TDE0NCwyMjRMMTI4LDIyNEwxMjgsMjQwTDEyOCwyNTZMMTI4LDI3MkwxNDQsMjcyTDE0NCwyODhMMTYwLDI4OEwxNzYsMjg4TDE5MiwyODhMMTkyLDMwNEwyMDgsMzA0TDIyNCwzMDRMMjI0LDMyMEwyNDAsMzIwTDI0MCwzMzZMMjQwLDM1MkwyMjQsMzUyTDIyNCwzNjhMMjA4LDM2OEwxOTIsMzY4TDE5MiwzNTJMMTkyLDMzNkwyMDgsMzM2TDIwOCwzMjBMMTkyLDMyMEwxOTIsMzM2TDE3NiwzMzZMMTYwLDMzNkwxNjAsMzIwTDE3NiwzMjBMMTc2LDMwNEwxNjAsMzA0TDE2MCwzMjBMMTQ0LDMyMEwxMjgsMzIwTDEyOCwzMDRMMTEyLDMwNEwxMTIsMjg4TDExMiwyNzJMMTEyLDI1Nkw5NiwyNTZMOTYsMjQwTTE0NCwyNTZMMTYwLDI1NkwxNzYsMjU2TDE3NiwyNzJMMTYwLDI3MkwxNDQsMjcyTDE0NCwyNTZNMTQ0LDQxNkwxNjAsNDE2TDE3Niw0MTZMMTkyLDQxNkwyMDgsNDE2TDIwOCw0MzJMMjA4LDQ0OEwyMjQsNDQ4TDIyNCw0NjRMMjI0LDQ4MEwyMjQsNDk2TDIyNCw1MTJMMjA4LDUxMkwyMDgsNDk2TDE5Miw0OTZMMTkyLDQ4MEwxOTIsNDY0TDE5Miw0NDhMMTc2LDQ0OEwxNzYsNDMyTDE2MCw0MzJMMTQ0LDQzMkwxNDQsNDE2TTE0NCw0NDhMMTYwLDQ0OEwxNzYsNDQ4TDE3Niw0NjRMMTYwLDQ2NEwxNDQsNDY0TDE0NCw0NDhNMTYwLDE5MkwxNzYsMTkyTDE5MiwxOTJMMTkyLDIwOEwxNzYsMjA4TDE2MCwyMDhMMTYwLDE5Mk0xNjAsMjI0TDE3NiwyMjRMMTc2LDI0MEwxNjAsMjQwTDE2MCwyMjRNMTYwLDM1MkwxNzYsMzUyTDE3NiwzNjhMMTYwLDM2OEwxNjAsMzUyTTE5Miw5NkwyMDgsOTZMMjA4LDgwTDIwOCw2NEwyMjQsNjRMMjI0LDgwTDIyNCw5NkwyMjQsMTEyTDIwOCwxMTJMMjA4LDEyOEwxOTIsMTI4TDE5MiwxMTJMMTkyLDk2TTE5MiwxNjBMMjA4LDE2MEwyMDgsMTc2TDE5MiwxNzZMMTkyLDE2ME0xOTIsMjA4TDIwOCwyMDhMMjA4LDE5MkwyMDgsMTc2TDIyNCwxNzZMMjI0LDE5MkwyNDAsMTkyTDI0MCwyMDhMMjI0LDIwOEwyMjQsMjI0TDIwOCwyMjRMMjA4LDI0MEwxOTIsMjQwTDE5MiwyMjRMMTkyLDIwOE0xOTIsMjU2TDIwOCwyNTZMMjA4LDI0MEwyMjQsMjQwTDIyNCwyMjRMMjQwLDIyNEwyNDAsMjA4TDI1NiwyMDhMMjU2LDIyNEwyNzIsMjI0TDI3MiwyMDhMMjg4LDIwOEwyODgsMjI0TDI4OCwyNDBMMjcyLDI0MEwyNzIsMjU2TDI4OCwyNTZMMzA0LDI1NkwzMDQsMjQwTDMyMCwyNDBMMzIwLDI1NkwzMzYsMjU2TDMzNiwyNzJMMzIwLDI3MkwzMDQsMjcyTDMwNCwyODhMMzA0LDMwNEwyODgsMzA0TDI3MiwzMDRMMjcyLDI4OEwyNzIsMjcyTDI1NiwyNzJMMjU2LDI1NkwyNDAsMjU2TDIyNCwyNTZMMjI0LDI3MkwyNDAsMjcyTDI1NiwyNzJMMjU2LDI4OEwyNTYsMzA0TDI1NiwzMjBMMjQwLDMyMEwyNDAsMzA0TDIyNCwzMDRMMjI0LDI4OEwyMDgsMjg4TDIwOCwyNzJMMTkyLDI3MkwxOTIsMjU2TTE5Miw1MTJMMjA4LDUxMkwyMDgsNTI4TDIyNCw1MjhMMjI0LDU0NEwyMDgsNTQ0TDE5Miw1NDRMMTkyLDUyOEwxOTIsNTEyTTIwOCwxNDRMMjI0LDE0NEwyMjQsMTYwTDIwOCwxNjBMMjA4LDE0NE0yMDgsNTYwTDIyNCw1NjBMMjI0LDU3NkwyNDAsNTc2TDI0MCw1NjBMMjU2LDU2MEwyNTYsNTc2TDI3Miw1NzZMMjcyLDU2MEwyODgsNTYwTDI4OCw1NDRMMjg4LDUyOEwyNzIsNTI4TDI1Niw1MjhMMjQwLDUyOEwyNDAsNTEyTDI1Niw1MTJMMjU2LDQ5NkwyNDAsNDk2TDI0MCw0ODBMMjU2LDQ4MEwyNzIsNDgwTDI3Miw0NjRMMjcyLDQ0OEwyODgsNDQ4TDI4OCw0NjRMMzA0LDQ2NEwzMDQsNDgwTDMwNCw0OTZMMzIwLDQ5NkwzMjAsNTEyTDMwNCw1MTJMMzA0LDUyOEwzMDQsNTQ0TDMwNCw1NjBMMzA0LDU3NkwzMDQsNTkyTDI4OCw1OTJMMjcyLDU5MkwyNTYsNTkyTDI0MCw1OTJMMjI0LDU5MkwyMDgsNTkyTDIwOCw1NzZMMjA4LDU2ME0yMjQsMTEyTDI0MCwxMTJMMjQwLDEyOEwyMjQsMTI4TDIyNCwxMTJNMjI0LDE2MEwyNDAsMTYwTDI0MCwxNzZMMjI0LDE3NkwyMjQsMTYwTTIyNCw0MDBMMjQwLDQwMEwyNTYsNDAwTDI1NiwzODRMMjU2LDM2OEwyNzIsMzY4TDI3MiwzODRMMjg4LDM4NEwyODgsNDAwTDI3Miw0MDBMMjcyLDQxNkwyODgsNDE2TDI4OCw0MzJMMjcyLDQzMkwyNTYsNDMyTDI1Niw0MTZMMjQwLDQxNkwyMjQsNDE2TDIyNCw0MDBNMjI0LDU0NEwyNDAsNTQ0TDI0MCw1NjBMMjI0LDU2MEwyMjQsNTQ0TTI0MCw2NEwyNTYsNjRMMjU2LDgwTDI1Niw5NkwyNzIsOTZMMjcyLDgwTDI4OCw4MEwzMDQsODBMMzIwLDgwTDMyMCw2NEwzMzYsNjRMMzUyLDY0TDM1Miw4MEwzMzYsODBMMzM2LDk2TDMyMCw5NkwzMjAsMTEyTDMzNiwxMTJMMzUyLDExMkwzNTIsMTI4TDM1MiwxNDRMMzM2LDE0NEwzMzYsMTI4TDMyMCwxMjhMMzIwLDE0NEwzMzYsMTQ0TDMzNiwxNjBMMzM2LDE3NkwzMjAsMTc2TDMyMCwxNjBMMzA0LDE2MEwzMDQsMTc2TDI4OCwxNzZMMjg4LDE2MEwyNzIsMTYwTDI3MiwxNzZMMjU2LDE3NkwyNTYsMTYwTDI1NiwxNDRMMjcyLDE0NEwyNzIsMTI4TDI4OCwxMjhMMjg4LDE0NEwzMDQsMTQ0TDMwNCwxMjhMMjg4LDEyOEwyODgsMTEyTDI3MiwxMTJMMjcyLDEyOEwyNTYsMTI4TDI1NiwxMTJMMjQwLDExMkwyNDAsOTZMMjQwLDgwTDI0MCw2NE0yNDAsMTc2TDI1NiwxNzZMMjU2LDE5MkwyNDAsMTkyTDI0MCwxNzZNMjQwLDQzMkwyNTYsNDMyTDI1Niw0NDhMMjQwLDQ0OEwyNDAsNDMyTTI1NiwxOTJMMjcyLDE5MkwyNzIsMjA4TDI1NiwyMDhMMjU2LDE5Mk0yNTYsMzIwTDI3MiwzMjBMMjcyLDMzNkwyNzIsMzUyTDI1NiwzNTJMMjU2LDMzNkwyNTYsMzIwTTI3Miw0OTZMMjcyLDUxMkwyODgsNTEyTDI4OCw0OTZMMjcyLDQ5Nk0yNzIsMTc2TDI4OCwxNzZMMjg4LDE5MkwyNzIsMTkyTDI3MiwxNzZNMjcyLDM1MkwyODgsMzUyTDI4OCwzNjhMMjcyLDM2OEwyNzIsMzUyTTI4OCwxOTJMMzA0LDE5MkwzMDQsMTc2TDMyMCwxNzZMMzIwLDE5MkwzMzYsMTkyTDM1MiwxOTJMMzUyLDIwOEwzNjgsMjA4TDM2OCwyMjRMMzY4LDI0MEwzNTIsMjQwTDM1MiwyMjRMMzM2LDIyNEwzMzYsMjA4TDMyMCwyMDhMMzIwLDIyNEwzMDQsMjI0TDMwNCwyMDhMMjg4LDIwOEwyODgsMTkyTTI4OCwzMzZMMzA0LDMzNkwzMDQsMzUyTDI4OCwzNTJMMjg4LDMzNk0yODgsMzY4TDMwNCwzNjhMMzA0LDM4NEwyODgsMzg0TDI4OCwzNjhNMjg4LDQwMEwzMDQsNDAwTDMwNCwzODRMMzIwLDM4NEwzMjAsMzY4TDMzNiwzNjhMMzM2LDM1MkwzMjAsMzUyTDMyMCwzMzZMMzM2LDMzNkwzNTIsMzM2TDM2OCwzMzZMMzY4LDM1MkwzNTIsMzUyTDM1MiwzNjhMMzUyLDM4NEwzMzYsMzg0TDMzNiw0MDBMMzM2LDQxNkwzMjAsNDE2TDMwNCw0MTZMMjg4LDQxNkwyODgsNDAwTTI4OCw0MzJMMzA0LDQzMkwzMjAsNDMyTDMzNiw0MzJMMzUyLDQzMkwzNjgsNDMyTDM4NCw0MzJMMzg0LDQxNkw0MDAsNDE2TDQwMCw0MDBMNDE2LDQwMEw0MTYsNDE2TDQzMiw0MTZMNDQ4LDQxNkw0NDgsNDMyTDQ2NCw0MzJMNDY0LDQ0OEw0ODAsNDQ4TDQ5Niw0NDhMNDk2LDQzMkw0ODAsNDMyTDQ4MCw0MTZMNDgwLDQwMEw0ODAsMzg0TDQ5NiwzODRMNTEyLDM4NEw1MTIsNDAwTDQ5Niw0MDBMNDk2LDQxNkw1MTIsNDE2TDUxMiw0MzJMNTI4LDQzMkw1MjgsNDQ4TDUyOCw0NjRMNTQ0LDQ2NEw1NjAsNDY0TDU3Niw0NjRMNTc2LDQ4MEw1NjAsNDgwTDU2MCw0OTZMNTc2LDQ5Nkw1NzYsNTEyTDU3Niw1MjhMNTc2LDU0NEw1NjAsNTQ0TDU2MCw1MjhMNTYwLDUxMkw1NDQsNTEyTDU0NCw1MjhMNTI4LDUyOEw1MTIsNTI4TDUxMiw1NDRMNDk2LDU0NEw0OTYsNTI4TDQ4MCw1MjhMNDgwLDU0NEw0NjQsNTQ0TDQ2NCw1NjBMNDQ4LDU2MEw0NDgsNTQ0TDQzMiw1NDRMNDE2LDU0NEw0MDAsNTQ0TDQwMCw1MjhMMzg0LDUyOEwzODQsNTEyTDQwMCw1MTJMNDAwLDQ5Nkw0MTYsNDk2TDQzMiw0OTZMNDMyLDUxMkw0NDgsNTEyTDQ0OCw0OTZMNDMyLDQ5Nkw0MzIsNDgwTDQxNiw0ODBMNDAwLDQ4MEw0MDAsNDY0TDQxNiw0NjRMNDMyLDQ2NEw0MzIsNDQ4TDQzMiw0MzJMNDE2LDQzMkw0MDAsNDMyTDQwMCw0NDhMMzg0LDQ0OEwzNjgsNDQ4TDM2OCw0NjRMMzg0LDQ2NEwzODQsNDgwTDM2OCw0ODBMMzY4LDQ5NkwzNTIsNDk2TDMzNiw0OTZMMzM2LDQ4MEwzNTIsNDgwTDM1Miw0NjRMMzM2LDQ2NEwzMjAsNDY0TDMyMCw0NDhMMzA0LDQ0OEwyODgsNDQ4TDI4OCw0MzJNMzA0LDM1MkwzMjAsMzUyTDMyMCwzNjhMMzA0LDM2OEwzMDQsMzUyTTMyMCwyODhMMzM2LDI4OEwzMzYsMzA0TDM1MiwzMDRMMzUyLDI4OEwzNjgsMjg4TDM4NCwyODhMMzg0LDMwNEwzNjgsMzA0TDM2OCwzMjBMMzUyLDMyMEwzMzYsMzIwTDMyMCwzMjBMMzIwLDMwNEwzMjAsMjg4TTMyMCw1MjhMMzM2LDUyOEwzMzYsNTEyTDM1Miw1MTJMMzY4LDUxMkwzNjgsNTI4TDM1Miw1MjhMMzUyLDU0NEwzNTIsNTYwTDM2OCw1NjBMMzY4LDU0NEwzODQsNTQ0TDQwMCw1NDRMNDAwLDU2MEw0MDAsNTc2TDQwMCw1OTJMMzg0LDU5MkwzNjgsNTkyTDM2OCw1NzZMMzUyLDU3NkwzMzYsNTc2TDMyMCw1NzZMMzIwLDU2MEwzMzYsNTYwTDMzNiw1NDRMMzIwLDU0NEwzMjAsNTI4TTMzNiwyNDBMMzUyLDI0MEwzNTIsMjU2TDMzNiwyNTZMMzM2LDI0ME0zNTIsOTZMMzY4LDk2TDM4NCw5NkwzODQsMTEyTDM2OCwxMTJMMzUyLDExMkwzNTIsOTZNMzUyLDE2MEwzNjgsMTYwTDM2OCwxNzZMMzUyLDE3NkwzNTIsMTYwTTM1MiwyNTZMMzY4LDI1NkwzODQsMjU2TDM4NCwyNzJMMzY4LDI3MkwzNTIsMjcyTDM1MiwyNTZNMzUyLDQwMEwzNjgsNDAwTDM4NCw0MDBMMzg0LDQxNkwzNjgsNDE2TDM1Miw0MTZMMzUyLDQwME0zNjgsNjRMMzg0LDY0TDQwMCw2NEw0MDAsODBMNDE2LDgwTDQxNiw2NEw0MzIsNjRMNDMyLDgwTDQzMiw5Nkw0MTYsOTZMNDE2LDExMkw0MzIsMTEyTDQzMiw5Nkw0NDgsOTZMNDQ4LDgwTDQ0OCw2NEw0NjQsNjRMNDY0LDgwTDQ2NCw5Nkw0NjQsMTEyTDQ2NCwxMjhMNDQ4LDEyOEw0NDgsMTQ0TDQzMiwxNDRMNDMyLDE2MEw0MzIsMTc2TDQxNiwxNzZMNDE2LDE2MEw0MDAsMTYwTDQwMCwxNDRMMzg0LDE0NEwzODQsMTI4TDQwMCwxMjhMNDAwLDExMkw0MDAsOTZMMzg0LDk2TDM4NCw4MEwzNjgsODBMMzY4LDY0TTM2OCwxNDRMMzg0LDE0NEwzODQsMTYwTDM2OCwxNjBMMzY4LDE0NE0zNjgsMTkyTDM4NCwxOTJMMzg0LDE3NkwzODQsMTYwTDQwMCwxNjBMNDAwLDE3Nkw0MDAsMTkyTDQwMCwyMDhMNDAwLDIyNEwzODQsMjI0TDM4NCwyMDhMMzY4LDIwOEwzNjgsMTkyTTM2OCwzNjhMMzg0LDM2OEw0MDAsMzY4TDQwMCwzODRMNDAwLDQwMEwzODQsNDAwTDM4NCwzODRMMzY4LDM4NEwzNjgsMzY4TTM4NCwyNDBMNDAwLDI0MEw0MDAsMjU2TDM4NCwyNTZMMzg0LDI0ME0zODQsMjcyTDQwMCwyNzJMNDAwLDI1Nkw0MTYsMjU2TDQzMiwyNTZMNDMyLDI3Mkw0NDgsMjcyTDQ0OCwyNTZMNDY0LDI1Nkw0NjQsMjcyTDQ4MCwyNzJMNDgwLDI4OEw0NjQsMjg4TDQ0OCwyODhMNDMyLDI4OEw0MTYsMjg4TDQwMCwyODhMMzg0LDI4OEwzODQsMjcyTTM4NCwzMzZMNDAwLDMzNkw0MDAsMzUyTDM4NCwzNTJMMzg0LDMzNk00MDAsMjI0TDQxNiwyMjRMNDE2LDI0MEw0MDAsMjQwTDQwMCwyMjRNNDE2LDE5Mkw0MzIsMTkyTDQzMiwxNzZMNDQ4LDE3Nkw0NDgsMTkyTDQ0OCwyMDhMNDQ4LDIyNEw0NDgsMjQwTDQzMiwyNDBMNDMyLDIyNEw0MzIsMjA4TDQxNiwyMDhMNDE2LDE5Mk00MTYsMzM2TDQzMiwzMzZMNDMyLDM1Mkw0NDgsMzUyTDQ0OCwzNjhMNDY0LDM2OEw0ODAsMzY4TDQ4MCwzODRMNDY0LDM4NEw0NDgsMzg0TDQzMiwzODRMNDE2LDM4NEw0MTYsMzY4TDQxNiwzNTJMNDE2LDMzNk00MTYsNTYwTDQzMiw1NjBMNDQ4LDU2MEw0NDgsNTc2TDQ2NCw1NzZMNDgwLDU3Nkw0ODAsNTkyTDQ2NCw1OTJMNDQ4LDU5Mkw0MzIsNTkyTDQzMiw1NzZMNDE2LDU3Nkw0MTYsNTYwTTQ0OCwxNDRMNDY0LDE0NEw0NjQsMTYwTDQ2NCwxNzZMNDQ4LDE3Nkw0NDgsMTYwTDQ0OCwxNDRNNDQ4LDMwNEw0NjQsMzA0TDQ2NCwzMjBMNDQ4LDMyMEw0NDgsMzA0TTQ0OCwzMzZMNDY0LDMzNkw0NjQsMzIwTDQ4MCwzMjBMNDgwLDMwNEw0OTYsMzA0TDQ5NiwzMjBMNDk2LDMzNkw0ODAsMzM2TDQ4MCwzNTJMNDY0LDM1Mkw0NDgsMzUyTDQ0OCwzMzZNNDQ4LDQwMEw0NjQsNDAwTDQ2NCw0MTZMNDQ4LDQxNkw0NDgsNDAwTTQ2NCw0NjRMNDY0LDQ4MEw0NjQsNDk2TDQ2NCw1MTJMNDgwLDUxMkw0OTYsNTEyTDUxMiw1MTJMNTEyLDQ5Nkw1MTIsNDgwTDUxMiw0NjRMNDk2LDQ2NEw0ODAsNDY0TDQ2NCw0NjRNNDY0LDIwOEw0ODAsMjA4TDQ4MCwyMjRMNDgwLDI0MEw0NjQsMjQwTDQ2NCwyMjRMNDY0LDIwOE00ODAsMjQwTDQ5NiwyNDBMNDk2LDIyNEw0OTYsMjA4TDUxMiwyMDhMNTI4LDIwOEw1MjgsMjI0TDUxMiwyMjRMNTEyLDI0MEw1MjgsMjQwTDUyOCwyNTZMNTI4LDI3Mkw1MTIsMjcyTDUxMiwyNTZMNDk2LDI1Nkw0OTYsMjcyTDQ4MCwyNzJMNDgwLDI1Nkw0ODAsMjQwTTQ4MCw0ODBMNDk2LDQ4MEw0OTYsNDk2TDQ4MCw0OTZMNDgwLDQ4ME00OTYsMzUyTDUxMiwzNTJMNTEyLDM2OEw0OTYsMzY4TDQ5NiwzNTJNNTEyLDI4OEw1MjgsMjg4TDUyOCwzMDRMNTI4LDMyMEw1NDQsMzIwTDU0NCwzMDRMNTYwLDMwNEw1NzYsMzA0TDU3NiwzMjBMNTYwLDMyMEw1NjAsMzM2TDU0NCwzMzZMNTQ0LDM1Mkw1NjAsMzUyTDU2MCwzNjhMNTYwLDM4NEw1NDQsMzg0TDU0NCw0MDBMNTI4LDQwMEw1MjgsMzg0TDUxMiwzODRMNTEyLDM2OEw1MjgsMzY4TDUyOCwzNTJMNTEyLDM1Mkw1MTIsMzM2TDUxMiwzMjBMNTEyLDMwNEw1MTIsMjg4TTUxMiw0MDBMNTI4LDQwMEw1MjgsNDE2TDUxMiw0MTZMNTEyLDQwME01MjgsMTkyTDU0NCwxOTJMNTYwLDE5Mkw1NjAsMjA4TDU2MCwyMjRMNTQ0LDIyNEw1NDQsMjA4TDUyOCwyMDhMNTI4LDE5Mk01NDQsMjQwTDU2MCwyNDBMNTYwLDI1Nkw1NDQsMjU2TDU0NCwyNDBNNTQ0LDI3Mkw1NjAsMjcyTDU2MCwyNTZMNTc2LDI1Nkw1NzYsMjQwTDU2MCwyNDBMNTYwLDIyNEw1NzYsMjI0TDU5MiwyMjRMNTkyLDI0MEw1OTIsMjU2TDU5MiwyNzJMNTc2LDI3Mkw1NzYsMjg4TDU2MCwyODhMNTQ0LDI4OEw1NDQsMjcyTTU0NCw0MTZMNTYwLDQxNkw1NjAsNDAwTDU2MCwzODRMNTc2LDM4NEw1NzYsNDAwTDU5Miw0MDBMNTkyLDQxNkw1OTIsNDMyTDU5Miw0NDhMNTkyLDQ2NEw1NzYsNDY0TDU3Niw0NDhMNTc2LDQzMkw1NjAsNDMyTDU2MCw0NDhMNTQ0LDQ0OEw1NDQsNDMyTDU0NCw0MTZNNTYwLDMzNkw1NzYsMzM2TDU5MiwzMzZMNTkyLDM1Mkw1OTIsMzY4TDU5MiwzODRMNTc2LDM4NEw1NzYsMzY4TDU3NiwzNTJMNTYwLDM1Mkw1NjAsMzM2WiIgLz4KPHBhdGggZD0iTTQuNzI1Myw5LjA2ODlDNi4xNzksOS4wNDM2IDYuNDE0OSw3LjYxNTQgNi40MTQ5LDYuNzY5QzYuNDE0OSw1LjUxNjMgNS43NzUsNS4wNzg4IDUsNUM0LjA0MjUsNS40MjQyIDMuMzQwMyw2LjE0NiAzLjI1NTUsNy4yNjA2QzMuMjQxNiw3LjQ0NDMgMy4yMzcsNy42ODk0IDMuMjUxNiw3Ljk3NTdDMy4yOTA2LDguNzM4MyAzLjg0OTMsOS4wODQzIDQuNzI1Myw5LjA2ODkgTSAxMi4yNDQ3IDEwLjgwNjggQyAxMS4yMDQ3IDEwLjgwNjggMTAuMTExOCAxMC4xNjczIDEwLjA2IDguOTcwNyBDIDguODc3NCAxMC4yMjIzIDcuMDUzOCAxMC44MTg2IDQuNzI1MyAxMC44MTg2IEMgMi4zNzY5IDEwLjgxODYgMS4zOTYgOS4yMTc1IDEuMzk2IDcuOTcwMyBDIDEuNDU1NCAzLjgxMjYgMS4zNjA1IDIuMjU1IDEuMzQxIDEuOTM1MyBDIDEuMzM5MyAxLjkwNyAxLjMzODEgMS44ODg0IDEuMzM3NyAxLjg3ODUgTCAxLjMzNzMgMS44Njc3IEMgMS4zMzEzIDEuNzA5NiAxLjMyMjQgMS40NzMzIDEuMTcyIDEuNDU3MiBDIDEuMDc4NiAxLjQ0NzIgMS4wMTgzIDEuNDc1NyAwLjkxMSAxLjYwOTQgQyAwLjc1IDEuODIzMyAwLjQyNSAxLjkwOCAwLjIyNzMgMS43OTM3IEMgLTAuMDExNiAxLjY1NTUgLTAuMDU2MiAxLjM1MDUgMC4wNjQ3IDEuMDY5NyBDIDAuNDAwMiAwLjMyMTIgMC45Mzc5IC0wLjAxIDEuNjYyNSAwLjAwMDMgQyAyLjkxNDYgMC4wMTgyIDMuMjczOCAwLjgzNTkgMy4yNzM4IDEuODU3NSBDIDMuMjczOCAxLjg1NzUgMy4yNDYgMy4zMjkyIDMuMjQ2IDQuMTU3OSBDIDMuNjg5IDMuNzk2OSA0LjMzOTcgMy40MDk4IDUuNDI2NiAzLjQwOTggQyA3LjY4OTkgMy40MDk4IDkuMTI2NyA2LjIxMTggNy42NTAzIDguODkyNSBDIDkuNTQyOCA4LjAxOTcgOS45Mzc4IDYuNTE2NCAxMC4wMTEyIDUuMDIzOCBMIDEwLjAwNDMgNC41MjAzIEMgMTAuMDA0MyAzLjk1NTIgMTAuMzY4OCAzLjQ3NjcgMTAuOTM2MSAzLjQ3NjcgQyAxMS41MDM0IDMuNDc2NyAxMS44ODAyIDMuOTg3NyAxMS44NiA0LjUyNzEgQyAxMS43OTE5IDYuMzQzOCAxMS43NjQ0IDcuNTM5NSAxMS43NjQ0IDguMTcyMiBDIDExLjc2NDQgOC41Mzg0IDExLjk2NDIgOS4wOTk2IDEyLjU1NTUgOS4wOTk2IEMgMTMuNzEzNCA5LjA5OTYgMTQuMDk0IDguMTkyMiAxNC4xODM4IDYuMDU5NSBDIDE0LjE4ODUgNS4yNjQyIDE0LjE5MjcgNC41OTk3IDE0LjE5MjcgNC41OTk3IEMgMTMuNjY3OSA0LjU5OTcgMTMuNDA5NCA0LjMyNCAxMy40MDk0IDMuOTc5NSBDIDEzLjQwOTQgMy42MzUgMTMuNjgzIDMuMzE2MyAxNC4xMzIxIDMuMzE2MyBDIDE0LjEzMjEgMy4zMTYzIDE0LjEzMyAyLjExODIgMTQuMTMzIDEuNjIyIEMgMTQuMTMzIDEuMDU2OSAxNC41NzE1IDAuNTg4MyAxNS4xMzg4IDAuNTg4MyBDIDE1LjcwNjIgMC41ODgzIDE2LjE1NjcgMS4wNTY5IDE2LjE1NjcgMS42MjIgQyAxNi4xNTY3IDEuODA5NSAxNi4xNDk1IDIuMDI4IDE2LjE0MTYgMi4yNjk1IEMgMTYuMTMxNSAyLjU3ODQgMTYuMTIwMSAyLjkyNDYgMTYuMTIxIDMuMjkwOSBMIDE2LjIwMzIgMy4yOTA1IEggMTYuMjAzMiBDIDE2LjM1NyAzLjI5IDE2LjcwNTEgMy4yODg4IDE3LjE2ODEgMy4yODM0IEMgMTcuNzE5OCAzLjI3NjkgMTcuOTQ0NSAzLjU4NTEgMTcuOTQ0NSAzLjk3MDkgQyAxNy45NDQ1IDQuMzU2NyAxNy42NDc1IDQuNjI2IDE3LjI2MDIgNC42Mjc2IEMgMTYuOTAxMiA0LjYyOTEgMTYuMTA4MyA0LjYyNDcgMTYuMTA4MyA0LjYyNDcgQyAxNi4wNzIzIDUuNzY3NCAxNi4wMzgyIDcuMTQ1MSAxNi4wMzgyIDguMjQ3NSBDIDE2LjAzODIgOC42NDUxIDE2LjMxMjYgOS4wOTk1IDE2Ljk3NjcgOS4wOTk1IEMgMTguMzE2MyA5LjA5OTUgMTguODE2NyA3LjkwOTIgMTguOTE3MyA1LjY0OTggQyAxOC45MDk1IDQuMDc2NiAxOC44OTA3IDMuMTY1MyAxOC44NzY1IDIuNDc4NSBWIDIuNDc4NSBDIDE4Ljg2NjYgMS45OTY5IDE4Ljg1OSAxLjYyNTggMTguODU5IDEuMjE0MyBDIDE4Ljg1OSAwLjY0OTMgMTkuMzI5NSAwLjE0NDIgMTkuODk2NyAwLjE0NDIgQyAyMC40NjQxIDAuMTQ0MiAyMC44ODI2IDAuNTk3NyAyMC44ODI2IDEuMTYyNyBDIDIwLjg4MjYgMS41OTggMjAuODY1MSAyLjEwNjkgMjAuODQxMyAyLjgwMDkgViAyLjgwMDkgViAyLjgwMSBDIDIwLjgwMSAzLjk3NDcgMjAuNzQyNSA1LjY3NzggMjAuNzE5NSA4LjQ1MDQgQyAyMC43MTY1IDguODE5NSAyMC44OTY3IDkuMDc5NSAyMS4zNzQ4IDkuMDc5NSBDIDIyLjY1MjQgOS4wNzk1IDIzLjAwNjYgNy42OTU1IDIzLjExOSA1Ljc2MjUgQyAyMy4xMTk3IDUuNjY5NSAyMy4xMjA1IDUuNTc4NSAyMy4xMjE0IDUuNDg5MSBMIDIzLjEyMTQgNS40ODg3IEMgMjMuMTIzMSA1LjMwNTQgMjMuMTI0NyA1LjEyODkgMjMuMTI0NyA0Ljk1NjEgQyAyMy4xMjQ3IDQuMzkxIDIzLjUwMTEgMy45MzM3IDI0LjA2ODYgMy45MzM3IEMgMjQuNjM1OSAzLjkzMzcgMjQuOTY5NCA0LjQwMjIgMjQuOTY5NCA0Ljk2NzMgQyAyNC45Njk0IDUuMzY5OCAyNC45NTYyIDUuNzQ2NCAyNC45NDI3IDYuMTM0OCBDIDI0LjkzMDcgNi40Nzc3IDI0LjkxODQgNi44Mjk5IDI0LjkxNDYgNy4yMTc2IEMgMjQuOTA0NyA4LjIxNTEgMjUuMjQ1NSA5LjA5MzggMjYuMDc1NiA5LjA5MTQgQyAyNi44NzI2IDkuMDg5MSAyNy43NDc5IDguNzUzNiAyNy43NjkxIDcuMDQ1IEMgMjcuNzc1MSA2LjU3MDEgMjcuNzY4MyA2LjIwNTMgMjcuNzYxNSA1LjgzNzEgViA1LjgzNyBWIDUuODM2OSBWIDUuODM2OCBDIDI3Ljc1NjQgNS41NjQyIDI3Ljc1MTMgNS4yODk3IDI3Ljc1MTMgNC45NjczIEMgMjcuNzUxMyA0LjQwMjIgMjguMTQ1MSAzLjkzMzcgMjguNzEyNSAzLjkzMzcgQyAyOS4yNzk1IDMuOTMzNyAyOS42NzM3IDQuNDAyMiAyOS42NzM3IDQuOTY3MyBDIDI5LjY3MzcgNS4zMDUxIDI5LjY2MTQgNS42NDE1IDI5LjY0NzcgNi4wMTQ1IFYgNi4wMTQ1IFYgNi4wMTQ2IFYgNi4wMTQ2IEMgMjkuNjMwNyA2LjQ3ODMgMjkuNjExNyA2Ljk5ODQgMjkuNjExNyA3LjY0NzcgQyAyOS42MTE3IDcuNjQ3NyAyOS41NzY5IDEwLjAxNDEgMjkuNjYgMTAuNTM3OCBDIDI5LjkyMDMgMTAuNDUxMiAzMC4yOTU4IDEwLjE5NjggMzAuNjkzNSA5LjU4MDIgQyAzMC45MzM3IDkuMjA4IDMxLjM5MjggOS4xMjgyIDMxLjY3NTggOS4yOTMgQyAzMi4wNjUzIDkuNTIgMzIuMDUxNCA5Ljk2MzUgMzEuOTA1OCAxMC4yODc1IEMgMzEuNTI5OCAxMS4xMjM5IDMxLjA0MDkgMTEuNjM1OCAyOS44MDQ3IDEyLjA1OTUgQyAyOS44MDg2IDEzLjQ3ODIgMjkuNzA5OCAxNS41NzEzIDI3LjA4NjggMTUuOTQ5NiBDIDI0Ljg0MDUgMTYuMjczNSAyMy44MjQ0IDE0Ljk3MDggMjMuODIxMSAxMy44NjIzIEMgMjMuODE1NyAxMi4xMTIgMjUuNTY0OSAxMS42MDIyIDI4LjA4OTcgMTAuOTY2NSBMIDI4LjAwODcgMTAuMDk5IEMgMjguMDA4NyAxMC4wOTkgMjcuNDQ2NCAxMC44MzY0IDI2LjAyMTUgMTAuODAwOCBDIDI0LjkyMjMgMTAuNzczMyAyNC4xNjYzIDEwLjI1NDMgMjMuNzA3NyA5LjUyMTMgQyAyMy4xNzg3IDEwLjM5MDEgMjIuMzQ5NSAxMC44MTA1IDIxLjEwMDQgMTAuODEwNSBDIDIwLjI3NzUgMTAuODEwNSAxOS40OTM0IDEwLjM3NTggMTkuMTA1MSA5Ljc0NTcgQyAxOC41MzI1IDEwLjQzMDggMTcuNzMzOSAxMC44MDE1IDE2LjY2MDcgMTAuODAxNSBDIDE1LjcyNTYgMTAuODAxNSAxNS4wMzQ2IDEwLjQ3ODYgMTQuNjIwOSA5Ljk3NDYgQyAxNC4wODcgMTAuNTcxMiAxMy4zMTggMTAuODA2OCAxMi4yNDQ3IDEwLjgwNjggWiBNIDI4LjI1NDggMTIuMzYzIEMgMjYuOTc4NiAxMi42Mzg1IDI1LjM3OTggMTMuMDQwNyAyNS4zOTgzIDEzLjgyNjYgQyAyNS40MTU4IDE0LjU2MzYgMjYuMTc2NyAxNC42OTc3IDI2LjgxMTEgMTQuNTY2NiBDIDI4LjEyODYgMTQuMjk0MyAyOC4yODE2IDEzLjUwMTUgMjguMjU0OCAxMi4zNjMgWiBNIDExLjk3MDQgMS42MjQ5IEMgMTEuOTcwNCAxLjA1NDQgMTEuNTA3MyAwLjU5MzIgMTAuOTM0NyAwLjU5MzIgQyAxMC4zNjE5IDAuNTkzMiA5Ljg5ODkgMS4wNTQ0IDkuODk4OSAxLjYyNDkgQyA5Ljg5ODkgMi4xOTUzIDEwLjM2MTkgMi42NTY2IDEwLjkzNDcgMi42NTY2IEMgMTEuNTA3MyAyLjY1NjYgMTEuOTcwNCAyLjE5NTMgMTEuOTcwNCAxLjYyNDkgWiIgZmlsbD0nIzAwMDAwMCcgdHJhbnNmb3JtPSd0cmFuc2xhdGUoNTIwLjAwMDAwMCwgNTU2LjAwMDAwMCkgc2NhbGUoMi4yNTAwMDAsIDIuMjUwMDAwKScgLz4KPC9nPgo8ZyBpZD0nY29ybmVycy1vdXRlci0xJyBzdHlsZT0nZmlsbDojMDAwMDAwJyA+CjxwYXRoIGQ9Ik02NCw2NEw4MCw2NEw5Niw2NEwxMTIsNjRMMTI4LDY0TDE0NCw2NEwxNjAsNjRMMTc2LDY0TDE3Niw4MEwxNzYsOTZMMTc2LDExMkwxNzYsMTI4TDE3NiwxNDRMMTc2LDE2MEwxNzYsMTc2TDE2MCwxNzZMMTQ0LDE3NkwxMjgsMTc2TDExMiwxNzZMOTYsMTc2TDgwLDE3Nkw2NCwxNzZMNjQsMTYwTDY0LDE0NEw2NCwxMjhMNjQsMTEyTDY0LDk2TDY0LDgwTDY0LDY0TTgwLDgwTDgwLDk2TDgwLDExMkw4MCwxMjhMODAsMTQ0TDgwLDE2MEw5NiwxNjBMMTEyLDE2MEwxMjgsMTYwTDE0NCwxNjBMMTYwLDE2MEwxNjAsMTQ0TDE2MCwxMjhMMTYwLDExMkwxNjAsOTZMMTYwLDgwTDE0NCw4MEwxMjgsODBMMTEyLDgwTDk2LDgwTDgwLDgwWiIgLz4KPC9nPgo8ZyBpZD0nY29ybmVycy1pbm5lci0xJyBzdHlsZT0nZmlsbDojMDAwMDAwJyA+CjxwYXRoIGQ9Ik05Niw5NkwxMTIsOTZMMTI4LDk2TDE0NCw5NkwxNDQsMTEyTDE0NCwxMjhMMTQ0LDE0NEwxMjgsMTQ0TDExMiwxNDRMOTYsMTQ0TDk2LDEyOEw5NiwxMTJMOTYsOTZaIiAvPgo8L2c+CjxnIGlkPSdjb3JuZXJzLW91dGVyLTInIHN0eWxlPSdmaWxsOiMwMDAwMDAnID4KPHBhdGggZD0iTTQ4MCw2NEw0OTYsNjRMNTEyLDY0TDUyOCw2NEw1NDQsNjRMNTYwLDY0TDU3Niw2NEw1OTIsNjRMNTkyLDgwTDU5Miw5Nkw1OTIsMTEyTDU5MiwxMjhMNTkyLDE0NEw1OTIsMTYwTDU5MiwxNzZMNTc2LDE3Nkw1NjAsMTc2TDU0NCwxNzZMNTI4LDE3Nkw1MTIsMTc2TDQ5NiwxNzZMNDgwLDE3Nkw0ODAsMTYwTDQ4MCwxNDRMNDgwLDEyOEw0ODAsMTEyTDQ4MCw5Nkw0ODAsODBMNDgwLDY0TTQ5Niw4MEw0OTYsOTZMNDk2LDExMkw0OTYsMTI4TDQ5NiwxNDRMNDk2LDE2MEw1MTIsMTYwTDUyOCwxNjBMNTQ0LDE2MEw1NjAsMTYwTDU3NiwxNjBMNTc2LDE0NEw1NzYsMTI4TDU3NiwxMTJMNTc2LDk2TDU3Niw4MEw1NjAsODBMNTQ0LDgwTDUyOCw4MEw1MTIsODBMNDk2LDgwWiIgLz4KPC9nPgo8ZyBpZD0nY29ybmVycy1pbm5lci0yJyBzdHlsZT0nZmlsbDojMDAwMDAwJyA+CjxwYXRoIGQ9Ik01MTIsOTZMNTI4LDk2TDU0NCw5Nkw1NjAsOTZMNTYwLDExMkw1NjAsMTI4TDU2MCwxNDRMNTQ0LDE0NEw1MjgsMTQ0TDUxMiwxNDRMNTEyLDEyOEw1MTIsMTEyTDUxMiw5NloiIC8+CjwvZz4KPGcgaWQ9J2Nvcm5lcnMtb3V0ZXItMycgc3R5bGU9J2ZpbGw6IzAwMDAwMCcgPgo8cGF0aCBkPSJNNjQsNDgwTDgwLDQ4MEw5Niw0ODBMMTEyLDQ4MEwxMjgsNDgwTDE0NCw0ODBMMTYwLDQ4MEwxNzYsNDgwTDE3Niw0OTZMMTc2LDUxMkwxNzYsNTI4TDE3Niw1NDRMMTc2LDU2MEwxNzYsNTc2TDE3Niw1OTJMMTYwLDU5MkwxNDQsNTkyTDEyOCw1OTJMMTEyLDU5Mkw5Niw1OTJMODAsNTkyTDY0LDU5Mkw2NCw1NzZMNjQsNTYwTDY0LDU0NEw2NCw1MjhMNjQsNTEyTDY0LDQ5Nkw2NCw0ODBNODAsNDk2TDgwLDUxMkw4MCw1MjhMODAsNTQ0TDgwLDU2MEw4MCw1NzZMOTYsNTc2TDExMiw1NzZMMTI4LDU3NkwxNDQsNTc2TDE2MCw1NzZMMTYwLDU2MEwxNjAsNTQ0TDE2MCw1MjhMMTYwLDUxMkwxNjAsNDk2TDE0NCw0OTZMMTI4LDQ5NkwxMTIsNDk2TDk2LDQ5Nkw4MCw0OTZaIiAvPgo8L2c+CjxnIGlkPSdjb3JuZXJzLWlubmVyLTMnIHN0eWxlPSdmaWxsOiMwMDAwMDAnID4KPHBhdGggZD0iTTk2LDUxMkwxMTIsNTEyTDEyOCw1MTJMMTQ0LDUxMkwxNDQsNTI4TDE0NCw1NDRMMTQ0LDU2MEwxMjgsNTYwTDExMiw1NjBMOTYsNTYwTDk2LDU0NEw5Niw1MjhMOTYsNTEyWiIgLz4KPC9nPgo8L3N2Zz4K">

</center>

<!--

Hi everyone, my name is Alexey Grigorovich and today I've been asked by the
powers that be to conduct a quick workshop on how the AI tools can potentially
help you with your work.

-->

---

# Agenda

- Introduction
- Understanding of AI Tools and Technologies
- Practical Demonstrations
- Closing Remarks and Resources
- Q&amp;A Session

<!--
- Welcome, my name is Alexey Grigorovich and I will be your host today for the AI in Software Development workshop.
- The goal of this talk is to provide you with an understanding of AI tools and technologies, practical demonstrations, addressing challenges and mitigating risks, the future of AI in software development, and a Q&amp;A session.
-->

---

# Introduction to Modern AI in Software Development

A brief timeline of recent AI advances:

<v-clicks>

- AlexNet, a GPU-accelerated image classification neural network, 2012
- Transformers paper by Vaswani et al. in 2017, kicking off the transformer revolution
- GPT-2 published by OpenAI in 2019
- GitHub Copilot beta released by GitHub in 2021
- GPT-3.5 published by OpenAI in 2022, marking first practical use of AI in software development
- ChatGPT published by OpenAI in 2023, enabling conversational AI for the people
- ChatGPT 4.0 released by OpenAI in 2023, increasing the capabilities of conversational AI
- Google Gemini released by Google in late 2023

</v-clicks>

---

# Introduction to Modern AI in Software Development

Obligatory XKCD reference: this comic was published in 2014, mere 10 years ago:

<center>

<img src="https://imgs.xkcd.com/comics/tasks.png" style="height:380px"/>

</center>

---

# Introduction to Modern AI in Software Development

Evolution in AI tools in software development

<v-clicks>

- Code completion and generation (e.g. GitHub Copilot, AWS Q Developer, Cursor Copilot)
- Code suggestions and refactoring (e.g. GitHub Copilot Chat)
- Code review (AWS CodeGuru)
- Code search and completions (SourceGraph Cody)

</v-clicks>

---

# Practical Demonstrations

---

# Prerequisites

For the workshop, we recommend having the following tools and accounts ready:

- [Google Gemini](https://gemini.google.com) account
- Optionally, [OpenAI ChatGPT](https://chat.openai.com) account
- Code editor and language runtimes, or
- an online playground (such as repl.it)

We'll be using examples in Python, Javascript and some other languages throughout the workshop; feel free to follow along or just watch.

---

# Task 1: Basic Code Generation

Let's start with something simple. We'll ask the AI to generate a simple "Hello, World!" program in Python:

<v-click>

<div class="entry user">

```md
Write a Python program that prints 'Hello, World!' to the console.
```

</div>

</v-click>

<v-click>

<div class="entry ai">

````md
Here's a Python program that prints "Hello, World!" to the console:

~~~python
print("Hello, World!")
~~~

This program uses the `print` function, which is a built-in function in Python
that outputs the given message to the console. The message you want to print is
enclosed in quotation marks.
````
</div>

</v-click>

<v-click>

This is not terribly sophisticated, is it? Why don't we try something more exotic, shall we?

</v-click>

<!--

Prompt: Ask the AI to generate a simple "Hello, World!" program in Python.

Objective: Familiarize with basic command prompts for code generation.

Expected Output from AI: A simple Python script.

Evaluation Criteria: Correct syntax, successful execution printing "Hello, World!".

Note: see how modern models have been trained to follow instructions and generate code snippets based on the input prompt.

-->

---

# Task 1: Basic Code Generation

Let's check if the AI can generate a "Hello, World" in an esoteric language like Brainfuck:

<v-click>

<div class="entry user">

```md
Write a Brainfuck program that prints 'Hello, World!' to the console.
```

</div>

</v-click>

<v-click>

<div class="entry ai">

```md {all}{maxHeight:'300px'}
Brainfuck is an esoteric programming language designed to challenge and amuse
programmers, and not for practical use. Its simplicity in the design,
consisting of only eight commands, belies the complexity of the programs it
can execute. Writing "Hello, World!" in Brainfuck involves manipulating the
memory tape to store the ASCII values of the characters in "Hello, World!" and
then printing them. Here's a Brainfuck program that does just that:

~~~text
>+++++++++[<++++++++>-]<.>+++++++[<++++>-]<+.+++++++..+++.>>>++++++++[<++++>-]
<.>>>++++++++++[<+++++++++>-]<---.<<<<.+++.------.--------.>>+.>++++++++++.
~~~

Each command in Brainfuck does the following:

- `>` increment the data pointer (to point to the next cell to the right).
- `<` decrement the data pointer (to point to the next cell to the left).
- `+` increment (increase by one) the byte at the data pointer.
- `-` decrement (decrease by one) the byte at the data pointer.
- `.` output the byte at the data pointer.
- `,` accept one byte of input, storing its value in the byte at the data pointer.
- `[` if the byte at the data pointer is zero, then instead of moving the
  instruction pointer forward to the next command, jump it forward to the
command after the matching `]` command.
- `]` if the byte at the data pointer is nonzero, then instead of moving the 
  instruction pointer forward to the next command, jump it back to the command
  after the matching `[` command.

This program initializes cells with the ASCII values corresponding to the
letters in "Hello, World!", and then prints them one by one.
```

</div>

</v-click>

---

# Task 1: Basic Code Generation

I happen to have a Brainfuck compiler on my machine, which I'm going to use to test that code. You could also use an online interpreter such as (https://me.pocke.me/brainfuck-playground/):

```bash
$ cat >hello.bf <<EOF
>+++++++++[<++++++++>-]<.>+++++++[<++++>-]<+.+++++++..+++.>>>++++++++[<++++>-]
<.>>>++++++++++[<+++++++++>-]<---.<<<<.+++.------.--------.>>+.>++++++++++.
EOF
$ bfc hello.bf
$ ./hello
Hello World!
```

---

# Task 1: Basic Code Generation

Another example: z80 assembly language

<v-click>

<div class="entry user">

```md
Write a program in z80 assembly language that prints "Hello, World" to the
standard output, assuming MSX-2 machine architecture
```

</div>

</v-click>

<v-click>

<div class="entry ai">

```asm {all}{maxHeight:'200px'}
        org     100h            ; Origin address, standard for MSX DOS .COM programs

start:
        ld      hl, msg         ; Load address of the message into HL
nextchar:
        ld      a, (hl)         ; Load the character pointed by HL into A
        or      a               ; Logical OR A with itself to check if it's the null terminator (0)
        jp      z, finished     ; If zero, we've hit the end of the string, jump to finished
        call    0A2h            ; Call CHPUT routine of MSX BIOS to print > aracter in A
        inc     hl              ; Move to the next character in the string
        jp      nextchar        ; Jump back to print the next character

finished:
        ret                     ; Return to MSX-DOS

msg:    db      'Hello, World!', 0 ; Null-terminated string

        end     start           ; End of the program, with start as entry int
```

</div>

</v-click>

---

# Task 2: Understanding Code and Fixing Bugs

The goal is use AI to idenitfy and fix bugs in a given code snippet.

Code snippet:

````md magic-move
```python
def calculate_area(radius):
    pi = 3.14
    area = pi * radius ^ 2
    return area
```

```python
def calculate_area(radius):
    pi = 3.14
    area = pi * radius ^ 2  # Error: Incorrect exponentiation operator
    return area
```
````

<v-click>

This snippet has subtle bug in the calculation of the area: the code uses the `^` operator, which is the bitwise XOR operator, instead of the `**` operator, which is the exponentiation operator. Let's see if AI can spot this!

</v-click>

---

# Task 2: Understanding Code and fixing bugs

<v-click>

<div class="entry user">

```md {all}{maxHeight:'100px'}
Identify and correct the error in this Python function.

~~~python
def calculate_area(radius):
  pi = 3.14
  area = pi * radius ^ 2
  return area
~~~
```

</div>

</v-click>

<v-click> 

<div class="entry ai">

```md {all}{maxHeight:'260px'}
The error in the function is the way the exponent is calculated. In Python, the
caret (`^`) symbol is used for the bitwise XOR operator, not exponentiation.
 
Here's the corrected code:
 
~~~python
def calculate_area(radius):
  pi = 3.14
  area = pi * radius ** 2  # Use ** for exponentiation
  return area
~~~
 
Use code with caution.  This code uses the correct operator `**` for
exponentiation. It calculates the area of the circle by multiplying `pi` by the
`radius` squared.
```

</div>

</v-click>

---

# Task 2: Understanding Code and Fixing Bugs

OK, that was easy. What about performance issues?

```java
import java.util.Map;

public class ContentUtils {
    private static final String TEMPLATE_DELIMITERS = "%%";

    /**
      * Instantiates the given template, replacing placeholders with the corresponding values.
      */
    public static String instantiateTemplate(String template, Map<String, String> values) {
        String result = template;
        if (result != null && values != null) {
            for (var item : values.entrySet()) {
                String attribute = TEMPLATE_DELIMITERS + item.getKey() + TEMPLATE_DELIMITERS;
                result = result.replace(attribute, item.getValue());
            }
        }
        return result;
    }
}
```

Quick poll: can you spot any issues with the following code?

---

# Task 2: Understanding Code and Fixing Bugs

<v-click>

<div class="entry user">

```md {all}{maxHeight:'100px'}
Provide code review comments and code suggestions for the following code:

~~~java
import java.util.Map;

public class ContentUtils {
  private static final String TEMPLATE_DELIMITERS = "%%";

  /**
   * Instantiates the given template, replacing placeholders with the corresponding values
   */
  public static String instantiateTemplate(String template, Map<String, String> values) {
    String result = template;
    if (result != null && values != null) {
      for (var item : values.entrySet()) {
        String attribute = TEMPLATE_DELIMITERS + item.getKey() + TEMPLATE_DELIMITERS;
        result = result.replace(attribute, item.getValue());
      }
    }
    return result;
  }
}
~~~

```

</div>

</v-click>

<v-click>

<div class="entry ai">

```md {all}{maxHeight:'260px'}
Sure, here are some code review comments and suggestions for the provided Java code:

**Comments:**

* **Clarity:** The code is well-formatted and easy to read. The variable names
  are descriptive, and the comments clearly explain the purpose of the
  function.
* **Efficiency:** The code could be slightly more efficient by using a
  StringBuilder instead of repeated string concatenation within the loop.

**Suggestions:**

* **StringBuilder:** Consider using a `StringBuilder` to improve the efficiency
  of the `replace` operation within the loop. Here's how the code can be
  modified:

~~~java
public static String instantiateTemplate(String template, Map<String, String> values) {
  if (template == null || values == null) {
    return template; // Handle null cases gracefully
  }
  StringBuilder result = new StringBuilder(template);
  for (var item : values.entrySet()) {
    String attribute = TEMPLATE_DELIMITERS + item.getKey() + TEMPLATE_DELIMITERS;
    int index = result.indexOf(attribute);
    while (index != -1) {
      result.replace(index, index + attribute.length(), item.getValue());
      index = result.indexOf(attribute, index + item.getValue().length());
    }
  }
  return result.toString();
}
~~~

* **Null Handling:** The current code doesn't handle null cases for `template`
  and `values`. It would be better to handle these cases explicitly and
  potentially return an empty string or throw an exception depending on the
  desired behavior.
* **Error Handling:** The code assumes that the placeholders (`attribute`) will
  always exist in the template. Consider adding checks to handle cases where a
  placeholder might be missing in the template string.

**Additional Notes:**

* The code uses `var` for iterating through the map entries. This requires Java
  10 or above. If compatibility with older versions is needed, you can use the
  traditional `Map.Entry<String, String>` type.

I hope these comments and suggestions are helpful!
```

</div>

</v-click>

---

# Task 2: Understanding Code and Fixing Bugs

When prompted to focus on performance of processing larger templates with lots of parameters, ChatGPT arrived at a single-pass version:

<div class="entry user">

```md
Can you suggest performance improvements assuming large templates and large
number of placeholders?
```

</div>

<v-click>

<div class="entry ai">

```md {all}{maxHeight:'260px'}
[... skipped ...]

** Performance-Optimized Code Example **

Here’s how you might implement a more performance-optimized version using
StringBuilder and a single-pass token parsing strategy:

~~~java
import java.util.Map;

public class ContentUtils {
  private static final String TEMPLATE_DELIMITER_START = "%%";
  private static final String TEMPLATE_DELIMITER_END = "%%";

  /**
   * Instantiates the given template, replacing placeholders enclosed by %% with the corresponding values.
   * This method is optimized for large templates and a large number of placeholders.
   *
   * @param template The template string with placeholders.
   * @param values A map containing placeholder values.
   * @return A string with placeholders replaced by corresponding map values.
   * @throws IllegalArgumentException if template or values is null.
   */
  public static String instantiateTemplate(String template, Map<String, String> values) {
    if (template == null || values == null) {
      throw new IllegalArgumentException("Template and values must not be null");
    }

    StringBuilder result = new StringBuilder();
    int lastIndex = 0;
    int startIndex = template.indexOf(TEMPLATE_DELIMITER_START);

    while (startIndex != -1) {
      // Copy everything up to the start of the placeholder
      result.append(template, lastIndex, startIndex);

      int endIndex = template.indexOf(TEMPLATE_DELIMITER_END, startIndex + TEMPLATE_DELIMITER_START.length());
      if (endIndex != -1) {
        String key = template.substring(startIndex + TEMPLATE_DELIMITER_START.length(), endIndex);
        // Replace the placeholder with its value from the map, defaulting to the placeholder itself if not found
        result.append(values.getOrDefault(key, TEMPLATE_DELIMITER_START + key + TEMPLATE_DELIMITER_END));

        lastIndex = endIndex + TEMPLATE_DELIMITER_END.length();
      } else {
        // No closing delimiter found, append the rest of the template
        result.append(template.substring(startIndex));
        break;
      }

      startIndex = template.indexOf(TEMPLATE_DELIMITER_START, lastIndex);
    }

    // Append any remaining part of the template
    if (lastIndex < template.length()) {
      result.append(template.substring(lastIndex));
    }

    return result.toString();
  }
}
~~~
```

</div>

</v-click>

---

# Task 2: Understanding Code and Fixing Bugs

Performance Results:

```
Original version:               4.321083333
Gemini initial version:         48.510457833
ChatGPT initial version:        4.232012875
ChatGPT4 optimized version:     6.74222875
```

Notes:
- Amuzingly, the original version turned out to be more performant than the "optimized" one on the tests that I've ran
    - I'm assuming that the `String.replace` built-in is optimized extremely well compared to other variants;
- GPT4 was able to restructure the loop to arrive at a single-pass variant,
  although it still under-performed the naive implementation;
- Gemini's optimized variant (not listed here) failed to compile, but your mileage may vary.

---

# Task 2: Understanding Code and Fixing Bugs

Lessons:
- Both GPT4 and Bard were able to spot the potential inefficiencies and suggest funcitonally equivalent improvements
- You should always validate the changes to see if they are actually improvements
- Thankfully, AI could help with testing as well!

---

# Task 3: Refactoring Code

The goal here is to improve code readability and performance based on AI suggestions. The following code snippet has a couple of issues with readability and maintainability, let's see if AI can fix those:

```python {all}{maxHeight:'350px'}
# file: process_data.py
def process_data():
    # Simulated data fetch
    raw_data = "name:John Doe,age:29;name:Jane Smith,age:34"
    
    # Processing data
    entries = raw_data.split(";")
    for entry in entries:
        details = entry.split(",")
        name = details[0].split(":")[1]
        age = details[1].split(":")[1]
        
        # Output generation
        print(f"Name: {name}, Age: {age}")

if __name__ == "__main__":
    process_data()
```

--- 

# Task 3: Refactoring Code


<v-click>

<div class="entry user">

```md {all}{maxHeight:'100px'}
Refactor this python program for better readability and modularity:

~~~python
def process_data():
    # Simulated data fetch
    raw_data = "name:John Doe,age:29;name:Jane Smith,age:34"
    
    # Processing data
    entries = raw_data.split(";")
    for entry in entries:
        details = entry.split(",")
        name = details[0].split(":")[1]
        age = details[1].split(":")[1]
        
        # Output generation
        print(f"Name: {name}, Age: {age}")

if __name__ == "__main__":
    process_data()
~~~
```

</div>

</v-click>


<v-click>

<div class="entry ai">

```md {all}{maxHeight:'260px'}
The original program can be refactored to improve readability and modularity by
separating concerns into different functions. This makes the code easier to
maintain and test. Here's how you can refactor it:

1. **Separate data fetching**: Isolate the data fetching logic into its own
   function. This allows for easier modification of the data source in the
   future.
2. **Parse entries separately**: Create a function to parse individual entries
   from the raw data. This enhances modularity and readability.
3. **Print results in a dedicated function**: This improves the separation of
   the output logic from data processing.

Here's the refactored version of the program:

~~~~python
def fetch_data():
    """Simulate fetching data from a source."""
    return "name:John Doe,age:29;name:Jane Smith,age:34"

def parse_entry(entry):
    """Parse a single entry into a dictionary."""
    details = entry.split(",")
    name = details[0].split(":")[1]
    age = details[1].split(":")[1]
    return {'name': name, 'age': age}

def print_person(person):
    """Print information about a person."""
    print(f"Name: {person['name']}, Age: {person['age']}")

def process_data():
    raw_data = fetch_data()
    entries = raw_data.split(";")
    for entry in entries:
        person = parse_entry(entry)
        print_person(person)

if __name__ == "__main__":
    process_data()
~~~~

### Explanation
- **fetch_data()**: Returns the raw data string. This can be modified to fetch
  data from a database, a file, or an API.
- **parse_entry(entry)**: Takes a single entry from the raw data and returns a
  dictionary with parsed 'name' and 'age'. This makes it easier to adapt if the
  data format changes or if more fields are added.
- **print_person(person)**: Accepts a dictionary representing a person and
  prints their details. This separates the presentation of data from its
  processing, making it easier to change the output format or medium (like
  writing to a file or a web page instead of printing to the console).
- **process_data()**: Orchestrates the fetching, parsing, and printing of data,
  adhering to a single-responsibility principle for each function.
```

</div>

</v-click>

---

# Task 4: Writing Unit Tests

Objective: Generate unit tests for exixting functions. Assume that we have the following React component:

```js {all}{maxHeight:'350px'}
import React, { useState } from 'react';
 
function ClickCounter() {
  const [count, setCount] = useState(0);
 
  const incrementCount = () => {
    setCount(count + 1);
  };
 
  return (
    <div>
      <p>You clicked {count} times</p>
      <button onClick={incrementCount}>Click me</button>
    </div>
  );
}
 
export default ClickCounter;
```

Let's generate some tests for this component using AI.

---

# Task 4: Writing Unit Tests


<v-click>

<div class="entry user">

```md {all}{maxHeight:'100px'}
Generate unit tests for the add function in JavaScript.
~~~js

import React, { useState } from 'react';
 
function ClickCounter() {
  const [count, setCount] = useState(0);
 
  const incrementCount = () => {
    setCount(count + 1);
  };
 
  return (
    <div>
      <p>You clicked {count} times</p>
      <button onClick={incrementCount}>Click me</button>
    </div>
  );
}
 
export default ClickCounter;
~~~
```

</div>

</v-click>


<v-click>

<div class="entry ai">

```md {all}{maxHeight:'260px'}
To generate unit tests for a component like `ClickCounter` in React, you'd
typically want to focus on testing its functionality, ensuring that the
component behaves as expected under different conditions. Since the primary
functionality of `ClickCounter` is to increment a count and display it, your
tests should cover:

1. Verifying that the count is initially set to `0`.
2. Ensuring that clicking the button increments the count appropriately.
3. (Optionally) Checking that the component renders correctly (snapshot testing).

Here's how you can write tests for `ClickCounter` using `React Testing Library`
and `Jest`. This assumes you're familiar with these tools and have them set up
in your project. If not, you might need to add them to your project first.

~~~javascript
import React from 'react';
import { render, fireEvent, screen } from '@testing-library/react';
import '@testing-library/jest-dom';
import ClickCounter from './ClickCounter'; // Adjust the import path as needed

describe('ClickCounter', () => {
  test('initially displays 0 clicks', () => {
    render(<ClickCounter />);
    expect(screen.getByText(/you clicked 0 times/i)).toBeInTheDocument();
  });

  test('increments count on button click', () => {
    render(<ClickCounter />);
    const button = screen.getByRole('button', { name: /click me/i });
    fireEvent.click(button);
    expect(screen.getByText(/you clicked 1 times/i)).toBeInTheDocument();
  });

  // Optional: Snapshot testing
  test('matches snapshot', () => {
    const { asFragment } = render(<ClickCounter />);
    expect(asFragment()).toMatchSnapshot();
  });
});
~~~

### Explanation:

- **Test 1 ("initially displays 0 clicks")**: This test checks if the component
  correctly displays that 0 clicks have occurred when it's first rendered.
- **Test 2 ("increments count on button click")**: This tests the functionality
  of the button within the component. It simulates a button click and then
checks if the text displaying the number of clicks is updated correctly.
- **Test 3 ("matches snapshot")**: Snapshot testing can be helpful to ensure
  your UI does not change unexpectedly. This test takes a "snapshot" of the
`ClickCounter` component and compares it against a reference snapshot file. If
the snapshot differs from the reference, the test will fail. This is optional
and can be useful for components with more complex rendering.

Remember, for snapshot testing to work, you'll need to have Jest configured to
handle snapshots, and you'll need to accept the initial snapshot the first time
you run the tests.
```

</div>

</v-click>

<!-- 

Note: Gemini has to be prompted multiple times to arrive at a solution
-->

---

# Intermission

## So, how does this work?

At the core of each AI assistant lies a large language model that predicts most
likely next token (word) given the previous words. There's a limited window of
how many takes the mdoel can look back to.

When you chat with the language model, it seeds the context with the past
conversation and your latest prompt, and then goes on generating the most
likely word, one word after another.

---

# Intermission

Here's an example of how that could work:
````md magic-move
```md
To date, the cleverest thinker of all time was [...]
```
```md
To date, the cleverest thinker of all time was undoubtedly [...]
```
```md
To date, the cleverest thinker of all time was undoubtedly Einsten, [...]
```
```md
To date, the cleverest thinker of all time was undoubtedly Einsten, for [...]
```
```md
To date, the cleverest thinker of all time was undoubtedly Einsten, for his [...]
```
```md
To date, the cleverest thinker of all time was undoubtedly Einsten, for his 
theories[...]
```
```md
To date, the cleverest thinker of all time was undoubtedly Einsten, for his 
theories of Relativity[...]
```
```md
To date, the cleverest thinker of all time was undoubtedly Einsten, for his 
theories of Relativity, which completely revolutionized our understanding [...]
```
```md
To date, the cleverest thinker of all time was undoubtedly Einsten, for his 
theories of Relativity, which completely revolutionized our understanding
of the physical world and laid the groundworks for modern physics. [...]
```
```md
To date, the cleverest thinker of all time was undoubtedly Einsten, for his 
theories of Relativity, which completely revolutionized our understanding 
of the physical world and laid the groundworks for modern physics. <endoftext>
```
````
---

# Intermission

## Key takeaways

- All information specific to your problem has to be in your context
    - That includes previous prompts _and responses_
- Any information outside of the context window is "lost"
- The size of the AI assistant's context window is extremely important as it
  determines the maximum size of the problem you're trying to solve

---

# Intermission

Some numbers:
- ChatGPT-3.5 -- 2048 tokens
- ChatGPT-4 -- 8k tokens
- Gemini -- 32k tokens
- Gemini Pro -- "up to millions"
- Anthropic Claude 3 Opus -- 200k tokens, can be extended to 1 million

<!--
With that said, let's move on to the next task
-->

---

# Task 5: Generating terraform code

### Objective
Generate Terraform configuration files to deploy a basic three-tier web application architecture in AWS, consisting of the following components:

- A Virtual Private Cloud (VPC)
- Subnets (Public and Private)
- An Internet Gateway
- Route Tables
- Security Groups
- An EC2 instance for the web server
- An RDS instance for the database

---

# Task 5: Generating terraform code

<v-click>

<div class="entry user">

```md {all}{maxHeight:'150px'}
As an infrastructure engineer, I need to deploy a secure, scalable three-tier
web application in AWS. The architecture should include a VPC, public and
private subnets, an Internet Gateway, route tables linking the subnets to the
internet, security groups to restrict access appropriately, an EC2 instance to
host the web server in a public subnet, and an RDS instance for the database in
a private subnet.
```

</div>

</v-click>

<v-click>

<div class="entry ai">

```md {all}{maxHeight:'280px'}
Deploying a secure and scalable three-tier web application in AWS requires
careful consideration of each component and its configuration to ensure both
security and functionality. Below, I'll outline a step-by-step guide to setting
up this architecture.

### 1. Create a Virtual Private Cloud (VPC)
- **Create a VPC** in AWS. This will act as a virtual network dedicated to your
  AWS account.
- **Specify a CIDR block** for your VPC (e.g., `10.0.0.0/16`).

### 2. Subnet Creation
- **Create public subnets** in different Availability Zones for high
  availability. Public subnets are where your internet-facing resources will
  reside, like the web server.
- **Create private subnets** in different Availability Zones for your database.
  Resources in these subnets will not be directly accessible from the internet.

### 3. Internet Gateway and Route Tables
- **Attach an Internet Gateway (IGW)** to your VPC to allow communication
  between resources in your VPC and the internet.
- **Create route tables** for public and private subnets. Public route tables
  should have a default route to the IGW. Private route tables should not have
  direct routes to the IGW.

### 4. Network Access Control Lists (NACLs) and Security Groups
- **Set up NACLs** as an additional layer of security that acts as a firewall
  for associated subnets, controlling both inbound and outbound traffic at the
  subnet level.
- **Create security groups** for different types of instances (e.g., web
  servers, database servers):
  - **Web Server Security Group**: Allow inbound traffic on HTTP (port 80) and
    HTTPS (port 443) from anywhere (0.0.0.0/0) and outbound traffic to the
    internet and the private subnets.
  - **Database Security Group**: Allow inbound traffic on the database port
    only from the web server security group and no direct access from the
    internet.

### 5. EC2 Instance for the Web Server
- **Launch an EC2 instance** in the public subnet to host your web application.
  Choose an appropriate AMI (Amazon Machine Image), instance type, and
  configure it to be part of the web server security group.
- **Install necessary software** like a web server (Apache, Nginx) and any
  other required software stack.

### 6. RDS Instance for the Database
- **Set up an RDS instance** in the private subnet. Choose the appropriate
  database engine (e.g., MySQL, PostgreSQL).
- **Configure the RDS instance** to be part of the database security group,
  ensuring it can only be accessed from the EC2 instances within the web server
  security group.

### 7. Elastic Load Balancer (ELB)
- **Implement an ELB** to distribute incoming traffic across multiple EC2
  instances, enhancing the fault tolerance and scalability of your application.
- Place the ELB in the public subnets and configure it to forward requests to
  the EC2 instances in the public subnets.

### 8. Additional Considerations
- **Enable CloudWatch** for monitoring and logs to keep track of application
  performance and security.
- **Consider Auto Scaling** to automatically adjust the number of EC2 instances
  in response to traffic fluctuations.
- **Backup and disaster recovery plans** should be established for both your
  EC2 and RDS instances.

### 9. Testing and Validation
- **Test your setup** thoroughly to ensure everything is functioning as
  expected. Test failover by simulating failure scenarios and validate that the
  ELB properly distributes traffic.
- **Perform security audits** to check for vulnerabilities.

This setup should provide a robust foundation for deploying a secure, scalable
three-tier web application in AWS. Make sure to adhere to AWS best practices
for security and architecture design throughout your deployment process.
```

</div>

</v-click>
---

# Task 5: Generating terraform code

<v-click>

<div class="entry user">

```md {all}{maxHeight:'150px'}
Can you create terraform code automating all these steps, that follows modern
best practices such as using common public terraform modules, using S3 backend
for state storage and  workspaces for isolating environment-specific state
definitions?
```

</div>

</v-click>

<v-click>

<div class="entry ai">

```md {all}{maxHeight:'280px'}
Creating a Terraform configuration to deploy a secure, scalable three-tier web
application on AWS involves several components. Below, I'll provide a
structured Terraform setup that includes the use of common public modules, an
S3 backend for state storage, and workspaces for isolating environment-specific
configurations.

### Directory and File Structure

Let's first outline the directory and file structure for organizing the
Terraform code:

~~~
terraform/
├── main.tf
├── variables.tf
├── outputs.tf
├── backend.tf
├── provider.tf
└── environments/
    ├── prod/
    │   └── terraform.tfvars
    └── dev/
        └── terraform.tfvars
~~~

### 1. Backend Configuration (`backend.tf`)

This file will configure Terraform to use an Amazon S3 bucket as the backend
for state storage.

~~~~hcl
terraform {
  backend "s3" {
    bucket         = "your-terraform-state-bucket"
    key            = "path/to/my/environment/terraform.tfstate"
    region         = "us-east-1"
    dynamodb_table = "your-lock-table"
    encrypt        = true
  }
}
~~~~

### 2. Provider Setup (`provider.tf`)

This file configures the AWS provider.

~~~~hcl
provider "aws" {
  region = var.region
}
~~~~

### 3. Main Configuration (`main.tf`)

This file will use modules to set up the VPC, subnets, EC2, and RDS instances.

~~~~hcl
module "vpc" {
  source  = "terraform-aws-modules/vpc/aws"
  version = "~> 3.0"

  name = "MyVPC"
  cidr = "10.0.0.0/16"

  azs             = ["us-east-1a", "us-east-1b"]
  private_subnets = ["10.0.1.0/24", "10.0.2.0/24"]
  public_subnets  = ["10.0.101.0/24", "10.0.102.0/24"]

  enable_nat_gateway = true
  single_nat_gateway = true
  enable_dns_hostnames = true
  enable_dns_support   = true

  public_subnet_tags = {
    "Name" = "MyPublicSubnet"
    "Tier" = "Public"
  }
  private_subnet_tags = {
    "Name" = "MyPrivateSubnet"
    "Tier" = "Private"
  }
}

module "ec2" {
  source  = "terraform-aws-modules/ec2-instance/aws"
  version = "~> 3.0"

  name           = "WebServer"
  instance_count = 1

  ami                    = data.aws_ami.latest.id
  instance_type          = "t2.micro"
  subnet_id              = element(module.vpc.public_subnets, 0)
  vpc_security_group_ids = [module.sg.web_sg_id]

  tags = {
    "Name" = "MyWebServer"
  }
}

module "rds" {
  source  = "terraform-aws-modules/rds/aws"
  version = "~> 3.0"

  identifier = "mydb"
  engine     = "mysql"
  version    = "8.0"

  instance_class = "db.t3.micro"
  allocated_storage = 20
  max_allocated_storage = 100
  storage_encrypted = true

  db_subnet_group_name = module.vpc.database_subnet_group
  vpc_security_group_ids = [module.sg.db_sg_id]
}

module "sg" {
  source  = "terraform-aws-modules/security-group/aws"
  version = "~> 4.0"

  name        = "WebSG"
  description = "Security group for web server"
  vpc_id      = module.vpc.vpc_id

  ingress_cidr_blocks = ["0.0.0.0/0"]
  egress_cidr_blocks  = ["0.0.0.0/0"]
  ingress_rules       = ["http-80-tcp", "https-443-tcp"]
  egress_rules        = ["all-all"]
}
~~~~

### 4. Variables (`variables.tf`)

Define necessary variables here.

~~~~hcl
variable "region" {
  description = "AWS region"
  default     = "us-east-1"
}

data "aws_ami" "latest" {
  most_recent = true

  filter {
    name   = "name"
    values = ["amzn2-ami-hvm-*-x86_64-gp2"]
  }

  owners = ["amazon"]  // Amazon Linux AMI
}
~~~~

### 5. Outputs (`outputs.tf`)

~~~~hcl
output "web_server_public_ip" {
  value = module.ec2.public_ip
}

output "db_instance_address" {
  value = module.rds.db_instance_address
}
~~~~

### 6. Environment configuration (`environments/prod/terraform.tfvars`)
~~~~
region = "us-east-1"
~~~~

### Execution Steps

1. Initialize the backend and download modules:
~~~
terraform init
~~~

2. Create a new workspace or select an existing one:
~~~
terraform workspace new prod
~~~

or 
~~~
terraform workspace select prod
~~~

3. Apply the configuration:
~~~
terraform apply
~~~

```

</div>

</v-click>
---

# Task 5: Summary

- At least ChatGPT-4 is able to provide a reasonable starting point for a simple well-known terraform configuration
- The configuration cab be modified pretty easily by adding additional requirements
- But I'm not a infrastructure engineer, what do you think?

---

# Task 6: Working with an Unfamiliar API

### Objective

Write a Python script to scan a DynamoDB users table and delete records where
the email address matches a given regular expression pattern.

### Provided Information

- DynamoDB Table Name: users
- Each record in the table has the following attributes:
    - userId (String): The unique identifier for the user.
    - email (String): The user's email address.
- Regular Expression Pattern: ".*@example\.com$"

---

# Task 6: interaction with an Unfamiliar API

<v-click>

<div class="entry user">

```md {all}{maxHeight:'150px'}
Write a Python script to scan a DynamoDB users table. The script should delete
all records where the email address matches the regular expression pattern
indicating the email domain is example.com.
```

</div>

</v-click>

<v-click>

<div class="entry ai">

```md {all}{maxHeight:'300px'}
To accomplish this task, you will need a Python script that interacts with the
AWS DynamoDB service. The script will scan the users table for records where
the email address domain is `example.com` and then delete those records. To
perform operations on DynamoDB, you will need to use the `boto3` library, which
is the AWS SDK for Python.

Before you start, make sure you have:
- AWS CLI configured with the necessary access rights to read from and write to
  the DynamoDB table.
- `boto3` installed in your environment. You can install it using `pip install
  boto3` if you haven't already.

Here's a basic script to perform the task described:

~~~python
import boto3
import re

# Initialize a boto3 DynamoDB client
dynamodb = boto3.resource('dynamodb')
table = dynamodb.Table('users')  # Replace 'users' with your table name

# Compile the regular expression for matching 'example.com' domain in email addresses
email_pattern = re.compile(r'^[^@]+@example\.com$')

def delete_records_with_example_domain():
    # Scan the table (Note: Consider using pagination for large datasets)
    response = table.scan(
        ProjectionExpression="id, email"  # Adjust attributes as per your table's design
    )
    items = response.get('Items', [])

    # Filter items with email domain matching 'example.com'
    items_to_delete = [item for item in items if email_pattern.match(item.get('email', ''))]
    
    # Delete the filtered items
    for item in items_to_delete:
        delete_response = table.delete_item(
            Key={
                'id': item['id']  # Adjust the Key schema as per your table's design
            }
        )
        print(f"Deleted item with id {item['id']} and email {item['email']}")

if __name__ == "__main__":
    delete_records_with_example_domain()
~~~

Please adjust the `ProjectionExpression` and the `Key` in the `delete_item`
call to match your table's schema. The given script does not implement
pagination, which is necessary for scanning large tables. You may need to
handle the pagination by checking if `LastEvaluatedKey` exists in the response
and then making subsequent `scan` calls using that key as the
`ExclusiveStartKey` until all items have been scanned.

This script assumes that your DynamoDB table's primary key is `id` and that
each record has an `email` attribute. You should adjust these fields based on
your actual table schema. Additionally, for tables with a large number of
records, consider using a more efficient query mechanism or filtering directly
through DynamoDB if possible, as scanning can be expensive and time-consuming
for large datasets.
```

</div>

</v-click>

---

# Task 6: Interaction with an Unfamiliar API

Notes:
- As noted by the assistant, handling large tables needs pagination. Tweak the script so that it uses pagination.
- Batching updates to DynamoDB is usually more performant on larger data sets. Consider tweaking the prompt to make the assistant use batch updates

---

# Task 7: Analysis of a TCP Packet Capture

Let's try something else not directly related to programming. Let's see if
modern AI assistants can handle a task of analyzing a TCP packet capture.

Objective: Evaluate AI assistant's ability to analyze packet captures

Challenge:
- Download a packet capture in text format using the link
    [packet-capture.txt](https://github.com/alexey-grigorovich-clearscale/ai-tools-workshop-202404/blob/master/labs/packet-capture/packet-capture.txt?raw=1)
- Use an AI assistant to interpret the captured packets
- Determine the network protocol used and the messages being exchanged

---

# Task 7: Analysis of a TCP Packet Capture

<v-click>

<div class="entry user">

```md {all}{maxHeight:'150px'}
Explain the following packets captured by tcpdump. Include explanation of the underlying application protocol, if any:
~~~
04:09:16.473288 IP localhost.61279 > localhost.irdmi: Flags [S], seq 970777568, win 65535, options [mss 16344,nop,wscale 6,nop,nop,TS val 591234953 ecr 0,sackOK,eol], length 0
    0x0000:  4500 0040 0000 4000 4006 0000 7f00 0001
    0x0010:  7f00 0001 ef5f 1f40 39dc e3e0 0000 0000
    0x0020:  b002 ffff fe34 0000 0204 3fd8 0103 0306
    0x0030:  0101 080a 233d 8789 0000 0000 0402 0000
04:09:16.473554 IP localhost.irdmi > localhost.61279: Flags [S.], seq 2207096804, ack 970777569, win 65535, options [mss 16344,nop,wscale 6,nop,nop,TS val 2915676794 ecr 591234953,sackOK,eol], length 0
    0x0000:  4500 0040 0000 4000 4006 0000 7f00 0001
    0x0010:  7f00 0001 1f40 ef5f 838d 9fe4 39dc e3e1
    0x0020:  b012 ffff fe34 0000 0204 3fd8 0103 0306
    0x0030:  0101 080a adc9 b27a 233d 8789 0402 0000
04:09:16.473604 IP localhost.61279 > localhost.irdmi: Flags [.], ack 1, win 6379, options [nop,nop,TS val 591234953 ecr 2915676794], length 0
    0x0000:  4500 0034 0000 4000 4006 0000 7f00 0001
    0x0010:  7f00 0001 ef5f 1f40 39dc e3e1 838d 9fe5
    0x0020:  8010 18eb fe28 0000 0101 080a 233d 8789
    0x0030:  adc9 b27a
04:09:16.473638 IP localhost.irdmi > localhost.61279: Flags [.], ack 1, win 6379, options [nop,nop,TS val 2915676794 ecr 591234953], length 0
    0x0000:  4500 0034 0000 4000 4006 0000 7f00 0001
    0x0010:  7f00 0001 1f40 ef5f 838d 9fe5 39dc e3e1
    0x0020:  8010 18eb fe28 0000 0101 080a adc9 b27a
    0x0030:  233d 8789
04:09:16.473674 IP localhost.61279 > localhost.irdmi: Flags [P.], seq 1:87, ack 1, win 6379, options [nop,nop,TS val 591234953 ecr 2915676794], length 86
    0x0000:  4500 008a 0000 4000 4006 0000 7f00 0001
    0x0010:  7f00 0001 ef5f 1f40 39dc e3e1 838d 9fe5
    0x0020:  8018 18eb fe7e 0000 0101 080a 233d 8789
    0x0030:  adc9 b27a 4745 5420 2f68 656c 6c6f 2e74
    0x0040:  7874 2048 5454 502f 312e 310d 0a48 6f73
    0x0050:  743a 206c 6f63 616c 686f 7374 3a38 3030
    0x0060:  300d 0a55 7365 722d 4167 656e 743a 2063
    0x0070:  7572 6c2f 382e 312e 320d 0a41 6363 6570
    0x0080:  743a 202a 2f2a 0d0a 0d0a
04:09:16.473746 IP localhost.irdmi > localhost.61279: Flags [.], ack 87, win 6378, options [nop,nop,TS val 2915676794 ecr 591234953], length 0
    0x0000:  4500 0034 0000 4000 4006 0000 7f00 0001
    0x0010:  7f00 0001 1f40 ef5f 838d 9fe5 39dc e437
    0x0020:  8010 18ea fe28 0000 0101 080a adc9 b27a
    0x0030:  233d 8789
04:09:16.477160 IP localhost.irdmi > localhost.61279: Flags [P.], seq 1:187, ack 87, win 6378, options [nop,nop,TS val 2915676798 ecr 591234953], length 186
    0x0000:  4500 00ee 0000 4000 4006 0000 7f00 0001
    0x0010:  7f00 0001 1f40 ef5f 838d 9fe5 39dc e437
    0x0020:  8018 18ea fee2 0000 0101 080a adc9 b27e
    0x0030:  233d 8789 4854 5450 2f31 2e30 2032 3030
    0x0040:  204f 4b0d 0a53 6572 7665 723a 2053 696d
    0x0050:  706c 6548 5454 502f 302e 3620 5079 7468
    0x0060:  6f6e 2f33 2e31 312e 380d 0a44 6174 653a
    0x0070:  2054 6875 2c20 3131 2041 7072 2032 3032
    0x0080:  3420 3231 3a30 393a 3136 2047 4d54 0d0a
    0x0090:  436f 6e74 656e 742d 7479 7065 3a20 7465
    0x00a0:  7874 2f70 6c61 696e 0d0a 436f 6e74 656e
    0x00b0:  742d 4c65 6e67 7468 3a20 3134 0d0a 4c61
    0x00c0:  7374 2d4d 6f64 6966 6965 643a 2054 6875
    0x00d0:  2c20 3131 2041 7072 2032 3032 3420 3231
    0x00e0:  3a30 303a 3034 2047 4d54 0d0a 0d0a
04:09:16.477246 IP localhost.61279 > localhost.irdmi: Flags [.], ack 187, win 6376, options [nop,nop,TS val 591234957 ecr 2915676798], length 0
    0x0000:  4500 0034 0000 4000 4006 0000 7f00 0001
    0x0010:  7f00 0001 ef5f 1f40 39dc e437 838d a09f
    0x0020:  8010 18e8 fe28 0000 0101 080a 233d 878d
    0x0030:  adc9 b27e
04:09:16.477475 IP localhost.irdmi > localhost.61279: Flags [P.], seq 187:201, ack 87, win 6378, options [nop,nop,TS val 2915676798 ecr 591234957], length 14
    0x0000:  4500 0042 0000 4000 4006 0000 7f00 0001
    0x0010:  7f00 0001 1f40 ef5f 838d a09f 39dc e437
    0x0020:  8018 18ea fe36 0000 0101 080a adc9 b27e
    0x0030:  233d 878d 4865 6c6c 6f2c 2077 6f72 6c64
    0x0040:  210a
04:09:16.477530 IP localhost.61279 > localhost.irdmi: Flags [.], ack 201, win 6376, options [nop,nop,TS val 591234957 ecr 2915676798], length 0
    0x0000:  4500 0034 0000 4000 4006 0000 7f00 0001
    0x0010:  7f00 0001 ef5f 1f40 39dc e437 838d a0ad
    0x0020:  8010 18e8 fe28 0000 0101 080a 233d 878d
    0x0030:  adc9 b27e
04:09:16.477558 IP localhost.irdmi > localhost.61279: Flags [F.], seq 201, ack 87, win 6378, options [nop,nop,TS val 2915676798 ecr 591234957], length 0
    0x0000:  4500 0034 0000 4000 4006 0000 7f00 0001
    0x0010:  7f00 0001 1f40 ef5f 838d a0ad 39dc e437
    0x0020:  8011 18ea fe28 0000 0101 080a adc9 b27e
    0x0030:  233d 878d
04:09:16.477589 IP localhost.61279 > localhost.irdmi: Flags [.], ack 202, win 6376, options [nop,nop,TS val 591234957 ecr 2915676798], length 0
    0x0000:  4500 0034 0000 4000 4006 0000 7f00 0001
    0x0010:  7f00 0001 ef5f 1f40 39dc e437 838d a0ae
    0x0020:  8010 18e8 fe28 0000 0101 080a 233d 878d
    0x0030:  adc9 b27e
04:09:16.477612 IP localhost.61279 > localhost.irdmi: Flags [F.], seq 87, ack 202, win 6376, options [nop,nop,TS val 591234957 ecr 2915676798], length 0
    0x0000:  4500 0034 0000 4000 4006 0000 7f00 0001
    0x0010:  7f00 0001 ef5f 1f40 39dc e437 838d a0ae
    0x0020:  8011 18e8 fe28 0000 0101 080a 233d 878d
    0x0030:  adc9 b27e
04:09:16.477677 IP localhost.irdmi > localhost.61279: Flags [.], ack 88, win 6378, options [nop,nop,TS val 2915676798 ecr 591234957], length 0
    0x0000:  4500 0034 0000 4000 4006 0000 7f00 0001
    0x0010:  7f00 0001 1f40 ef5f 838d a0ae 39dc e438
    0x0020:  8010 18ea fe28 0000 0101 080a adc9 b27e
    0x0030:  233d 878d
~~~
```

</div>

</v-click>

<v-click>

<div class="entry ai">

```md {all}{maxHeight:'250px'}
## Explanation of the captured packets

These packets show a TCP connection establishment and data exchange between two
processes on the same machine (localhost) using port 61279 for one and a
well-known port (IRDMI - Infrared Data Association Management Interface) on the
other.

Here's a breakdown of the capture:

1. **TCP SYN packets (Lines 1 & 2):**
    * These are the initial packets used to establish the TCP connection.
    * They both have the SYN flag set, indicating a request to initiate a connection.
    * Each packet contains a sequence number (seq) and acknowledgement number
      (ack). These are used for reliable data transfer and error checking.

2. **TCP SYN-ACK packets (Lines 3 & 4):**
    * These packets are sent in response to the SYN packets.
    * They have both the SYN and ACK flags set.
    * The ACK number acknowledges the receipt of the previous packet's sequence number.

3. **TCP ACK packets (Lines 5 to 10):**
    * These packets are sent to acknowledge the receipt of data.
    * They only have the ACK flag set.

4. **TCP PUSH packets (Lines 6 & 9):**
    * These packets carry application data along with the ACK flag.
    * The captured data (lines 34-55) seems to be in ASCII format and contains:
        * Line 6: "GET /hello.txt HTTP/1.1" - This suggests the client is
          requesting a file named "hello.txt" using HTTP protocol version 1.1.
        * Line 9: "Hello, world!" - This might be the content of the requested file.

5. **TCP FIN packets (Lines 11 & 12):**
    * These packets are sent to indicate the end of the data transmission.
    * They have the FIN flag set.

**Underlying application protocol:**

Based on the captured data ("GET /hello.txt HTTP/1.1"), the underlying
application protocol is **HTTP (Hypertext Transfer Protocol)**. It's commonly
used for communication between web browsers and servers.

**Note:** This is a simplified explanation. TCP/IP captures can be complex and
may require further analysis depending on the specific needs.
```

</div>

</v-click>

---

# Task 7: Analysis of TCP packet capture

Results: In our experiments, both Gemini and Google were successful at
analyzing simple TCP packet captures and providing basic insights on their
structure and contents.

---

# Challenge: Capture the Flag

Let's solve a simple Capture the Flag (CTF) challenge.

You are given a java class file that checks the username and password that we
input and prints the flag if the credentials are correct. The goal of the
challenge is to find the correct username and password that will print the
flag.

## Instructions

- Download the file at 
    [SimpleCTFChallenge.class](https://github.com/alexey-grigorovich-clearscale/ai-tools-workshop-202404/blob/master/labs/ctf/SimpleCTFChallenge.class?raw=1)
- Use the AI tools to analyze the file

## Notes

- With ChatGPT4, you can upload the file directly to the chat and ask it to analyze the file
- With basic version of Gemini, you can ask it to recommend the analysis tools first.
- In any case, ask the AI to prefer tools built inot the java development kit

---

# Challenge: Capture the Flag

<v-click>

<div class="entry user">

```md {all}{maxHeight:'150px'}
You are trying to solve a programming capture the flag challenge where you need to reverse engineer a Java class file. Challenge description is given below. Where do I start? Prefer the tools built into the java development kit (JDK).

Challenge descriptioin:

~~~
Let's solve a simple Capture the Flag (CTF) challenge.

You are given a java class file that checks the username and password that we
input and prints the flag if the credentials are correct. The goal of the
challenge is to find the correct username and password that will print the
flag.
~~~
```

</div>

</v-click>

<v-click>

<div class="entry ai">

```md {all}{maxHeight:'220px'}
Here's how you can start solving the CTF challenge using tools built into the JDK:

**1. Analyze the class file:**

* **javap:** Use the `javap -v` command to disassemble the class file. This
  will display details like class name, methods, fields, and bytecode
instructions. Look for methods related to user input (e.g., `getString`) and
conditional statements (e.g., `if`). Pay close attention to string literals
within the bytecode, which might contain clues for usernames or passwords.

**2. Decompile the class file (optional):**

* **Jdeps:** While not technically a decompiler, `jdeps` can analyze
  dependencies within the class file. This might reveal external libraries used
that could provide hints about the challenge's logic.

**3. Simulate program flow:**

* **javap -clasSPATH <path_to_licenses> -p <class_name>**: This command can be
  used with caution to partially simulate program flow. By providing the `-p`
flag and the class name, you might be able to step through methods line by line
(limited functionality). **Important Note:** This approach might not work for
all class files due to security restrictions. 

**Tips:**

* Look for string comparisons within the bytecode. These might reveal potential
  usernames or passwords.
* Identify methods responsible for user input and flag printing.
* If the challenge allows, try providing different usernames and passwords to
  observe the program's behavior.

**Remember:** Using `javap -p` has limitations and might not work in all cases.
It's recommended to use this technique with caution and only if the challenge
allows such exploration.

**Additional Tools (beyond JDK):**

* **JD-GUI:** This is a popular and user-friendly decompiler tool that can
  provide a more readable representation of the class file compared to `javap`.
However, it's not part of the JDK.

By combining these techniques, you should be able to gain insights into the
program's logic and potentially identify the correct username and password to
capture the flag.
```

</div>

</v-click>
---

# Challenge: Capture the Flag (continued)

<v-click>

<div class="entry user">

```md {all}{maxHeight:'150px'}
This is the output of running `javap -v` on the class file. What are the next steps for solving the challenge? Go step by step.

~~~
Classfile /Users/grig/Scratch/clearscale-summit-2024-04/slides/clearscale-ai-workshop-202404/labs/ctf/SimpleCTFChallenge.class
 Last modified Apr 11, 2024; size 2097 bytes
 SHA-256 checksum 8b074bf88cb412135a401c8ad00cd9db807962bb6986a85456f03b81fd2e7673
 Compiled from "SimpleCTFChallenge.java"
public class SimpleCTFChallenge
 minor version: 0
 major version: 61
 flags: (0x0021) ACC_PUBLIC, ACC_SUPER
 this_class: #10             // SimpleCTFChallenge
 super_class: #2             // java/lang/Object
 interfaces: 0, fields: 4, methods: 3, attributes: 3
Constant pool:
  #1 = Methodref     #2.#3     // java/lang/Object."<init>":()V
  #2 = Class       #4      // java/lang/Object
  #3 = NameAndType    #5:#6     // "<init>":()V
  #4 = Utf8        java/lang/Object
  #5 = Utf8        <init>
  #6 = Utf8        ()V
  #7 = String       #8      // admin
  #8 = Utf8        admin
  #9 = Fieldref      #10.#11    // SimpleCTFChallenge.username:Ljava/lang/String;
  #10 = Class       #12      // SimpleCTFChallenge
  #11 = NameAndType    #13:#14    // username:Ljava/lang/String;
  #12 = Utf8        SimpleCTFChallenge
  #13 = Utf8        username
  #14 = Utf8        Ljava/lang/String;
  #15 = String       #16      // MyEncryptionKey!1
  #16 = Utf8        MyEncryptionKey!1
  #17 = Fieldref      #10.#18    // SimpleCTFChallenge.encryptionKey:Ljava/lang/String;
  #18 = NameAndType    #19:#14    // encryptionKey:Ljava/lang/String;
  #19 = Utf8        encryptionKey
  #20 = String       #21      // \u0000\u0000d=\u0006\u0011\u000bC\u00009\u000e\u001d8\u0012\u0016SU
  #21 = Utf8        \u0000\u0000d=\u0006\u0011\u000bC\u00009\u000e\u001d8\u0012\u0016SU
  #22 = Fieldref      #10.#23    // SimpleCTFChallenge.encryptedPassword:Ljava/lang/String;
  #23 = NameAndType    #24:#14    // encryptedPassword:Ljava/lang/String;
  #24 = Utf8        encryptedPassword
  #25 = String       #26      // flag{S1mpl3CTFCh@ll3ng3}
  #26 = Utf8        flag{S1mpl3CTFCh@ll3ng3}
  #27 = Fieldref      #10.#28    // SimpleCTFChallenge.flag:Ljava/lang/String;
  #28 = NameAndType    #29:#14    // flag:Ljava/lang/String;
  #29 = Utf8        flag
  #30 = Class       #31      // java/lang/StringBuilder
  #31 = Utf8        java/lang/StringBuilder
  #32 = Methodref     #30.#3    // java/lang/StringBuilder."<init>":()V
  #33 = Methodref     #34.#35    // java/lang/String.length:()I
  #34 = Class       #36      // java/lang/String
  #35 = NameAndType    #37:#38    // length:()I
  #36 = Utf8        java/lang/String
  #37 = Utf8        length
  #38 = Utf8        ()I
  #39 = Methodref     #34.#40    // java/lang/String.charAt:(I)C
  #40 = NameAndType    #41:#42    // charAt:(I)C
  #41 = Utf8        charAt
  #42 = Utf8        (I)C
  #43 = Methodref     #30.#44    // java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
  #44 = NameAndType    #45:#46    // append:(C)Ljava/lang/StringBuilder;
  #45 = Utf8        append
  #46 = Utf8        (C)Ljava/lang/StringBuilder;
  #47 = Fieldref      #48.#49    // java/lang/System.out:Ljava/io/PrintStream;
  #48 = Class       #50      // java/lang/System
  #49 = NameAndType    #51:#52    // out:Ljava/io/PrintStream;
  #50 = Utf8        java/lang/System
  #51 = Utf8        out
  #52 = Utf8        Ljava/io/PrintStream;
  #53 = Methodref     #30.#54    // java/lang/StringBuilder.toString:()Ljava/lang/String;
  #54 = NameAndType    #55:#56    // toString:()Ljava/lang/String;
  #55 = Utf8        toString
  #56 = Utf8        ()Ljava/lang/String;
  #57 = InvokeDynamic   #0:#58    // #0:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #58 = NameAndType    #59:#60    // makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #59 = Utf8        makeConcatWithConstants
  #60 = Utf8        (Ljava/lang/String;)Ljava/lang/String;
  #61 = Methodref     #62.#63    // java/io/PrintStream.println:(Ljava/lang/String;)V
  #62 = Class       #64      // java/io/PrintStream
  #63 = NameAndType    #65:#66    // println:(Ljava/lang/String;)V
  #64 = Utf8        java/io/PrintStream
  #65 = Utf8        println
  #66 = Utf8        (Ljava/lang/String;)V
  #67 = Methodref     #34.#68    // java/lang/String.equals:(Ljava/lang/Object;)Z
  #68 = NameAndType    #69:#70    // equals:(Ljava/lang/Object;)Z
  #69 = Utf8        equals
  #70 = Utf8        (Ljava/lang/Object;)Z
  #71 = String       #72      // Invalid credentials
  #72 = Utf8        Invalid credentials
  #73 = Class       #74      // java/io/BufferedReader
  #74 = Utf8        java/io/BufferedReader
  #75 = Class       #76      // java/io/InputStreamReader
  #76 = Utf8        java/io/InputStreamReader
  #77 = Fieldref      #48.#78    // java/lang/System.in:Ljava/io/InputStream;
  #78 = NameAndType    #79:#80    // in:Ljava/io/InputStream;
  #79 = Utf8        in
  #80 = Utf8        Ljava/io/InputStream;
  #81 = Methodref     #75.#82    // java/io/InputStreamReader."<init>":(Ljava/io/InputStream;)V
  #82 = NameAndType    #5:#83    // "<init>":(Ljava/io/InputStream;)V
  #83 = Utf8        (Ljava/io/InputStream;)V
  #84 = Methodref     #73.#85    // java/io/BufferedReader."<init>":(Ljava/io/Reader;)V
  #85 = NameAndType    #5:#86    // "<init>":(Ljava/io/Reader;)V
  #86 = Utf8        (Ljava/io/Reader;)V
  #87 = String       #88      // Username:
  #88 = Utf8        Username:
  #89 = Methodref     #62.#90    // java/io/PrintStream.print:(Ljava/lang/String;)V
  #90 = NameAndType    #91:#66    // print:(Ljava/lang/String;)V
  #91 = Utf8        print
  #92 = Methodref     #73.#93    // java/io/BufferedReader.readLine:()Ljava/lang/String;
  #93 = NameAndType    #94:#56    // readLine:()Ljava/lang/String;
  #94 = Utf8        readLine
  #95 = String       #96      // Password:
  #96 = Utf8        Password:
  #97 = Methodref     #10.#3    // SimpleCTFChallenge."<init>":()V
  #98 = Methodref     #10.#99    // SimpleCTFChallenge.getFlag:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #99 = NameAndType    #100:#101   // getFlag:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
 #100 = Utf8        getFlag
 #101 = Utf8        (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
 #102 = Utf8        Code
 #103 = Utf8        LineNumberTable
 #104 = Utf8        StackMapTable
 #105 = Utf8        main
 #106 = Utf8        ([Ljava/lang/String;)V
 #107 = Utf8        Exceptions
 #108 = Class       #109     // java/lang/Exception
 #109 = Utf8        java/lang/Exception
 #110 = Utf8        SourceFile
 #111 = Utf8        SimpleCTFChallenge.java
 #112 = Utf8        BootstrapMethods
 #113 = MethodHandle    6:#114    // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
 #114 = Methodref     #115.#116   // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
 #115 = Class       #117     // java/lang/invoke/StringConcatFactory
 #116 = NameAndType    #59:#118   // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
 #117 = Utf8        java/lang/invoke/StringConcatFactory
 #118 = Utf8        (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
 #119 = String       #120     // decrypted password: \u0001
 #120 = Utf8        decrypted password: \u0001
 #121 = Utf8        InnerClasses
 #122 = Class       #123     // java/lang/invoke/MethodHandles$Lookup
 #123 = Utf8        java/lang/invoke/MethodHandles$Lookup
 #124 = Class       #125     // java/lang/invoke/MethodHandles
 #125 = Utf8        java/lang/invoke/MethodHandles
 #126 = Utf8        Lookup
{
 public SimpleCTFChallenge();
  descriptor: ()V
  flags: (0x0001) ACC_PUBLIC
  Code:
   stack=2, locals=1, args_size=1
     0: aload_0
     1: invokespecial #1         // Method java/lang/Object."<init>":()V
     4: aload_0
     5: ldc      #7         // String admin
     7: putfield   #9         // Field username:Ljava/lang/String;
    10: aload_0
    11: ldc      #15         // String MyEncryptionKey!1
    13: putfield   #17         // Field encryptionKey:Ljava/lang/String;
    16: aload_0
    17: ldc      #20         // String \u0000\u0000d=\u0006\u0011\u000bC\u00009\u000e\u001d8\u0012\u0016SU
    19: putfield   #22         // Field encryptedPassword:Ljava/lang/String;
    22: aload_0
    23: ldc      #25         // String flag{S1mpl3CTFCh@ll3ng3}
    25: putfield   #27         // Field flag:Ljava/lang/String;
    28: return
   LineNumberTable:
    line 4: 0
    line 5: 4
    line 6: 10
    line 7: 16
    line 8: 22

 public java.lang.String getFlag(java.lang.String, java.lang.String);
  descriptor: (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  flags: (0x0001) ACC_PUBLIC
  Code:
   stack=5, locals=5, args_size=3
     0: new      #30         // class java/lang/StringBuilder
     3: dup
     4: invokespecial #32         // Method java/lang/StringBuilder."<init>":()V
     7: astore_3
     8: iconst_0
     9: istore    4
    11: iload     4
    13: aload_0
    14: getfield   #22         // Field encryptedPassword:Ljava/lang/String;
    17: invokevirtual #33         // Method java/lang/String.length:()I
    20: if_icmpge   62
    23: aload_3
    24: aload_0
    25: getfield   #22         // Field encryptedPassword:Ljava/lang/String;
    28: iload     4
    30: invokevirtual #39         // Method java/lang/String.charAt:(I)C
    33: aload_0
    34: getfield   #17         // Field encryptionKey:Ljava/lang/String;
    37: iload     4
    39: aload_0
    40: getfield   #17         // Field encryptionKey:Ljava/lang/String;
    43: invokevirtual #33         // Method java/lang/String.length:()I
    46: irem
    47: invokevirtual #39         // Method java/lang/String.charAt:(I)C
    50: ixor
    51: i2c
    52: invokevirtual #43         // Method java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
    55: pop
    56: iinc     4, 1
    59: goto     11
    62: getstatic   #47         // Field java/lang/System.out:Ljava/io/PrintStream;
    65: aload_3
    66: invokevirtual #53         // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
    69: invokedynamic #57, 0       // InvokeDynamic #0:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
    74: invokevirtual #61         // Method java/io/PrintStream.println:(Ljava/lang/String;)V
    77: aload_0
    78: getfield   #9         // Field username:Ljava/lang/String;
    81: aload_1
    82: invokevirtual #67         // Method java/lang/String.equals:(Ljava/lang/Object;)Z
    85: ifeq     104
    88: aload_3
    89: invokevirtual #53         // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
    92: aload_2
    93: invokevirtual #67         // Method java/lang/String.equals:(Ljava/lang/Object;)Z
    96: ifeq     104
    99: aload_0
    100: getfield   #27         // Field flag:Ljava/lang/String;
    103: areturn
    104: ldc      #71         // String Invalid credentials
    106: areturn
   LineNumberTable:
    line 12: 0
    line 13: 8
    line 14: 23
    line 13: 56
    line 17: 62
    line 18: 77
    line 19: 99
    line 21: 104
   StackMapTable: number_of_entries = 3
    frame_type = 253 /* append */
     offset_delta = 11
     locals = [ class java/lang/StringBuilder, int ]
    frame_type = 250 /* chop */
     offset_delta = 50
    frame_type = 41 /* same */

 public static void main(java.lang.String[]) throws java.lang.Exception;
  descriptor: ([Ljava/lang/String;)V
  flags: (0x0009) ACC_PUBLIC, ACC_STATIC
  Code:
   stack=5, locals=5, args_size=1
     0: new      #73         // class java/io/BufferedReader
     3: dup
     4: new      #75         // class java/io/InputStreamReader
     7: dup
     8: getstatic   #77         // Field java/lang/System.in:Ljava/io/InputStream;
    11: invokespecial #81         // Method java/io/InputStreamReader."<init>":(Ljava/io/InputStream;)V
    14: invokespecial #84         // Method java/io/BufferedReader."<init>":(Ljava/io/Reader;)V
    17: astore_1
    18: getstatic   #47         // Field java/lang/System.out:Ljava/io/PrintStream;
    21: ldc      #87         // String Username:
    23: invokevirtual #89         // Method java/io/PrintStream.print:(Ljava/lang/String;)V
    26: aload_1
    27: invokevirtual #92         // Method java/io/BufferedReader.readLine:()Ljava/lang/String;
    30: astore_2
    31: getstatic   #47         // Field java/lang/System.out:Ljava/io/PrintStream;
    34: ldc      #95         // String Password:
    36: invokevirtual #89         // Method java/io/PrintStream.print:(Ljava/lang/String;)V
    39: aload_1
    40: invokevirtual #92         // Method java/io/BufferedReader.readLine:()Ljava/lang/String;
    43: astore_3
    44: new      #10         // class SimpleCTFChallenge
    47: dup
    48: invokespecial #97         // Method "<init>":()V
    51: astore    4
    53: getstatic   #47         // Field java/lang/System.out:Ljava/io/PrintStream;
    56: aload     4
    58: aload_2
    59: aload_3
    60: invokevirtual #98         // Method getFlag:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    63: invokevirtual #61         // Method java/io/PrintStream.println:(Ljava/lang/String;)V
    66: return
   LineNumberTable:
    line 26: 0
    line 27: 18
    line 28: 26
    line 29: 31
    line 30: 39
    line 32: 44
    line 33: 53
    line 34: 66
  Exceptions:
   throws java.lang.Exception
}
SourceFile: "SimpleCTFChallenge.java"
BootstrapMethods:
 0: #113 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  Method arguments:
   #119 decrypted password: \u0001
InnerClasses:
 public static final #126= #122 of #124; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
~~~
```

</div>

</v-click>

<v-click>

<div class="entry ai">

```md {all}{maxHeight:'220px'}
## Next steps to solve the CTF challenge:

Based on the `javap -v` output, here's how you can proceed:

1. **Analyze the `getFlag` method:** This method seems to be responsible for
   checking the username and password and returning the flag if the credentials
are correct. Focus on this method for now.

2. **Identify String Comparisons:** Look for lines containing `if` statements
   and calls to `equals` method within the `getFlag` method. These likely check
the user-provided username and password against stored values.

3. **Encrypted Password:** The `encryptedPassword` field holds a seemingly
   nonsensical string
(`\u0000\u0000d=\u0006\u0011\u000bC\u00009\u000e\u001d8\u0012\u0016SU`). This
might be the actual password but in an encrypted format.

4. **Encryption Key:** The `encryptionKey` field contains the string
   `MyEncryptionKey!1`. This could be a hint for decrypting the password.

**Possible Approaches:**

* **Manual Analysis:** Try to understand the logic within the `getFlag` method.
  Look for operations performed on the encrypted password using the encryption
key. If it's a simple XOR or Caesar cipher, you might be able to decrypt it
manually.

* **Decompilation (Optional):** Consider using a tool like JD-GUI to get a more
  readable representation of the code. This can aid in understanding the logic
behind password decryption within the `getFlag` method.

**Remember:** Don't modify the original class file. Make copies if you plan on
using them for further analysis.

By following these steps and carefully analyzing the `getFlag` method, you
should be able to identify the logic used to encrypt the password and
potentially crack it to find the correct credentials for capturing the flag.
```

</div>

</v-click>

---

# Challenge: Capture the Flag (continued)

<v-click>

<div class="entry user">

```md {all}{maxHeight:'150px'}
Can you suggest steps for decrypting the encrypted password?
```

</div>

</v-click>

<v-click>

<div class="entry ai">

```md {all}{maxHeight:'320px'}
Here are some steps you can take to try decrypting the password:

1. **Analyze the Encryption Key:**
    * The key "MyEncryptionKey!1" might be a hint for the encryption method.
      Look for common encryption algorithms that use a key with similar characteristics (letters, numbers, symbols).

2. **Character Encoding:**
    * The encrypted password
      (`\u0000\u0000d=\u0006\u0011\u000bC\u00009\u000e\u001d8\u0012\u0016SU`)
      seems to be encoded with escape sequences. You'll need to convert these
      sequences back to actual characters using a tool or online decoder. Tools like
      [https://checkserp.com/encode/ascii/](https://checkserp.com/encode/ascii/) can
      help.

3. **Identify Encryption Type:**
    * Look for clues within the code about the encryption method used. Does it
      involve any string manipulation functions besides comparisons? Are there
      any references to libraries or algorithms?

4. **Manual Attempts:**
    * Based on the key and the nature of the encrypted password (seemingly
      random characters), here are some common ciphers you could try manually:
        * **XOR Cipher:**  If the encryption involves XORing the password with
          the key character by character, try XORing the decoded characters
          from step 2 with each character in the key ("MyEncryptionKey!1") and see if it
          reveals any meaningful patterns. Tools like [https://xor.pw/](https://xor.pw/)
          can be helpful here.
        * **Caesar Cipher:** This is a simple shift cipher where each letter is
          shifted by a certain number of positions. If the key provides a hint
          about the shift value, try shifting the decoded characters accordingly. 

5. **Tools and Libraries (if allowed):**
    * If the challenge allows using external tools or libraries, consider tools
      like Cryptool or online resources that offer various decryption
      algorithms. You can try feeding the key and the encoded password to see if any
      algorithm cracks it.

Remember, without knowing the exact encryption method used, successfully
decrypting the password might be challenging. However, by systematically
analyzing the clues and trying different approaches, you might be able to find
the solution.
```

</div>

</v-click>

---

# Challenge: Capture the Flag (continued)

Summary;
- With some help from the user, AI assistants are able to mostly solve the problem
- A combination of traditional tools and LLMs is very powerful, and AI models
  can even help with discovering the tools
- Some of the models support the "agents" feature where they can actually
  generate and run some code on their own to do computational tasks like
  decoding secrets or doing other types of analysis
- Safety filters are sometimes overly aggressive and tricky to work around

---

# Closing Remarks 

What we've seen so far:
- AI assistants are good at generating "boilerplate" code for well-known langugages and frameworks
- They are fairly good at the tasks of understanding the code and suggesting refactoring
- They are also great for exploratory work in unfamiliar domains or technology stacks

---

# Closing remarks

Things to be aware of:
- AI will happily hallucinate incorrect solutions, invent non-existing APIs. Make sure you validate its output...
    - Thankfully, you can ask the AI to write the tests first, which can act as the validation
- Be aware of the limits of the model that you're using, such as its context
  size. For larger inputs or conversation, data loss is unavoidable, so
  structure your conversations to work around the issue
- Privacy concerns: make sure you understand the data privacy policy of the AI
  assistant you're using. In particular, do not send sensitive information to
  public versions of ChatGPT or Gemini where that information could be used for
  training.

---

<center>

# Q&A

Questions?

</center>
---

<center>

# Thank you!

</center>

<!--

# Template slide

<v-click>

<div class="entry user">

```md {all}{maxHeight:'150px'}
Prompt
```

</div>

</v-click>

<v-click>

<div class="entry ai">

```md {all}{maxHeight:'300px'}
Response
```

</div>

</v-click>

-->
