const UglifyJsPlugin = require('uglifyjs-webpack-plugin');
module.exports = {
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
                test: /\.(js|jsx)$/,
                use: {
                    loader: 'babel-loader',
                    options: {
                        presets: [
                            ["env", {
                                "targets": {
                                    "browsers": ["last 2 Chrome versions"]
                                }
                            }]
                        ],
                        compact: false
                    }
                },
            },
        ],
    },
};