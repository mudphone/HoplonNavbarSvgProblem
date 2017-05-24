# navbar

The [Bootstrap Navbar](http://getbootstrap.com/components/#navbar-default)'s "hamburger" menu button doesn't work when `hoplon.svg` is required (doesn't need to be used, just required). This button shows up when you decrease the window size (shrink the browser) to mobile layout size. Pressing the button clears the entire page, rather than showing a dropdown menu of navbar items.

Uncommenting [this line](https://github.com/mudphone/HoplonNavbarSvgProblem/blob/master/src/index.cljs.hl#L4) removes the `require` for `hoplon.svg` and the navbar works again.

## Dependencies

- java 1.7+
- [boot][1]

## Usage
### Development
1. Start the `dev` task. In a terminal run:
    ```bash
    $ boot dev
    ```
    This will give you a  Hoplon development setup with:
    - auto compilation on file changes
    - audible warning for compilation success or failures
    - auto reload the html page on changes
    - Clojurescript REPL

2. Go to [http://localhost:8000][2] in your browser. You should see "Hello, Hoplon!".

3. If you edit and save a file, the task will recompile the code and reload the
   browser to show the updated version.

## License

Copyright © 2017, **Your Name Goes Here**

[1]: http://boot-clj.com
[2]: http://localhost:8000
[3]: http://hoplon.io
