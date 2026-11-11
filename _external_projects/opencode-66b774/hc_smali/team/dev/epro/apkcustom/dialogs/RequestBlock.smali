.class public Lteam/dev/epro/apkcustom/dialogs/RequestBlock;
.super Landroidx/appcompat/app/AppCompatActivity;
.source ""

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public 〱かけばぜぐ:Ljava/io/File;

.field public 〱こか〺ぃせ:Landroid/widget/Button;

.field public 〴ねぷぐくぼ:Landroid/widget/TextView;

.field public 〺でおいここ:Landroid/widget/CheckBox;

.field public 〻ぞまぎな〻:Lcom/google/android/material/textfield/TextInputLayout;

.field public ぁないぼぎへ:Z

.field public ぃぜぶの〸ぃ:Landroid/widget/CheckBox;

.field public ぅばづそほせ:Z

.field public ぅみぱぎぎ:Landroid/widget/EditText;

.field public ぇ〳〲〺すっ:Lcom/google/android/material/textfield/TextInputLayout;

.field public ぇいうげ〱〹:Ljava/lang/String;

.field public ぇとしたべど:Landroid/widget/CheckBox;

.field public えがぐせほち:Landroid/widget/CheckBox;

.field public ぉ〲なぱぽた:Lcom/google/android/material/textfield/TextInputLayout;

.field public ぉざぅち〻:Landroid/widget/LinearLayout;

.field public ぉねぞはがぞ:Ljava/lang/String;

.field public ぉひのべい:Landroid/widget/EditText;

.field public おかぷせ〱:Landroid/widget/EditText;

.field public かづげぃぁ〺:Landroid/widget/Button;

.field public がぐくいおす:Ljava/lang/String;

.field public きぬどぼみ〸:Ljava/lang/String;

.field public ぎきぁ〱ぢ:Ljava/io/File;

.field public くぎぶ〼のそ:Landroid/widget/Button;

.field public くねねぱす〻:Landroid/widget/Button;

.field public けときぜと:Landroid/widget/EditText;

.field public げがぴうあだ:Landroid/widget/CheckBox;

.field public こ〲しでおか:Landroid/widget/CheckBox;

.field public ごづごきえ:Landroid/widget/LinearLayout;

.field public ごまけがぢは:Landroid/widget/CheckBox;

.field public ざっざへづ:Landroid/widget/LinearLayout;

.field public ざとぅぼこ〺:Landroid/widget/LinearLayout;

.field public しぷげへが:Ljava/lang/String;

.field public じぜこほぱ:Landroid/widget/EditText;

.field public ずまげせび〳:Landroid/widget/Button;

.field public せだてはぺて:Ljava/lang/String;

.field public せづっ〸ちね:Landroid/widget/EditText;

.field public ち〴みぎ〻び:Landroid/widget/CheckBox;

.field public ておぞぞはね:Landroid/widget/CheckBox;

.field public でどあくず:Lcom/google/android/material/textfield/TextInputLayout;

.field public どぇぞほだ:Landroid/widget/EditText;

.field public な〱ちぉじ:Ljava/lang/String;

.field public ながふずは:Landroid/widget/CheckBox;

.field public なぶひせが:Landroid/widget/EditText;

.field public にぢ〱ぁな:Ljava/lang/String;

.field public のね〱ばぁぢ:Landroid/widget/CheckBox;

.field public のびぶけせ:Ljava/lang/String;

.field public は〲ぱなで:Landroid/widget/LinearLayout;

.field public はつきどっ:Landroid/widget/TextView;

.field public ばおぢでぎか:Landroid/widget/CheckBox;

.field public びえぁぜい:Landroid/widget/ImageView;

.field public びちづぼぬ:Ljava/lang/String;

.field public ぶでにく〼〳:Lcom/google/android/material/textfield/TextInputLayout;

.field public ぷぞてのほき:Landroid/widget/EditText;

.field public へえどぜせ:Z

.field public へぼ〳〻び:Ljava/lang/String;

.field public ぺがぅす〹ち:Landroid/widget/CheckBox;

.field public ぺづげぺが:Landroid/widget/EditText;


