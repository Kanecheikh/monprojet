from flask import Flask  # pip install flask
app = Flask(__name__)

@app.route("/")
def index():
    return "Hello World! Ceci est ma premiere page avec le micoframework flask"

if __name__ == "__main__" and "get_ipython" not in locals():  # ne pas exécuter dans un notebook
    app.run()