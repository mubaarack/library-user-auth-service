const UglifyJsPlugin = require('uglifyjs-webpack-plugin');
module.exports = {
    entry: "./src/main/resources/src/ts/app.ts",
    mode: 'development',
    output: {
        filename: 'app.js',
    },
    optimization: {
        minimizer: [new UglifyJsPlugin()],
    },
    module: {
        rules: [
            {
                test: /\.(ts|tsx)$/,
                use: 'ts-loader'
            }
        ],
    },
    resolve: {
        extensions: [ '.tsx', '.ts', '.js' ],
    }
};