# direct methods
.method public constructor <init>()V
    .registers 1

    invoke-direct {p0}, Landroidx/appcompat/app/AppCompatActivity;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .registers 14

    iget-object v0, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->なぶひせが:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    const-string v1, "\u001dki\u001ecmK1;H`;KalOkhN7h\u001cc:K1kJ7:J4"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-eqz v0, :cond_20

    move-object v0, v1

    goto :goto_2a

    :cond_20
    iget-object v0, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->なぶひせが:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_2a
    iput-object v0, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->のびぶけせ:Ljava/lang/String;

    iget-object v0, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->どぇぞほだ:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->ぇいうげ〱〹:Ljava/lang/String;

    iget-object v0, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->せづっ〸ちね:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->しぷげへが:Ljava/lang/String;

    iget-object v0, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->ぷぞてのほき:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    const-string v2, "Mj=H0gN3;N7oH0:\u001c79\u001c19\u001cfi\u001e19\u001a39Ae"

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-eqz v0, :cond_6c

    move-object v0, v2

    goto :goto_7a

    :cond_6c
    iget-object v0, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->ぷぞてのほき:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    :goto_7a
    iput-object v0, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->へぼ〳〻び:Ljava/lang/String;

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p1

    const/16 v0, -0x100

    const/4 v3, 0x2

    const/4 v4, -0x1

    const/4 v5, 0x5

    const/4 v6, 0x1

    const-string v7, ""

    const/4 v8, 0x0

    sparse-switch p1, :sswitch_data_6c0

    goto/16 :goto_6bf

    :sswitch_8e
    iget-object p1, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->ぅみぱぎぎ:Landroid/widget/EditText;

    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->な〱ちぉじ:Ljava/lang/String;

    .line 1
    sget-object p1, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 2
    check-cast p1, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {p1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->かちして〹づ()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_b9

    .line 3
    sget-object p1, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    const-string v1, "\u001bj;\u0019dhH`>A4hO`j\u001a3f@7kOen\u001c0>L1>\u001ce"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    goto :goto_c5

    :cond_b9
    sget-object p1, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    const-string v1, "H7nOghObiKb>\u0019cgHd=\u0019k:J`iH0m\u001d`fA1"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 4
    :goto_c5
    invoke-interface {p1, v1, v7}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->びちづぼぬ:Ljava/lang/String;

    .line 5
    sget-object p1, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    const-string v1, "L1hLclNjiN`n@em\u001b7>Kak\u001c09H6m\u001e6mLj"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 6
    invoke-interface {p1, v1, v7}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->ぉねぞはがぞ:Ljava/lang/String;

    const/16 p1, 0x4aa

    .line 7
    sget-object v1, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    const-string v2, "\u001ddiO3:\u00193g\u001c3mNfiL69KkmIco\u0019c9\u001cg>I0"

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 8
    invoke-interface {v1, v2, v7}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "\u0019ch\u001e`<Lg;\u001a3iNa<@joJ7f\u001ee;\u001a1lK4:\u0019`"

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    array-length v2, v1

    if-le v2, v6, :cond_113

    aget-object v2, v1, v8

    invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v2

    :try_start_106
    aget-object v1, v1, v6

    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p1
    :try_end_110
    .catch Ljava/lang/NumberFormatException; {:try_start_106 .. :try_end_110} :catch_111

    goto :goto_11d

    :catch_111
    nop

    goto :goto_11d

    :cond_113
    const-string v2, "\u001dboM`iLglM4l\u001djfIfmJ3gKgj\u001b3<Ob>\u001ba=Mc:N0:J0g\u001ajj\u001ck=A4o@6o\u001bbi\u0019gg\u001d0mO"

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    :goto_11d
    iget-object v1, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->ぉねぞはがぞ:Ljava/lang/String;

    const-string v9, "Iak@4<Lc<Mg;@6<\u001eakN`kLfmMgfO6f\u0019go\u001afmHc;K4h\u001919Lfi@fmO1j\u001ej:\u001cbfK1hA"

    invoke-static {v9}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v1, v9}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_160

    iget-object v1, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->ぉねぞはがぞ:Ljava/lang/String;

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    const-string v11, "\u001cegHenL7g\u001a6gNfmKgf\u001adl\u001ajf@k9IcmLj"

    invoke-static {v11}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    invoke-static {v11}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "\u001da>@7o@bj\u0019blL`>AekJ4kJ`:\u001denLf:\u001bd"

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v10, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, v9, p1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->ぉねぞはがぞ:Ljava/lang/String;

    .line 9
    :cond_160
    sget-object p1, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 10
    check-cast p1, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {p1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->かちして〹づ()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_17b

    .line 11
    sget-object p1, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    const-string v1, "\u001d0f@d:OfnM7>A7:\u001cbfJ4lH49L79\u001c0:O6"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    goto :goto_187

    :cond_17b
    sget-object p1, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    const-string v1, "Kkl\u001eg9\u001eanIcf\u0019`oH4;\u0019anMboMa:\u0019k<\u001db"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 12
    :goto_187
    invoke-interface {p1, v1, v7}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->にぢ〱ぁな:Ljava/lang/String;

    .line 13
    sget-object p1, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    const-string v1, "\u0019jkL1<\u001b3o\u00190o\u001djf\u001c`;H1n\u00193=\u001ebg\u001e7mMf"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 14
    invoke-interface {p1, v1, v8}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result p1

    const-string v2, "\u001c1m\u001d1jKjhOdn\u00190:MciNen\u001b4oKfj\u001ae9\u001bf"

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v9, "Lb;\u001ee;Hej\u001dbnJehO7;\u001c3kN7f\u001dj>KklL1"

    invoke-static {v9}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    if-eqz p1, :cond_1c6

    .line 15
    sget-object p1, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    .line 16
    invoke-interface {p1, v2, v8}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result p1

    if-eqz p1, :cond_1c6

    .line 17
    sget-object p1, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    .line 18
    invoke-interface {p1, v9, v8}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result p1

    if-nez p1, :cond_1c6

    const/4 v5, 0x3

    goto/16 :goto_232

    .line 19
    :cond_1c6
    sget-object p1, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    .line 20
    invoke-interface {p1, v1, v8}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result p1

    if-eqz p1, :cond_1d8

    .line 21
    sget-object p1, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    .line 22
    invoke-interface {p1, v9, v8}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result p1

    if-nez p1, :cond_1d8

    const/4 v5, 0x1

    goto :goto_232

    .line 23
    :cond_1d8
    sget-object p1, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    .line 24
    invoke-interface {p1, v2, v8}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result p1

    if-eqz p1, :cond_1ea

    .line 25
    sget-object p1, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    .line 26
    invoke-interface {p1, v9, v8}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result p1

    if-nez p1, :cond_1ea

    const/4 v5, 0x2

    goto :goto_232

    .line 27
    :cond_1ea
    sget-object p1, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    .line 28
    invoke-interface {p1, v1, v8}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result p1

    if-eqz p1, :cond_204

    .line 29
    sget-object p1, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    .line 30
    invoke-interface {p1, v2, v8}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result p1

    if-eqz p1, :cond_204

    .line 31
    sget-object p1, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    .line 32
    invoke-interface {p1, v9, v8}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result p1

    if-eqz p1, :cond_204

    const/4 v5, 0x7

    goto :goto_232

    .line 33
    :cond_204
    sget-object p1, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    .line 34
    invoke-interface {p1, v1, v8}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result p1

    if-eqz p1, :cond_215

    .line 35
    sget-object p1, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    .line 36
    invoke-interface {p1, v9, v8}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result p1

    if-eqz p1, :cond_215

    goto :goto_232

    .line 37
    :cond_215
    sget-object p1, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    .line 38
    invoke-interface {p1, v2, v8}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result p1

    if-eqz p1, :cond_227

    .line 39
    sget-object p1, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    .line 40
    invoke-interface {p1, v9, v8}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result p1

    if-eqz p1, :cond_227

    const/4 v5, 0x6

    goto :goto_232

    .line 41
    :cond_227
    sget-object p1, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    .line 42
    invoke-interface {p1, v9, v8}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result p1

    if-eqz p1, :cond_231

    const/4 v5, 0x4

    goto :goto_232

    :cond_231
    const/4 v5, 0x0

    .line 43
    :goto_232
    sget-object p1, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    const-string v1, "NgiJk;N7nJ1;Ldm\u001d4=\u001bjg\u001d7>\u001a0;\u001ccf\u001d6oLbg\u001afgO1;\u001e4j\u001a4jO`:@e=\u001e7;MdmMelI"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 44
    invoke-interface {p1, v1, v7}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 45
    sget-object v1, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 46
    move-object v2, v1

    check-cast v2, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {v2}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->かちして〹づ()Ljava/lang/String;

    move-result-object v2

    check-cast v1, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {v1, v2}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->く〱なおぎ(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    aget-object v1, v1, v3

    invoke-static {v1}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_274

    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_274

    .line 47
    :try_start_25f
    sget-object v1, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 48
    move-object v2, v1

    check-cast v2, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {v2}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->かちして〹づ()Ljava/lang/String;

    move-result-object v2

    check-cast v1, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {v1, v2}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->く〱なおぎ(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x1a

    aget-object p1, v1, v2
    :try_end_272
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_25f .. :try_end_272} :catch_273

    goto :goto_274

    :catch_273
    nop

    :cond_274
    :goto_274
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_28a

    .line 49
    sget-object p1, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    const-string v1, "Oj=Okk\u001c0g\u001eg9\u001bjfN7>\u001bdj@e;Acf\u001dj>J7"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 50
    invoke-interface {p1, v1, v7}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    :cond_28a
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->なぶひせが:Landroid/widget/EditText;

    invoke-virtual {v2}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "\u001e0k\u0019k;MfhAa<Mg:IcnJaoI3f\u001b1jM1lM`"

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v9, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->どぇぞほだ:Landroid/widget/EditText;

    invoke-virtual {v9}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v9, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->ぇとしたべど:Landroid/widget/CheckBox;

    invoke-virtual {v9}, Landroid/widget/CheckBox;->isChecked()Z

    move-result v9

    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v9, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->げがぴうあだ:Landroid/widget/CheckBox;

    invoke-virtual {v9}, Landroid/widget/CheckBox;->isChecked()Z

    move-result v9

    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v9, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->ながふずは:Landroid/widget/CheckBox;

    invoke-virtual {v9}, Landroid/widget/CheckBox;->isChecked()Z

    move-result v9

    if-eqz v9, :cond_2dc

    iget-object v9, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->せだてはぺて:Ljava/lang/String;

    goto :goto_2e6

    :cond_2dc
    const-string v9, "Ae:MdhKa>\u001cbg\u001cd:Ogf\u00190kAkjKbm\u0019ajHa"

    invoke-static {v9}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    :goto_2e6
    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v9, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->ぃぜぶの〸ぃ:Landroid/widget/CheckBox;

    invoke-virtual {v9}, Landroid/widget/CheckBox;->isChecked()Z

    move-result v9

    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v9, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->ぺづげぺが:Landroid/widget/EditText;

    invoke-virtual {v9}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v9

    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v9, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->びちづぼぬ:Ljava/lang/String;

    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v9, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->ておぞぞはね:Landroid/widget/CheckBox;

    invoke-virtual {v9}, Landroid/widget/CheckBox;->isChecked()Z

    move-result v9

    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v9, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->ち〴みぎ〻び:Landroid/widget/CheckBox;

    invoke-virtual {v9}, Landroid/widget/CheckBox;->isChecked()Z

    move-result v9

    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v9, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->ぉねぞはがぞ:Ljava/lang/String;

    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v9, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->にぢ〱ぁな:Ljava/lang/String;

    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v9, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->せづっ〸ちね:Landroid/widget/EditText;

    invoke-virtual {v9}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    sget-object v9, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    const-string v10, "\u001bcf\u001edgA0l\u001ddjOfi\u001c7k\u001djn\u001dcn\u0019k9\u001c7l\u001dd"

    invoke-static {v10}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    .line 52
    invoke-interface {v9, v10, v6}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v9

    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v9, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->ぷぞてのほき:Landroid/widget/EditText;

    invoke-virtual {v9}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v9, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->〺でおいここ:Landroid/widget/CheckBox;

    invoke-virtual {v9}, Landroid/widget/CheckBox;->isChecked()Z

    move-result v9

    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v9, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->えがぐせほち:Landroid/widget/CheckBox;

    invoke-virtual {v9}, Landroid/widget/CheckBox;->isChecked()Z

    move-result v9

    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v9, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->けときぜと:Landroid/widget/EditText;

    invoke-virtual {v9}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v9

    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v9, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->じぜこほぱ:Landroid/widget/EditText;

    invoke-virtual {v9}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v9

    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v9, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->ばおぢでぎか:Landroid/widget/CheckBox;

    invoke-virtual {v9}, Landroid/widget/CheckBox;->isChecked()Z

    move-result v9

    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v5, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->ごまけがぢは:Landroid/widget/CheckBox;

    invoke-virtual {v5}, Landroid/widget/CheckBox;->isChecked()Z

    move-result v5

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v5, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->おかぷせ〱:Landroid/widget/EditText;

    invoke-virtual {v5}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v5

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v5, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->こ〲しでおか:Landroid/widget/CheckBox;

    invoke-virtual {v5}, Landroid/widget/CheckBox;->isChecked()Z

    move-result v5

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v5, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->ぺがぅす〹ち:Landroid/widget/CheckBox;

    invoke-virtual {v5}, Landroid/widget/CheckBox;->isChecked()Z

    move-result v5

    if-eqz v5, :cond_42a

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 53
    sget-object v9, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    const-string v10, "H0f\u001ae9Oe:N6:\u001djm\u001cknMaiMjgId;N7k\u001e4"

    invoke-static {v10}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    .line 54
    invoke-interface {v9, v10, v7}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v5, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v9, "J0:\u001acm\u001aa=\u001bkkO6kK7n\u001bdn\u001c6=Aa;La:A3"

    invoke-static {v9}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v5, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    sget-object v10, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    const-string v11, "M0nN3:@3mAeo\u001ed:O0>Idf\u001cg<Hfm\u001dg=H3:Mj>\u001e7gLgnI`l\u001bamA4jH4<N3<Hf<H7iO"

    invoke-static {v11}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    invoke-static {v11}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    .line 56
    invoke-interface {v10, v11, v7}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v5, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    sget-object v9, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    const-string v10, "KfkJjl\u001cd>\u001c4kI1h\u001d3fJc:Kki\u001behM7=\u001e6"

    invoke-static {v10}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    .line 58
    invoke-interface {v9, v10, v7}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    :cond_42a
    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    sget-object v5, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    const-string v7, "\u001a3h\u001ado@6iAch\u001bbl\u001ab>Oa9Lj:Je;\u0019jfK3"

    invoke-static {v7}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 60
    invoke-interface {v5, v7, v8}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v5

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->きぬどぼみ〸:Ljava/lang/String;

    .line 61
    sget-object p1, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    .line 62
    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    iget-object v1, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->のね〱ばぁぢ:Landroid/widget/CheckBox;

    const-string v2, "MakJ3nIkk\u001eb:A3<\u001adnO0fJ`oLfj\u001bg:\u001ed"

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, p1, v2}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ざとぅぼこ〺(Landroid/widget/CheckBox;Landroid/content/SharedPreferences$Editor;Ljava/lang/String;)V

    iget-object p1, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->な〱ちぉじ:Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result p1

    const/high16 v1, -0x10000

    if-eqz p1, :cond_47c

    const-string p1, "\u00197<K1m\u001eahHb9J4j\u001e1:Hk=H1o@a:O0gIfkMclA6nK6:OagJ0:Nfo\u001cfh\u001cch\u001ea<@3=\u001c"

    invoke-static {p1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1, v1}, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->げがぴうあだ(Ljava/lang/String;I)V

    return-void

    :cond_47c
    new-instance p1, Ljava/io/File;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object v5

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    sget-object v5, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const v5, 0x7f110052

    invoke-virtual {p0, v5}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {p1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->〱かけばぜぐ:Ljava/io/File;

    new-instance p1, Ljava/io/File;

    invoke-virtual {p0, v5}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/os/Environment;->getExternalStoragePublicDirectory(Ljava/lang/String;)Ljava/io/File;

    move-result-object v2

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v7, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->な〱ちぉじ:Ljava/lang/String;

    const-string v9, "\u001b3;M`iM0n@1j\u001df=O6iK7:M1gAj;Ib<\u0019g"

    invoke-static {v9}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-static {v5, v7, v9}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->なぎぱいぢぎ(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-direct {p1, v2, v5}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    iput-object p1, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->ぎきぁ〱ぢ:Ljava/io/File;

    const-string p1, "\u001d7jN6;\u0019elM6m\u00190mNa=I`l\u00196<\u001da<\u001b09\u001ck:JjoH6n\u001cc:HemN1:\u0019g9Jcn\u001c1l\u001c`=K`>M`n\u001dd=\u001e4oL7;JboLff\u00193l\u001ekkLbn\u001c7=K`="

    invoke-static {p1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, p1}, Lづざかべべ/〳ぜぞぜべっ/なぎぱいぢぎ/げつ〴ぬぐ;->げつ〴ぬぐ(Landroid/content/Context;Ljava/lang/String;)I

    move-result v2

    if-eqz v2, :cond_4d8

    const/4 v2, 0x1

    goto :goto_4d9

    :cond_4d8
    const/4 v2, 0x0

    :goto_4d9
    iput-boolean v2, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->へえどぜせ:Z

    const-string v2, "\u001d7jN6;\u0019elM6m\u00190mNa=I`l\u00196<\u001da<\u001b09\u001ckfL1h\u001abj\u001cb>J3;\u001b0>HffN`o\u001c1=Kj9\u001b4k@kfIk>M1:\u001denJgmAbfO6nId>M09MdhN6j"

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {p0, v2}, Lづざかべべ/〳ぜぞぜべっ/なぎぱいぢぎ/げつ〴ぬぐ;->げつ〴ぬぐ(Landroid/content/Context;Ljava/lang/String;)I

    move-result v5

    if-eqz v5, :cond_4ed

    const/4 v5, 0x1

    goto :goto_4ee

    :cond_4ed
    const/4 v5, 0x0

    :goto_4ee
    iput-boolean v5, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->ぅばづそほせ:Z

    sget v7, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v9, 0x17

    if-lt v7, v9, :cond_508

    iget-boolean v7, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->へえどぜせ:Z

    if-nez v7, :cond_4fc

    if-eqz v5, :cond_508

    :cond_4fc
    new-array v0, v3, [Ljava/lang/String;

    aput-object v2, v0, v8

    aput-object p1, v0, v6

    const/16 p1, 0x781

    invoke-virtual {p0, v0, p1}, Landroid/app/Activity;->requestPermissions([Ljava/lang/String;I)V

    return-void

    :cond_508
    iget-object p1, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->〱かけばぜぐ:Ljava/io/File;

    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    move-result p1

    if-nez p1, :cond_529

    iget-object p1, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->〱かけばぜぐ:Ljava/io/File;

    invoke-virtual {p1}, Ljava/io/File;->mkdirs()Z

    move-result p1

    if-eqz p1, :cond_519

    goto :goto_529

    :cond_519
    new-instance p1, Ljava/lang/RuntimeException;

    const-string v0, "@jnNgn\u001d4>\u001b7=\u0019c=Ak<J1l\u001ek<I`mLejI4gK3oOeoLk9Hk=\u001a69Lc<\u001e6:\u001d3jH0i\u001a3>\u001c"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_529
    :goto_529
    :try_start_529
    iget-object p1, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->ぎきぁ〱ぢ:Ljava/io/File;

    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    move-result p1

    if-eqz p1, :cond_580

    new-instance p1, Lづざかべべ/〺つふすそ/ぺふねづ〺/ぺぁあねじ$げつ〴ぬぐ;

    const v0, 0x7f1200f1

    invoke-direct {p1, p0, v0}, Lづざかべべ/〺つふすそ/ぺふねづ〺/ぺぁあねじ$げつ〴ぬぐ;-><init>(Landroid/content/Context;I)V

    const-string v0, "\u0019k:\u00197o\u001dklLafL`f\u001ae:LjoJfg\u001939O6;\u001dk"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 63
    iget-object v2, p1, Lづざかべべ/〺つふすそ/ぺふねづ〺/ぺぁあねじ$げつ〴ぬぐ;->げつ〴ぬぐ:Landroidx/appcompat/app/AlertController$〺つふすそ;

    iput-object v0, v2, Landroidx/appcompat/app/AlertController$〺つふすそ;->びぐびあび:Ljava/lang/CharSequence;

    const-string v0, "\u001e7=Ial\u001c3iM1mNf=H1g\u0019cfI3>JegOklKgmJ7=\u001d3=@6=@djIb<\u001eb9\u001cjnL4>NajNdiH"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 64
    iput-object v0, v2, Landroidx/appcompat/app/AlertController$〺つふすそ;->なぎぱいぢぎ:Ljava/lang/CharSequence;

    .line 65
    iput-boolean v8, v2, Landroidx/appcompat/app/AlertController$〺つふすそ;->ぺふねづ〺:Z

    const-string v0, "J0o@flIc=I1<N6mAe=Hao\u001dj;Hk9\u001d7hL0"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 66
    new-instance v3, Lteam/dev/epro/apkcustom/dialogs/RequestBlock$びぐびあび;

    invoke-direct {v3, p0}, Lteam/dev/epro/apkcustom/dialogs/RequestBlock$びぐびあび;-><init>(Lteam/dev/epro/apkcustom/dialogs/RequestBlock;)V

    .line 67
    iput-object v0, v2, Landroidx/appcompat/app/AlertController$〺つふすそ;->ぁごぐすすぃ:Ljava/lang/CharSequence;

    iput-object v3, v2, Landroidx/appcompat/app/AlertController$〺つふすそ;->〳ぜぞぜべっ:Landroid/content/DialogInterface$OnClickListener;

    const-string v0, "M6gJd:O3iAeiJ6hH3lOfmIaoJ`n\u001a`h\u001e7"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 68
    new-instance v3, Lteam/dev/epro/apkcustom/dialogs/RequestBlock$くし〴〺ぅ;

    invoke-direct {v3, p0}, Lteam/dev/epro/apkcustom/dialogs/RequestBlock$くし〴〺ぅ;-><init>(Lteam/dev/epro/apkcustom/dialogs/RequestBlock;)V

    .line 69
    iput-object v0, v2, Landroidx/appcompat/app/AlertController$〺つふすそ;->ぺぁあねじ:Ljava/lang/CharSequence;

    iput-object v3, v2, Landroidx/appcompat/app/AlertController$〺つふすそ;->いいにぽつ:Landroid/content/DialogInterface$OnClickListener;

    .line 70
    invoke-virtual {p1}, Lづざかべべ/〺つふすそ/ぺふねづ〺/ぺぁあねじ$げつ〴ぬぐ;->びぐびあび()Lづざかべべ/〺つふすそ/ぺふねづ〺/ぺぁあねじ;

    goto/16 :goto_6bf

    :cond_580
    iget-object p1, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->ぎきぁ〱ぢ:Ljava/io/File;

    invoke-virtual {p1}, Ljava/io/File;->createNewFile()Z

    move-result p1

    if-eqz p1, :cond_5af

    .line 71
    sget-object p1, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 72
    iget-object v2, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->ぎきぁ〱ぢ:Ljava/io/File;

    iget-object v3, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->きぬどぼみ〸:Ljava/lang/String;

    check-cast p1, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {p1, v2, v3}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->ずまげせび〳(Ljava/io/File;Ljava/lang/String;)V

    const p1, 0x7f110312

    invoke-virtual {p0, p1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object p1

    new-array v2, v6, [Ljava/lang/Object;

    iget-object v3, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->ぎきぁ〱ぢ:Ljava/io/File;

    aput-object v3, v2, v8

    invoke-static {p1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1, v0}, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->げがぴうあだ(Ljava/lang/String;I)V

    invoke-virtual {p0, v4}, Landroid/app/Activity;->setResult(I)V

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    goto/16 :goto_6bf

    :cond_5af
    new-instance p1, Ljava/lang/RuntimeException;

    const-string v0, "\u001ebgO3i\u001a`;\u001bko\u001aj9Nd;Oao\u001a6h\u001b6kN3>Kk;IejN0nOjlN0=I4lO7j\u001abh\u001c3;\u001e4h\u001cf;\u0019"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_5bf
    .catch Ljava/lang/Exception; {:try_start_529 .. :try_end_5bf} :catch_5bf

    :catch_5bf
    const p1, 0x7f110108

    invoke-virtual {p0, p1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1, v1}, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->げがぴうあだ(Ljava/lang/String;I)V

    goto/16 :goto_6bf

    :sswitch_5cb
    iget-object p1, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->くぎぶ〼のそ:Landroid/widget/Button;

    invoke-virtual {p1}, Landroid/widget/Button;->getText()Ljava/lang/CharSequence;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "Mcm\u001bf<HkiL0nHkgLjhL4j\u001bk>\u001de;\u0019bjMf"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_6bc

    .line 73
    sget-object p1, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    .line 74
    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    new-instance v0, Ljava/lang/String;

    .line 75
    sget-object v1, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 76
    check-cast v1, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {v1, v5, v3}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->な〱ちぉじ(II)[B

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/String;-><init>([B)V

    iget-object v1, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->ぉひのべい:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->commit()Z

    goto/16 :goto_6bc

    :sswitch_60b
    invoke-virtual {p0}, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->ぷぞてのほき()V

    .line 77
    sget-object p1, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    .line 78
    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    new-instance v1, Ljava/lang/String;

    .line 79
    sget-object v2, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 80
    check-cast v2, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {v2, v5, v8}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->な〱ちぉじ(II)[B

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/String;-><init>([B)V

    invoke-interface {p1, v1, v7}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->commit()Z

    iget-object p1, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->しぷげへが:Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_6b9

    const-string p1, "JekHd:\u001adj\u0019g:\u0019k9@e<LkmAg9L4=H4;@e:\u001df9I7mOf=M0=\u00193mKdm\u001c`9\u001ed:\u001ccgLchL"

    invoke-static {p1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1, v0}, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->げがぴうあだ(Ljava/lang/String;I)V

    goto :goto_6b9

    :sswitch_63e
    iget-object p1, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->へぼ〳〻び:Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_648

    iput-object v2, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->へぼ〳〻び:Ljava/lang/String;

    .line 81
    :cond_648
    sget-object p1, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    .line 82
    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    iget-object v0, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->へぼ〳〻び:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_657

    goto :goto_659

    :cond_657
    iget-object v2, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->へぼ〳〻び:Ljava/lang/String;

    :goto_659
    const-string v0, "M`i\u001b7nNkmN0kOemM3>O0hHjk\u001d4l@4iOf"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0, v2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->commit()Z

    goto :goto_6b9

    :sswitch_66b
    invoke-virtual {p0}, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->ぷぞてのほき()V

    .line 83
    sget-object p1, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    .line 84
    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    new-instance v0, Ljava/lang/String;

    .line 85
    sget-object v2, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 86
    check-cast v2, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {v2, v5, v8}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->な〱ちぉじ(II)[B

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/lang/String;-><init>([B)V

    invoke-interface {p1, v0, v7}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->commit()Z

    iget-object p1, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->のびぶけせ:Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_6aa

    .line 87
    sget-object p1, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    .line 88
    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    new-instance v0, Ljava/lang/String;

    .line 89
    sget-object v2, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 90
    check-cast v2, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {v2, v5, v6}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->な〱ちぉじ(II)[B

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/lang/String;-><init>([B)V

    invoke-interface {p1, v0, v1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 91
    :cond_6aa
    sget-object p1, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    const-string v0, "Hef\u001cj<Jc>L3f\u001eblJ7lA1>@dfK`;\u001akf\u001d6"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 92
    invoke-static {p1, v0, v6}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぇぬぎばつ(Landroid/content/SharedPreferences;Ljava/lang/String;Z)V

    :cond_6b9
    :goto_6b9
    invoke-virtual {p0, v4}, Landroid/app/Activity;->setResult(I)V

    .line 93
    :cond_6bc
    :goto_6bc
    :sswitch_6bc
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    :goto_6bf
    return-void

    :sswitch_data_6c0
    .sparse-switch
        0x7f09007e -> :sswitch_66b
        0x7f09007f -> :sswitch_63e
        0x7f090080 -> :sswitch_60b
        0x7f090082 -> :sswitch_5cb
        0x7f090084 -> :sswitch_8e
        0x7f0900b8 -> :sswitch_6bc
    .end sparse-switch
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .registers 3

    invoke-super {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->onCreate(Landroid/os/Bundle;)V

    const p1, 0x7f0c0023

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->setContentView(I)V

    const p1, 0x7f090169

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/LinearLayout;

    iput-object p1, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->ぉざぅち〻:Landroid/widget/LinearLayout;

    const p1, 0x7f09016a

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/LinearLayout;

    iput-object p1, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->ざとぅぼこ〺:Landroid/widget/LinearLayout;

    const p1, 0x7f090168

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/LinearLayout;

    iput-object p1, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->は〲ぱなで:Landroid/widget/LinearLayout;

    const p1, 0x7f09016b

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/LinearLayout;

    iput-object p1, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->ごづごきえ:Landroid/widget/LinearLayout;

    const p1, 0x7f090164

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/LinearLayout;

    iput-object p1, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->ざっざへづ:Landroid/widget/LinearLayout;

    const p1, 0x7f0901c0

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->〴ねぷぐくぼ:Landroid/widget/TextView;

    const p1, 0x7f090292

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->はつきどっ:Landroid/widget/TextView;

    invoke-virtual {p0}, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->〺でおいここ()V

    const p1, 0x7f0900b8

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    iput-object p1, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->びえぁぜい:Landroid/widget/ImageView;

    const p1, 0x7f09026e

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/EditText;

    iput-object p1, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->なぶひせが:Landroid/widget/EditText;

    const p1, 0x7f090270

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/EditText;

    iput-object p1, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->どぇぞほだ:Landroid/widget/EditText;

    const p1, 0x7f090271

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/EditText;

    iput-object p1, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->ぉひのべい:Landroid/widget/EditText;

    const p1, 0x7f090272

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/EditText;

    iput-object p1, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->せづっ〸ちね:Landroid/widget/EditText;

    const p1, 0x7f090262

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/EditText;

    iput-object p1, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->ぷぞてのほき:Landroid/widget/EditText;

    const p1, 0x7f090265

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/EditText;

    iput-object p1, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->ぅみぱぎぎ:Landroid/widget/EditText;

    const p1, 0x7f09009c

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/CheckBox;

    iput-object p1, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->〺でおいここ:Landroid/widget/CheckBox;

    const p1, 0x7f09009b

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/CheckBox;

    iput-object p1, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->ぇとしたべど:Landroid/widget/CheckBox;

    const p1, 0x7f0900a0

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/CheckBox;

    iput-object p1, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->げがぴうあだ:Landroid/widget/CheckBox;

    const p1, 0x7f09008a

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/CheckBox;

    iput-object p1, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->こ〲しでおか:Landroid/widget/CheckBox;

    const p1, 0x7f09008c

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/CheckBox;

    iput-object p1, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->ぺがぅす〹ち:Landroid/widget/CheckBox;

    const p1, 0x7f09008d

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/CheckBox;

    iput-object p1, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->のね〱ばぁぢ:Landroid/widget/CheckBox;

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/widget/CheckBox;->setVisibility(I)V

    const p1, 0x7f090099

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/CheckBox;

    iput-object p1, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->ながふずは:Landroid/widget/CheckBox;

    const p1, 0x7f09009e

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/CheckBox;

    iput-object p1, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->ぃぜぶの〸ぃ:Landroid/widget/CheckBox;

    const p1, 0x7f09009a

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/CheckBox;

    iput-object p1, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->えがぐせほち:Landroid/widget/CheckBox;

    const p1, 0x7f09008b

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/CheckBox;

    iput-object p1, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->ごまけがぢは:Landroid/widget/CheckBox;

    const p1, 0x7f090098

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/CheckBox;

    iput-object p1, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->ておぞぞはね:Landroid/widget/CheckBox;

    const p1, 0x7f09009f

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/CheckBox;

    iput-object p1, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->ち〴みぎ〻び:Landroid/widget/CheckBox;

    const p1, 0x7f09009d

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/CheckBox;

    iput-object p1, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->ばおぢでぎか:Landroid/widget/CheckBox;

    const p1, 0x7f0901e4

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/google/android/material/textfield/TextInputLayout;

    iput-object p1, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->でどあくず:Lcom/google/android/material/textfield/TextInputLayout;

    const p1, 0x7f0901bf

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/google/android/material/textfield/TextInputLayout;

    iput-object p1, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->ぶでにく〼〳:Lcom/google/android/material/textfield/TextInputLayout;

    const p1, 0x7f090147

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/google/android/material/textfield/TextInputLayout;

    iput-object p1, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->ぉ〲なぱぽた:Lcom/google/android/material/textfield/TextInputLayout;

    const p1, 0x7f0901d8

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/google/android/material/textfield/TextInputLayout;

    iput-object p1, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->ぇ〳〲〺すっ:Lcom/google/android/material/textfield/TextInputLayout;

    const p1, 0x7f09026b

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/google/android/material/textfield/TextInputLayout;

    iput-object p1, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->〻ぞまぎな〻:Lcom/google/android/material/textfield/TextInputLayout;

    const p1, 0x7f0901e3

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/EditText;

    iput-object p1, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->じぜこほぱ:Landroid/widget/EditText;

    const p1, 0x7f0901be

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/EditText;

    iput-object p1, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->ぺづげぺが:Landroid/widget/EditText;

    const p1, 0x7f090146

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/EditText;

    iput-object p1, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->けときぜと:Landroid/widget/EditText;

    const p1, 0x7f0901d7

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/EditText;

    iput-object p1, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->おかぷせ〱:Landroid/widget/EditText;

    const p1, 0x7f09007e

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/Button;

    iput-object p1, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->くねねぱす〻:Landroid/widget/Button;

    const p1, 0x7f090084

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/Button;

    iput-object p1, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->〱こか〺ぃせ:Landroid/widget/Button;

    const p1, 0x7f090082

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/Button;

    iput-object p1, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->くぎぶ〼のそ:Landroid/widget/Button;

    const p1, 0x7f090080

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/Button;

    iput-object p1, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->ずまげせび〳:Landroid/widget/Button;

    const p1, 0x7f09007f

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/Button;

    iput-object p1, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->かづげぃぁ〺:Landroid/widget/Button;

    iget-object p1, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->びえぁぜい:Landroid/widget/ImageView;

    invoke-virtual {p1, p0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object p1, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->くねねぱす〻:Landroid/widget/Button;

    invoke-virtual {p1, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object p1, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->〱こか〺ぃせ:Landroid/widget/Button;

    invoke-virtual {p1, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object p1, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->くぎぶ〼のそ:Landroid/widget/Button;

    invoke-virtual {p1, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object p1, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->ずまげせび〳:Landroid/widget/Button;

    invoke-virtual {p1, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object p1, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->かづげぃぁ〺:Landroid/widget/Button;

    invoke-virtual {p1, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public onPause()V
    .registers 4

    .line 1
    sget-object v0, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    .line 2
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    iget-object v1, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->じぜこほぱ:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "\u001cj>\u001a0=\u001d3iKdmLjmNkkNbjAdkKahO0;\u001b7"

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v2, v1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 3
    sget-object v0, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    .line 4
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    iget-object v1, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->ぺづげぺが:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "@gk\u0019agM3oM6iHcj\u001aei@`fL7jA1n\u001ejo\u001af"

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v2, v1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    invoke-super {p0}, Landroidx/fragment/app/FragmentActivity;->onPause()V

    return-void
.end method

.method public onRequestPermissionsResult(I[Ljava/lang/String;[I)V
    .registers 6

    invoke-super {p0, p1, p2, p3}, Landroidx/fragment/app/FragmentActivity;->onRequestPermissionsResult(I[Ljava/lang/String;[I)V

    const/16 p2, 0x781

    if-eq p1, p2, :cond_9

    goto/16 :goto_da

    :cond_9
    array-length p1, p3

    const/high16 p2, -0x10000

    if-lez p1, :cond_d0

    const/4 p1, 0x0

    aget p3, p3, p1

    if-nez p3, :cond_d0

    iget-object p3, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->〱かけばぜぐ:Ljava/io/File;

    invoke-virtual {p3}, Ljava/io/File;->exists()Z

    move-result p3

    if-nez p3, :cond_34

    iget-object p3, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->〱かけばぜぐ:Ljava/io/File;

    invoke-virtual {p3}, Ljava/io/File;->mkdirs()Z

    move-result p3

    if-eqz p3, :cond_24

    goto :goto_34

    :cond_24
    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "@jnNgn\u001d4>\u001b7=\u0019c=Ak<J1l\u001ek<I`mLejI4gK3oOeoLk9Hk=\u001a69Lc<\u001e6:\u001d3jH0i\u001a3>\u001c"

    invoke-static {p2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_34
    :goto_34
    :try_start_34
    iget-object p3, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->ぎきぁ〱ぢ:Ljava/io/File;

    invoke-virtual {p3}, Ljava/io/File;->exists()Z

    move-result p3

    if-eqz p3, :cond_8a

    new-instance p3, Lづざかべべ/〺つふすそ/ぺふねづ〺/ぺぁあねじ$げつ〴ぬぐ;

    const v0, 0x7f1200f1

    invoke-direct {p3, p0, v0}, Lづざかべべ/〺つふすそ/ぺふねづ〺/ぺぁあねじ$げつ〴ぬぐ;-><init>(Landroid/content/Context;I)V

    const-string v0, "\u0019k:\u00197o\u001dklLafL`f\u001ae:LjoJfg\u001939O6;\u001dk"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 1
    iget-object v1, p3, Lづざかべべ/〺つふすそ/ぺふねづ〺/ぺぁあねじ$げつ〴ぬぐ;->げつ〴ぬぐ:Landroidx/appcompat/app/AlertController$〺つふすそ;

    iput-object v0, v1, Landroidx/appcompat/app/AlertController$〺つふすそ;->びぐびあび:Ljava/lang/CharSequence;

    const-string v0, "\u001e7=Ial\u001c3iM1mNf=H1g\u0019cfI3>JegOklKgmJ7=\u001d3=@6=@djIb<\u001eb9\u001cjnL4>NajNdiH"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 2
    iput-object v0, v1, Landroidx/appcompat/app/AlertController$〺つふすそ;->なぎぱいぢぎ:Ljava/lang/CharSequence;

    .line 3
    iput-boolean p1, v1, Landroidx/appcompat/app/AlertController$〺つふすそ;->ぺふねづ〺:Z

    const-string p1, "J0o@flIc=I1<N6mAe=Hao\u001dj;Hk9\u001d7hL0"

    invoke-static {p1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 4
    new-instance v0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock$なぎぱいぢぎ;

    invoke-direct {v0, p0}, Lteam/dev/epro/apkcustom/dialogs/RequestBlock$なぎぱいぢぎ;-><init>(Lteam/dev/epro/apkcustom/dialogs/RequestBlock;)V

    .line 5
    iput-object p1, v1, Landroidx/appcompat/app/AlertController$〺つふすそ;->ぁごぐすすぃ:Ljava/lang/CharSequence;

    iput-object v0, v1, Landroidx/appcompat/app/AlertController$〺つふすそ;->〳ぜぞぜべっ:Landroid/content/DialogInterface$OnClickListener;

    const-string p1, "M6gJd:O3iAeiJ6hH3lOfmIaoJ`n\u001a`h\u001e7"

    invoke-static {p1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 6
    new-instance v0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock$づざかべべ;

    invoke-direct {v0, p0}, Lteam/dev/epro/apkcustom/dialogs/RequestBlock$づざかべべ;-><init>(Lteam/dev/epro/apkcustom/dialogs/RequestBlock;)V

    .line 7
    iput-object p1, v1, Landroidx/appcompat/app/AlertController$〺つふすそ;->ぺぁあねじ:Ljava/lang/CharSequence;

    iput-object v0, v1, Landroidx/appcompat/app/AlertController$〺つふすそ;->いいにぽつ:Landroid/content/DialogInterface$OnClickListener;

    .line 8
    invoke-virtual {p3}, Lづざかべべ/〺つふすそ/ぺふねづ〺/ぺぁあねじ$げつ〴ぬぐ;->びぐびあび()Lづざかべべ/〺つふすそ/ぺふねづ〺/ぺぁあねじ;

    goto :goto_da

    :cond_8a
    iget-object p3, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->ぎきぁ〱ぢ:Ljava/io/File;

    invoke-virtual {p3}, Ljava/io/File;->createNewFile()Z

    move-result p3

    if-eqz p3, :cond_bc

    .line 9
    sget-object p3, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 10
    iget-object v0, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->ぎきぁ〱ぢ:Ljava/io/File;

    iget-object v1, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->きぬどぼみ〸:Ljava/lang/String;

    check-cast p3, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {p3, v0, v1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->ずまげせび〳(Ljava/io/File;Ljava/lang/String;)V

    const p3, 0x7f110312

    invoke-virtual {p0, p3}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object p3

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    iget-object v1, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->ぎきぁ〱ぢ:Ljava/io/File;

    aput-object v1, v0, p1

    invoke-static {p3, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const/16 p3, -0x100

    invoke-virtual {p0, p1, p3}, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->げがぴうあだ(Ljava/lang/String;I)V

    const/4 p1, -0x1

    invoke-virtual {p0, p1}, Landroid/app/Activity;->setResult(I)V

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    goto :goto_da

    :cond_bc
    new-instance p1, Ljava/lang/RuntimeException;

    const-string p3, "\u001ebgO3i\u001a`;\u001bko\u001aj9Nd;Oao\u001a6h\u001b6kN3>Kk;IejN0nOjlN0=I4lO7j\u001abh\u001c3;\u001e4h\u001cf;\u0019"

    invoke-static {p3}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    invoke-static {p3}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    invoke-direct {p1, p3}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_cc
    .catch Ljava/lang/Exception; {:try_start_34 .. :try_end_cc} :catch_cc

    :catch_cc
    const p1, 0x7f110108

    goto :goto_d3

    :cond_d0
    const p1, 0x7f110236

    :goto_d3
    invoke-virtual {p0, p1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1, p2}, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->げがぴうあだ(Ljava/lang/String;I)V

    :goto_da
    return-void
.end method

.method public onResume()V
    .registers 5

    invoke-super {p0}, Landroidx/fragment/app/FragmentActivity;->onResume()V

    iget-object v0, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->じぜこほぱ:Landroid/widget/EditText;

    .line 1
    sget-object v1, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    const-string v2, "\u001cj>\u001a0=\u001d3iKdmLjmNkkNbjAdkKahO0;\u001b7"

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, ""

    .line 2
    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->ぺづげぺが:Landroid/widget/EditText;

    .line 3
    sget-object v1, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    const-string v2, "@gk\u0019agM3oM6iHcj\u001aei@`fL7jA1n\u001ejo\u001af"

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 4
    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v0

    if-eqz v0, :cond_e1

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "NdmJ4h\u0019`iHdlAdm\u001cchOfoJggKdf\u001d7<Ij"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->がぐくいおす:Ljava/lang/String;

    const-string v1, "KjmA6hM7>JjkA`nH3=\u001bj<Lan\u001b6mKfh\u00190"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    const/16 v2, 0x8

    if-eqz v0, :cond_8d

    .line 5
    iget-object v0, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->はつきどっ:Landroid/widget/TextView;

    const-string v3, "\u001a`>@1m@gf\u001d`9@jlO7m\u0019f=\u001e6nL1i\u001a3nOj"

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->ぉざぅち〻:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->setVisibility(I)V

    iget-object v0, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->ざとぅぼこ〺:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    iget-object v0, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->は〲ぱなで:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->setVisibility(I)V

    iget-object v0, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->ごづごきえ:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->setVisibility(I)V

    iget-object v0, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->ざっざへづ:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->setVisibility(I)V

    goto :goto_e1

    .line 6
    :cond_8d
    iget-object v0, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->がぐくいおす:Ljava/lang/String;

    const-string v3, "Id>Agh\u001eb:\u001dk9Mf:Jgi@c9\u001bflI7kJdl\u0019f"

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_a3

    invoke-virtual {p0}, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->〺でおいここ()V

    goto :goto_e1

    :cond_a3
    iget-object v0, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->がぐくいおす:Ljava/lang/String;

    const-string v3, "M`i\u001b7nNkmN0kOemM3>O0hHjk\u001d4l@4iOf"

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_b9

    invoke-virtual {p0}, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->けときぜと()V

    goto :goto_e1

    .line 7
    :cond_b9
    iget-object v0, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->はつきどっ:Landroid/widget/TextView;

    const-string v3, "L0nNknIbkH0jJgnAjj\u001beoAjmHa<\u001dgiHa"

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->ぉざぅち〻:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->setVisibility(I)V

    iget-object v0, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->ざとぅぼこ〺:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->setVisibility(I)V

    iget-object v0, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->は〲ぱなで:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->setVisibility(I)V

    iget-object v0, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->ごづごきえ:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    iget-object v0, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->ざっざへづ:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 8
    :cond_e1
    :goto_e1
    :try_start_e1
    sget-object v0, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 9
    check-cast v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {v0}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->かちして〹づ()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->ぇとしたべど(Ljava/lang/String;)V
    :try_end_ec
    .catch Ljava/lang/Exception; {:try_start_e1 .. :try_end_ec} :catch_ec

    :catch_ec
    iget-object v0, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->ぃぜぶの〸ぃ:Landroid/widget/CheckBox;

    new-instance v1, Lteam/dev/epro/apkcustom/dialogs/RequestBlock$ぁごぐすすぃ;

    invoke-direct {v1, p0}, Lteam/dev/epro/apkcustom/dialogs/RequestBlock$ぁごぐすすぃ;-><init>(Lteam/dev/epro/apkcustom/dialogs/RequestBlock;)V

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    iget-object v0, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->えがぐせほち:Landroid/widget/CheckBox;

    new-instance v1, Lteam/dev/epro/apkcustom/dialogs/RequestBlock$〳ぜぞぜべっ;

    invoke-direct {v1, p0}, Lteam/dev/epro/apkcustom/dialogs/RequestBlock$〳ぜぞぜべっ;-><init>(Lteam/dev/epro/apkcustom/dialogs/RequestBlock;)V

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    iget-object v0, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->ごまけがぢは:Landroid/widget/CheckBox;

    new-instance v1, Lteam/dev/epro/apkcustom/dialogs/RequestBlock$ぺぁあねじ;

    invoke-direct {v1, p0}, Lteam/dev/epro/apkcustom/dialogs/RequestBlock$ぺぁあねじ;-><init>(Lteam/dev/epro/apkcustom/dialogs/RequestBlock;)V

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    iget-object v0, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->ぇとしたべど:Landroid/widget/CheckBox;

    new-instance v1, Lteam/dev/epro/apkcustom/dialogs/RequestBlock$いいにぽつ;

    invoke-direct {v1, p0}, Lteam/dev/epro/apkcustom/dialogs/RequestBlock$いいにぽつ;-><init>(Lteam/dev/epro/apkcustom/dialogs/RequestBlock;)V

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    iget-object v0, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->〺でおいここ:Landroid/widget/CheckBox;

    new-instance v1, Lteam/dev/epro/apkcustom/dialogs/RequestBlock$ぺふねづ〺;

    invoke-direct {v1, p0}, Lteam/dev/epro/apkcustom/dialogs/RequestBlock$ぺふねづ〺;-><init>(Lteam/dev/epro/apkcustom/dialogs/RequestBlock;)V

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    iget-object v0, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->ち〴みぎ〻び:Landroid/widget/CheckBox;

    new-instance v1, Lteam/dev/epro/apkcustom/dialogs/RequestBlock$てぜきぽく;

    invoke-direct {v1, p0}, Lteam/dev/epro/apkcustom/dialogs/RequestBlock$てぜきぽく;-><init>(Lteam/dev/epro/apkcustom/dialogs/RequestBlock;)V

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    iget-object v0, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->ておぞぞはね:Landroid/widget/CheckBox;

    new-instance v1, Lteam/dev/epro/apkcustom/dialogs/RequestBlock$のぷのちつ;

    invoke-direct {v1, p0}, Lteam/dev/epro/apkcustom/dialogs/RequestBlock$のぷのちつ;-><init>(Lteam/dev/epro/apkcustom/dialogs/RequestBlock;)V

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    iget-object v0, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->げがぴうあだ:Landroid/widget/CheckBox;

    new-instance v1, Lteam/dev/epro/apkcustom/dialogs/RequestBlock$へぬ〴づぞ;

    invoke-direct {v1, p0}, Lteam/dev/epro/apkcustom/dialogs/RequestBlock$へぬ〴づぞ;-><init>(Lteam/dev/epro/apkcustom/dialogs/RequestBlock;)V

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    iget-object v0, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->こ〲しでおか:Landroid/widget/CheckBox;

    new-instance v1, Lteam/dev/epro/apkcustom/dialogs/RequestBlock$おぐぴう〸ず;

    invoke-direct {v1, p0}, Lteam/dev/epro/apkcustom/dialogs/RequestBlock$おぐぴう〸ず;-><init>(Lteam/dev/epro/apkcustom/dialogs/RequestBlock;)V

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    iget-object v0, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->ながふずは:Landroid/widget/CheckBox;

    new-instance v1, Lteam/dev/epro/apkcustom/dialogs/RequestBlock$げつ〴ぬぐ;

    invoke-direct {v1, p0}, Lteam/dev/epro/apkcustom/dialogs/RequestBlock$げつ〴ぬぐ;-><init>(Lteam/dev/epro/apkcustom/dialogs/RequestBlock;)V

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    iget-object v0, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->ばおぢでぎか:Landroid/widget/CheckBox;

    new-instance v1, Lteam/dev/epro/apkcustom/dialogs/RequestBlock$〺つふすそ;

    invoke-direct {v1, p0}, Lteam/dev/epro/apkcustom/dialogs/RequestBlock$〺つふすそ;-><init>(Lteam/dev/epro/apkcustom/dialogs/RequestBlock;)V

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    return-void
.end method

.method public final 〺でおいここ()V
    .registers 3

    iget-object v0, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->はつきどっ:Landroid/widget/TextView;

    const-string v1, "I`gH1iNclI6j\u001efoK1;K`jAjo\u001e6lKj<Ib"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->ぉざぅち〻:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    iget-object v0, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->ざとぅぼこ〺:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    iget-object v0, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->は〲ぱなで:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    iget-object v0, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->ごづごきえ:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    iget-object v0, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->ざっざへづ:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    return-void
.end method

.method public final ぇとしたべど(Ljava/lang/String;)V
    .registers 16

    const-string v0, "O1gMgiN`l\u001a6m\u001bagAeh\u001djl\u001ed;\u0019e>\u001ekkLe"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "Id>Agh\u001eb:\u001dk9Mf:Jgi@c9\u001bflI7kJdl\u0019f"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "O1;\u001dam\u001dagIj=I7=\u001ee>LgoOd=\u001bj<Oj9\u001bf"

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->isEmpty()Z

    move-result v3

    const/4 v4, 0x0

    const/4 v5, 0x2

    const/4 v6, 0x1

    const-string v7, "\u001dki\u001ecmK1;H`;KalOkhN7h\u001cc:K1kJ7:J4"

    invoke-static {v7}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const-string v8, "M`i\u001b7nNkmN0kOemM3>O0hHjk\u001d4l@4iOf"

    invoke-static {v8}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    const-string v9, "Mj=H0gN3;N7oH0:\u001c79\u001c19\u001cfi\u001e19\u001a39Ae"

    invoke-static {v9}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    const-string v10, ""

    if-eqz v3, :cond_17a

    iget-object p1, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->なぶひせが:Landroid/widget/EditText;

    .line 1
    sget-object v0, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    .line 2
    new-instance v1, Ljava/lang/String;

    .line 3
    sget-object v2, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 4
    check-cast v2, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    const/4 v3, 0x5

    invoke-virtual {v2, v3, v6}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->な〱ちぉじ(II)[B

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/String;-><init>([B)V

    invoke-interface {v0, v1, v10}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6d

    move-object v0, v10

    goto :goto_80

    .line 5
    :cond_6d
    sget-object v0, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    .line 6
    new-instance v1, Ljava/lang/String;

    .line 7
    sget-object v2, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 8
    check-cast v2, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {v2, v3, v6}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->な〱ちぉじ(II)[B

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/String;-><init>([B)V

    invoke-interface {v0, v1, v10}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_80
    invoke-virtual {p1, v0}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    iget-object p1, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->どぇぞほだ:Landroid/widget/EditText;

    .line 9
    sget-object v0, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    .line 10
    new-instance v1, Ljava/lang/String;

    .line 11
    sget-object v2, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 12
    check-cast v2, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {v2, v3, v5}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->な〱ちぉじ(II)[B

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/String;-><init>([B)V

    invoke-interface {v0, v1, v10}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    iget-object p1, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->せづっ〸ちね:Landroid/widget/EditText;

    .line 13
    sget-object v0, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    const-string v1, "\u001d6o\u001cgmJ6h\u001ce>\u001eb>\u0019jlAc:\u001b`mN1=J4h\u001cb"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 14
    invoke-interface {v0, v1, v10}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    iget-object p1, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->ぷぞてのほき:Landroid/widget/EditText;

    .line 15
    sget-object v0, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    .line 16
    invoke-interface {v0, v8, v9}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_c4

    move-object v0, v10

    goto :goto_ca

    .line 17
    :cond_c4
    sget-object v0, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    .line 18
    invoke-interface {v0, v8, v9}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_ca
    invoke-virtual {p1, v0}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 19
    sget-object p1, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    const-string v0, "IbmKj9\u001ce;LaoHc=@gh@egOd;HkiIk<H7"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 20
    invoke-interface {p1, v0, v4}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result p1

    if-eqz p1, :cond_174

    .line 21
    sget-object p1, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    const-string v1, "I7oO0;JgiKk<Hc:\u001djlLdnN1f\u001bcfLc<Ia"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 22
    invoke-interface {p1, v1, v10}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 23
    sget-object v1, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    const-string v2, "K3o\u001a7=Lfh@gmA1>Od<AbkLkjLbf@jmMk"

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 24
    invoke-interface {v1, v2, v10}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 25
    sget-object v2, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    const-string v3, "\u001dbgLd;Jbm\u001ef:IjfM6kOgm\u001ajgMkg\u001e`<\u0019a"

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 26
    invoke-interface {v2, v3, v10}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 27
    sget-object v3, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    const-string v5, "K6i@6=@gj@0>Ac9H7i\u001c19Ha;Mfg\u001bdfO0"

    invoke-static {v5}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 28
    invoke-interface {v3, v5, v10}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v5, "J3<\u001bahAjjHejJ7oK4i\u001b3hN7mAeg@4jK`"

    invoke-static {v5}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_165

    const-string v5, "\u001bd;J7g\u001a7mMgnL0lO69@jo\u00194iN6kK7n\u001aa"

    invoke-static {v5}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_150

    iget-object p1, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->なぶひせが:Landroid/widget/EditText;

    invoke-static {v1}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v5, "I1l\u001d6lHe:\u001d4f@4i\u001bd:Idf\u001bjo\u001bam\u0019f;O6"

    invoke-static {v5}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    goto :goto_160

    :cond_150
    iget-object p1, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->なぶひせが:Landroid/widget/EditText;

    invoke-static {v1}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v5, "I`i@emKj>Mdj\u001e4hOe9Hb>I3kJjnA7o\u001ea"

    invoke-static {v5}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    :goto_160
    invoke-static {v1, v5, v2}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->なぎぱいぢぎ(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    goto :goto_167

    :cond_165
    iget-object p1, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->なぶひせが:Landroid/widget/EditText;

    :goto_167
    invoke-virtual {p1, v1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    iget-object p1, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->どぇぞほだ:Landroid/widget/EditText;

    invoke-virtual {p1, v3}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 29
    sget-object p1, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    .line 30
    invoke-static {p1, v0, v4}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぇぬぎばつ(Landroid/content/SharedPreferences;Ljava/lang/String;Z)V

    :cond_174
    new-instance p1, Ljava/lang/Exception;

    invoke-direct {p1, v10}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_17a
    new-instance v3, Ljava/io/File;

    invoke-direct {v3, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 31
    sget-object v6, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 32
    check-cast v6, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {v6, v3}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->びがえ〱な(Ljava/io/File;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->isEmpty()Z

    move-result v6

    if-nez v6, :cond_50b

    const-string v6, "\\[splitConfig\\]"

    invoke-virtual {v3, v6}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v3

    const/4 v6, 0x3

    aget-object v6, v3, v6

    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v6

    if-eqz v6, :cond_1b1

    .line 33
    sget-object v6, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 34
    check-cast v6, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {v6}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->いたぷすいだ()Z

    move-result v6

    if-nez v6, :cond_1ab

    goto :goto_1b1

    :cond_1ab
    new-instance p1, Ljava/lang/Exception;

    invoke-direct {p1, v10}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1b1
    :goto_1b1
    const/4 v6, 0x4

    aget-object v6, v3, v6

    const-string v11, "Ae:MdhKa>\u001cbg\u001cd:Ogf\u00190kAkjKbm\u0019ajHa"

    invoke-static {v11}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    invoke-static {v11}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v6, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_215

    :try_start_1c4
    sget v6, Landroid/os/Build$VERSION;->SDK_INT:I
    :try_end_1c6
    .catch Landroid/provider/Settings$SettingNotFoundException; {:try_start_1c4 .. :try_end_1c6} :catch_214

    const/16 v11, 0x11

    const-string v12, "O`;Lfl\u001a3;\u0019gfL0<\u001b39L4fNflM0oOdk\u001cd"

    invoke-static {v12}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    invoke-static {v12}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    const-string v13, "\u001edfAk:\u001dj:M19A4nN1;Oeg\u001dgfAk>\u001e1lLg"

    invoke-static {v13}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    invoke-static {v13}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    if-lt v6, v11, :cond_1f9

    :try_start_1de
    invoke-virtual {p0}, Landroid/app/Activity;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v6

    invoke-static {v6, v13}, Landroid/provider/Settings$Global;->getInt(Landroid/content/ContentResolver;Ljava/lang/String;)I

    move-result v6

    if-eqz v6, :cond_1f3

    invoke-virtual {p0}, Landroid/app/Activity;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v6

    invoke-static {v6, v12}, Landroid/provider/Settings$Global;->getInt(Landroid/content/ContentResolver;Ljava/lang/String;)I

    move-result v6

    if-eqz v6, :cond_1f3

    goto :goto_215

    :cond_1f3
    new-instance v6, Ljava/lang/Exception;

    invoke-direct {v6, v10}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v6

    :cond_1f9
    invoke-virtual {p0}, Landroid/app/Activity;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v6

    invoke-static {v6, v13}, Landroid/provider/Settings$System;->getInt(Landroid/content/ContentResolver;Ljava/lang/String;)I

    move-result v6

    if-eqz v6, :cond_20e

    invoke-virtual {p0}, Landroid/app/Activity;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v6

    invoke-static {v6, v12}, Landroid/provider/Settings$System;->getInt(Landroid/content/ContentResolver;Ljava/lang/String;)I

    move-result v6

    if-eqz v6, :cond_20e

    goto :goto_215

    :cond_20e
    new-instance v6, Ljava/lang/Exception;

    invoke-direct {v6, v10}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v6
    :try_end_214
    .catch Landroid/provider/Settings$SettingNotFoundException; {:try_start_1de .. :try_end_214} :catch_214

    :catch_214
    nop

    :cond_215
    :goto_215
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result p1

    const/16 v6, 0xf

    if-nez p1, :cond_29a

    aget-object p1, v3, v5

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-nez p1, :cond_29a

    aget-object p1, v3, v6

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-nez p1, :cond_29a

    .line 35
    sget-object p1, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    const-string v11, "H7nOghObiKb>\u0019cgHd=\u0019k:J`iH0m\u001d`fA1"

    invoke-static {v11}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    invoke-static {v11}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    .line 36
    invoke-interface {p1, v11, v10}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result p1

    const-string v12, "\u001bj;\u0019dhH`>A4hO`j\u001a3f@7kOen\u001c0>L1>\u001ce"

    invoke-static {v12}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    invoke-static {v12}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    if-nez p1, :cond_266

    .line 37
    sget-object p1, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    .line 38
    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    .line 39
    sget-object v13, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    .line 40
    invoke-interface {v13, v11, v10}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    invoke-interface {p1, v12, v11}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    goto :goto_297

    .line 41
    :cond_266
    sget-object p1, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 42
    check-cast p1, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {p1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->かちして〹づ()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {p1, v11}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->く〱なおぎ(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p1

    const/4 v11, 0x7

    aget-object p1, p1, v11

    const-string v11, "^\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}.*?"

    invoke-virtual {p1, v11}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v11

    if-nez v11, :cond_28d

    const-string v11, "\u001e7=K0o\u0019ffI3lA6l\u001dah\u001e0fJjj\u001ddh\u001af=\u001cc"

    invoke-static {v11}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    invoke-static {v11}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {p1, v11}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v11

    if-eqz v11, :cond_29a

    .line 43
    :cond_28d
    sget-object v11, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    .line 44
    invoke-interface {v11}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v11

    invoke-interface {v11, v12, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    :goto_297
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->commit()Z

    :cond_29a
    const/16 p1, 0xc

    const/16 v11, 0x9

    const/16 v12, 0xe

    const/16 v13, 0x8

    :try_start_2a2
    aget-object v5, v3, v5

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    if-nez v5, :cond_304

    aget-object v5, v3, v6

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    if-nez v5, :cond_304

    iget-object v5, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->なぶひせが:Landroid/widget/EditText;

    aget-object v6, v3, v4

    invoke-virtual {v6}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2ca

    move-object v4, v10

    goto :goto_2cc

    :cond_2ca
    aget-object v4, v3, v4

    :goto_2cc
    invoke-virtual {v5, v4}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    iget-object v4, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->どぇぞほだ:Landroid/widget/EditText;

    const/4 v5, 0x1

    aget-object v5, v3, v5

    invoke-virtual {v4, v5}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V
    :try_end_2d7
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_2a2 .. :try_end_2d7} :catch_3d8

    :try_start_2d7
    iget-object v0, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->せづっ〸ちね:Landroid/widget/EditText;

    aget-object p1, v3, p1

    invoke-virtual {v0, p1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V
    :try_end_2de
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_2d7 .. :try_end_2de} :catch_2de

    :catch_2de
    :try_start_2de
    iget-object p1, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->ぷぞてのほき:Landroid/widget/EditText;

    aget-object v0, v3, v12

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2ed

    goto :goto_2ef

    :cond_2ed
    aget-object v10, v3, v12

    :goto_2ef
    invoke-virtual {p1, v10}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 45
    sget-object p1, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    .line 46
    invoke-interface {p1, v8, v9}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1
    :try_end_300
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_2de .. :try_end_300} :catch_4fb

    if-nez p1, :cond_4fb

    goto/16 :goto_42f

    :cond_304
    :try_start_304
    aget-object v4, v3, v11

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    if-nez v4, :cond_31b

    iget-object v4, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->〻ぞまぎな〻:Lcom/google/android/material/textfield/TextInputLayout;

    invoke-virtual {v4, v13}, Landroid/widget/LinearLayout;->setVisibility(I)V

    :goto_315
    iget-object v4, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->ぉひのべい:Landroid/widget/EditText;

    invoke-virtual {v4, v13}, Landroid/widget/EditText;->setVisibility(I)V

    goto :goto_359

    :cond_31b
    iget-object v4, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->がぐくいおす:Ljava/lang/String;

    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_353

    iget-object v4, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->〻ぞまぎな〻:Lcom/google/android/material/textfield/TextInputLayout;

    const/4 v5, 0x0

    invoke-virtual {v4, v5}, Landroid/widget/LinearLayout;->setVisibility(I)V

    iget-object v4, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->ぉひのべい:Landroid/widget/EditText;

    invoke-virtual {v4, v5}, Landroid/widget/EditText;->setVisibility(I)V

    iget-object v4, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->ぉひのべい:Landroid/widget/EditText;

    .line 47
    sget-object v5, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 48
    check-cast v5, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {v5}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->ごまぉてう()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_342

    const/4 v5, 0x1

    aget-object v5, v3, v5

    goto :goto_34a

    .line 49
    :cond_342
    sget-object v5, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 50
    check-cast v5, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {v5}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->ごまぉてう()Ljava/lang/String;

    move-result-object v5

    :goto_34a
    invoke-virtual {v4, v5}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    iget-object v4, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->くぎぶ〼のそ:Landroid/widget/Button;

    invoke-virtual {v4, v0}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    goto :goto_378

    :cond_353
    iget-object v4, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->〻ぞまぎな〻:Lcom/google/android/material/textfield/TextInputLayout;

    invoke-virtual {v4, v13}, Landroid/widget/LinearLayout;->setVisibility(I)V

    goto :goto_315

    :goto_359
    iget-object v4, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->ぉひのべい:Landroid/widget/EditText;

    invoke-virtual {v4, v10}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    iget-object v4, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->くぎぶ〼のそ:Landroid/widget/Button;

    invoke-virtual {v4, v2}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V
    :try_end_363
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_304 .. :try_end_363} :catch_364

    goto :goto_378

    :catch_364
    :try_start_364
    iget-object v4, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->〻ぞまぎな〻:Lcom/google/android/material/textfield/TextInputLayout;

    invoke-virtual {v4, v13}, Landroid/widget/LinearLayout;->setVisibility(I)V

    iget-object v4, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->ぉひのべい:Landroid/widget/EditText;

    invoke-virtual {v4, v13}, Landroid/widget/EditText;->setVisibility(I)V

    iget-object v4, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->ぉひのべい:Landroid/widget/EditText;

    invoke-virtual {v4, v10}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    iget-object v4, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->くぎぶ〼のそ:Landroid/widget/Button;

    invoke-virtual {v4, v2}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    :goto_378
    iget-object v4, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->がぐくいおす:Ljava/lang/String;

    invoke-virtual {v4, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3d3

    const/4 v4, 0x2

    aget-object v4, v3, v4

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4
    :try_end_38b
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_364 .. :try_end_38b} :catch_3d8

    if-nez v4, :cond_3d3

    :try_start_38d
    iget-object v4, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->ぷぞてのほき:Landroid/widget/EditText;

    aget-object v5, v3, v12

    invoke-virtual {v5}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_39d

    move-object v5, v10

    goto :goto_39f

    :cond_39d
    aget-object v5, v3, v12

    :goto_39f
    invoke-virtual {v4, v5}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 51
    sget-object v4, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    .line 52
    invoke-interface {v4, v8, v9}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_3bd

    iget-object v4, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->ぷぞてのほき:Landroid/widget/EditText;

    .line 53
    sget-object v5, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    .line 54
    invoke-interface {v5, v8, v9}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V
    :try_end_3bd
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_38d .. :try_end_3bd} :catch_3bd

    :catch_3bd
    :cond_3bd
    :try_start_3bd
    invoke-virtual {p0}, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->けときぜと()V
    :try_end_3c0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_3bd .. :try_end_3c0} :catch_3d8

    const/16 p1, 0x13

    :try_start_3c2
    aget-object p1, v3, p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_4fb

    invoke-virtual {p0}, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->おかぷせ〱()V
    :try_end_3d1
    .catch Ljava/lang/Exception; {:try_start_3c2 .. :try_end_3d1} :catch_4fb

    goto/16 :goto_4fb

    :cond_3d3
    :try_start_3d3
    invoke-virtual {p0}, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->おかぷせ〱()V
    :try_end_3d6
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_3d3 .. :try_end_3d6} :catch_3d8

    goto/16 :goto_4fb

    :catch_3d8
    nop

    const/4 v4, 0x2

    aget-object v4, v3, v4

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    if-nez v4, :cond_43c

    iget-object v0, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->なぶひせが:Landroid/widget/EditText;

    const/4 v1, 0x0

    aget-object v2, v3, v1

    invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3f7

    move-object v1, v10

    goto :goto_3f9

    :cond_3f7
    aget-object v1, v3, v1

    :goto_3f9
    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->どぇぞほだ:Landroid/widget/EditText;

    const/4 v1, 0x1

    aget-object v1, v3, v1

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    :try_start_404
    iget-object v0, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->せづっ〸ちね:Landroid/widget/EditText;

    aget-object p1, v3, p1

    invoke-virtual {v0, p1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V
    :try_end_40b
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_404 .. :try_end_40b} :catch_40b

    :catch_40b
    :try_start_40b
    iget-object p1, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->ぷぞてのほき:Landroid/widget/EditText;

    aget-object v0, v3, v12

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_41a

    goto :goto_41c

    :cond_41a
    aget-object v10, v3, v12

    :goto_41c
    invoke-virtual {p1, v10}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 55
    sget-object p1, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    .line 56
    invoke-interface {p1, v8, v9}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4fb

    :goto_42f
    iget-object p1, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->ぷぞてのほき:Landroid/widget/EditText;

    .line 57
    sget-object v0, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    .line 58
    invoke-interface {v0, v8, v9}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V
    :try_end_43a
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_40b .. :try_end_43a} :catch_4fb

    goto/16 :goto_4fb

    :cond_43c
    :try_start_43c
    aget-object p1, v3, v11

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-nez p1, :cond_453

    iget-object p1, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->〻ぞまぎな〻:Lcom/google/android/material/textfield/TextInputLayout;

    invoke-virtual {p1, v13}, Landroid/widget/LinearLayout;->setVisibility(I)V

    :goto_44d
    iget-object p1, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->ぉひのべい:Landroid/widget/EditText;

    invoke-virtual {p1, v13}, Landroid/widget/EditText;->setVisibility(I)V

    goto :goto_491

    :cond_453
    iget-object p1, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->がぐくいおす:Ljava/lang/String;

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_48b

    iget-object p1, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->〻ぞまぎな〻:Lcom/google/android/material/textfield/TextInputLayout;

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    iget-object p1, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->ぉひのべい:Landroid/widget/EditText;

    invoke-virtual {p1, v1}, Landroid/widget/EditText;->setVisibility(I)V

    iget-object p1, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->ぉひのべい:Landroid/widget/EditText;

    .line 59
    sget-object v1, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 60
    check-cast v1, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {v1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->ごまぉてう()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_47a

    const/4 v1, 0x1

    aget-object v1, v3, v1

    goto :goto_482

    .line 61
    :cond_47a
    sget-object v1, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 62
    check-cast v1, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {v1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->ごまぉてう()Ljava/lang/String;

    move-result-object v1

    :goto_482
    invoke-virtual {p1, v1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    iget-object p1, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->くぎぶ〼のそ:Landroid/widget/Button;

    invoke-virtual {p1, v0}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    goto :goto_4b0

    :cond_48b
    iget-object p1, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->〻ぞまぎな〻:Lcom/google/android/material/textfield/TextInputLayout;

    invoke-virtual {p1, v13}, Landroid/widget/LinearLayout;->setVisibility(I)V

    goto :goto_44d

    :goto_491
    iget-object p1, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->ぉひのべい:Landroid/widget/EditText;

    invoke-virtual {p1, v10}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    iget-object p1, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->くぎぶ〼のそ:Landroid/widget/Button;

    invoke-virtual {p1, v2}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V
    :try_end_49b
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_43c .. :try_end_49b} :catch_49c

    goto :goto_4b0

    :catch_49c
    iget-object p1, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->〻ぞまぎな〻:Lcom/google/android/material/textfield/TextInputLayout;

    invoke-virtual {p1, v13}, Landroid/widget/LinearLayout;->setVisibility(I)V

    iget-object p1, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->ぉひのべい:Landroid/widget/EditText;

    invoke-virtual {p1, v13}, Landroid/widget/EditText;->setVisibility(I)V

    iget-object p1, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->ぉひのべい:Landroid/widget/EditText;

    invoke-virtual {p1, v10}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    iget-object p1, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->くぎぶ〼のそ:Landroid/widget/Button;

    invoke-virtual {p1, v2}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    :goto_4b0
    iget-object p1, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->がぐくいおす:Ljava/lang/String;

    invoke-virtual {p1, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4f8

    const/4 p1, 0x2

    aget-object p1, v3, p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-nez p1, :cond_4f8

    :try_start_4c5
    iget-object p1, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->ぷぞてのほき:Landroid/widget/EditText;

    aget-object v0, v3, v12

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4d4

    goto :goto_4d6

    :cond_4d4
    aget-object v10, v3, v12

    :goto_4d6
    invoke-virtual {p1, v10}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 63
    sget-object p1, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    .line 64
    invoke-interface {p1, v8, v9}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4f4

    iget-object p1, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->ぷぞてのほき:Landroid/widget/EditText;

    .line 65
    sget-object v0, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    .line 66
    invoke-interface {v0, v8, v9}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V
    :try_end_4f4
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_4c5 .. :try_end_4f4} :catch_4f4

    :catch_4f4
    :cond_4f4
    invoke-virtual {p0}, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->けときぜと()V

    goto :goto_4fb

    :cond_4f8
    invoke-virtual {p0}, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->おかぷせ〱()V

    :catch_4fb
    :cond_4fb
    :goto_4fb
    iget-object p1, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->〴ねぷぐくぼ:Landroid/widget/TextView;

    const-string v0, "\u001dc<Jj<K6mJ69\u001b1lL3>Ne;\u001e0f\u001d0gLf=\u001ae:\u001eahKdi\u001b1;IkmIg>A69\u00197n\u00191nI0gKj=O"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void

    :cond_50b
    new-instance p1, Ljava/lang/Exception;

    invoke-direct {p1, v10}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    goto :goto_512

    :goto_511
    throw p1

    :goto_512
    goto :goto_511
.end method

.method public final おかぷせ〱()V
    .registers 4

    const/4 v0, 0x1

    iput-boolean v0, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->ぁないぼぎへ:Z

    iget-object v0, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->はつきどっ:Landroid/widget/TextView;

    const-string v1, "\u001c3lAj<L4o\u001de9\u0019e;La=\u001d7hK39HkoM`:\u001e0"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->ぉざぅち〻:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    iget-object v0, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->ざとぅぼこ〺:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    iget-object v0, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->は〲ぱなで:Landroid/widget/LinearLayout;

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->setVisibility(I)V

    iget-object v0, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->ごづごきえ:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    iget-object v0, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->ざっざへづ:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    return-void
.end method

.method public final けときぜと()V
    .registers 3

    iget-object v0, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->はつきどっ:Landroid/widget/TextView;

    const-string v1, "H0:Lej\u0019e=\u001agf\u001ddiI0<Nkh@bnAd:KffId"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->ぉざぅち〻:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    iget-object v0, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->ざとぅぼこ〺:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    iget-object v0, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->は〲ぱなで:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    iget-object v0, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->ごづごきえ:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    iget-object v0, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->ざっざへづ:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    return-void
.end method

.method public final げがぴうあだ(Ljava/lang/String;I)V
    .registers 4

    .line 1
    sget-object v0, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 2
    check-cast v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {v0, p1, p2}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->びぐびあび(Ljava/lang/String;I)V

    return-void
.end method

.method public final ぷぞてのほき()V
    .registers 6

    .line 1
    sget-object v0, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    .line 2
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    new-instance v1, Ljava/lang/String;

    .line 3
    sget-object v2, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    const/4 v3, 0x1

    .line 4
    check-cast v2, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    const/4 v4, 0x5

    invoke-virtual {v2, v4, v3}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->な〱ちぉじ(II)[B

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/String;-><init>([B)V

    iget-object v2, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->のびぶけせ:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    iget-boolean v0, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->ぁないぼぎへ:Z

    if-nez v0, :cond_3f

    .line 5
    sget-object v0, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    .line 6
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    new-instance v1, Ljava/lang/String;

    .line 7
    sget-object v2, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    const/4 v3, 0x2

    .line 8
    check-cast v2, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {v2, v4, v3}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->な〱ちぉじ(II)[B

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/String;-><init>([B)V

    iget-object v2, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->ぇいうげ〱〹:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 9
    :cond_3f
    sget-object v0, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    .line 10
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    iget-object v1, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->しぷげへが:Ljava/lang/String;

    const-string v2, "\u001d6o\u001cgmJ6h\u001ce>\u001eb>\u0019jlAc:\u001b`mN1=J4h\u001cb"

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v2, v1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    return-void
.end method
