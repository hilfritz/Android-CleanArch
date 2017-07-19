package com.hilfritz.android_clean_architecture.domain.repository.impl;

import com.hilfritz.android_clean_architecture.domain.repository.MessageRepository;

/**
 * Created by Hilfritz Camallere on 19/7/17.
 */

public class MessageRepositoryImpl implements MessageRepository {
    public static final String LOREM_IPSUM = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed ac enim imperdiet, scelerisque sapien ac, commodo nisi. Sed consectetur id urna sed tempus. Proin dignissim lorem diam, ac rhoncus orci fermentum ut. Ut pulvinar elementum condimentum. Ut facilisis id diam non interdum. Maecenas tincidunt quam vel eros elementum, sed volutpat neque fermentum. Sed tempus turpis ac ex vulputate, eget finibus purus tincidunt. Vivamus ut mollis sem, egestas aliquet ex. Donec ac ligula at nibh rutrum dignissim. Pellentesque quis maximus ex, a feugiat mi.\n" +
            "\n" +
            "Integer scelerisque ultrices dignissim. Vestibulum volutpat sit amet diam sed faucibus. Proin convallis, mauris eget luctus egestas, erat mauris auctor dolor, nec consequat lectus nunc ut nulla. Integer faucibus sapien sit amet purus consectetur rhoncus in vel nisl. Curabitur pellentesque neque sed vulputate elementum. Aliquam eu tellus velit. Morbi gravida tortor non diam varius pharetra. Maecenas quis cursus sapien, vel malesuada velit. Ut non nunc dictum, sodales arcu sit amet, rhoncus elit. Duis id arcu vestibulum odio accumsan luctus. In non ex egestas, mattis sapien vel, vulputate nisl. Integer condimentum tellus risus, quis semper tellus blandit vitae. Maecenas mauris leo, fermentum vitae risus eget, aliquet venenatis nibh. Nam mattis dapibus posuere.\n" +
            "\n" +
            "Nam a vestibulum mauris. In hac habitasse platea dictumst. Curabitur commodo sodales luctus. Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Cras ornare in libero sed faucibus. Morbi vel ultrices ante, quis imperdiet ex. Etiam ultrices risus sit amet lectus sollicitudin, in rutrum turpis rutrum. Proin volutpat ornare purus pellentesque scelerisque. Integer laoreet orci eget magna commodo eleifend.\n" +
            "\n" +
            "Fusce nibh enim, volutpat ornare facilisis ac, commodo non lectus. Aliquam at feugiat ex. Etiam suscipit posuere dui, at placerat tellus ornare at. Mauris mollis quam nec lobortis sodales. Pellentesque vitae lacus eu urna semper pulvinar blandit eu quam. Quisque sodales dictum eros, eget eleifend dolor fermentum sit amet. Interdum et malesuada fames ac ante ipsum primis in faucibus. Donec at feugiat ligula, ut porttitor neque.\n" +
            "\n" +
            "Praesent augue est, elementum quis enim aliquam, egestas fringilla leo. Aliquam vehicula nec metus ut vulputate. Etiam fringilla eros ipsum, sit amet auctor lacus maximus id. Nunc fermentum nibh ac ultricies porta. Mauris pulvinar augue nunc, at egestas enim elementum nec. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. In fringilla massa non mi hendrerit blandit. Maecenas nisl velit, facilisis nec tincidunt dictum, ultrices non velit.";
    @Override
    public String getWelcomeMessage() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return LOREM_IPSUM;
    }
}
