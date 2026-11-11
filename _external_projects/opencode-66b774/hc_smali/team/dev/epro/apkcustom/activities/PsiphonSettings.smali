.class public Lteam/dev/epro/apkcustom/activities/PsiphonSettings;
.super Landroidx/appcompat/app/AppCompatActivity;
.source ""


# instance fields
.field public 〻ぞまぎな〻:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public ぉ〲なぱぽた:Landroid/view/View$OnClickListener;

.field public ぉざぅち〻:Landroid/widget/Button;

.field public ごづごきえ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/〳ぜぞぜべっ;

.field public ざっざへづ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/〳ぜぞぜべっ;

.field public ざとぅぼこ〺:Landroid/widget/EditText;

.field public でどあくず:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぺぁあねじ/づざかべべ;

.field public は〲ぱなで:Landroid/widget/EditText;

.field public ぶでにく〼〳:Landroid/widget/ArrayAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/widget/ArrayAdapter<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .registers 2

    invoke-direct {p0}, Landroidx/appcompat/app/AppCompatActivity;-><init>()V

    new-instance v0, Lteam/dev/epro/apkcustom/activities/PsiphonSettings$〺つふすそ;

    invoke-direct {v0, p0}, Lteam/dev/epro/apkcustom/activities/PsiphonSettings$〺つふすそ;-><init>(Lteam/dev/epro/apkcustom/activities/PsiphonSettings;)V

    iput-object v0, p0, Lteam/dev/epro/apkcustom/activities/PsiphonSettings;->ぉ〲なぱぽた:Landroid/view/View$OnClickListener;

    return-void
.end method


# virtual methods
.method public onCreate(Landroid/os/Bundle;)V
    .registers 5

    invoke-super {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->onCreate(Landroid/os/Bundle;)V

    const p1, 0x7f0c0022

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->setContentView(I)V

    const p1, 0x7f09006a

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/EditText;

    iput-object p1, p0, Lteam/dev/epro/apkcustom/activities/PsiphonSettings;->ざとぅぼこ〺:Landroid/widget/EditText;

    const p1, 0x7f090221

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/EditText;

    iput-object p1, p0, Lteam/dev/epro/apkcustom/activities/PsiphonSettings;->は〲ぱなで:Landroid/widget/EditText;

    new-instance p1, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/〳ぜぞぜべっ;

    const v0, 0x7f0901e9

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-direct {p1, v0}, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/〳ぜぞぜべっ;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lteam/dev/epro/apkcustom/activities/PsiphonSettings;->ざっざへづ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/〳ぜぞぜべっ;

    new-instance p1, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/〳ぜぞぜべっ;

    const v0, 0x7f0901f4

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-direct {p1, v0}, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/〳ぜぞぜべっ;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lteam/dev/epro/apkcustom/activities/PsiphonSettings;->ごづごきえ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/〳ぜぞぜべっ;

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lteam/dev/epro/apkcustom/activities/PsiphonSettings;->〻ぞまぎな〻:Ljava/util/HashMap;

    const-string v0, "L0oIgf\u001e`<\u001ed9K0l\u001a4i\u0019e<\u0019al\u001ad9\u001aa=\u001ae"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {p1, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lteam/dev/epro/apkcustom/activities/PsiphonSettings;->〻ぞまぎな〻:Ljava/util/HashMap;

    const-string v0, "\u001ed=J`mKfoLk<\u001ee;\u001cfm\u001dflA6fIko\u001c1l\u001c`"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lteam/dev/epro/apkcustom/activities/PsiphonSettings;->〻ぞまぎな〻:Ljava/util/HashMap;

    const-string v0, "\u001bkmNa=\u001a3h\u001cdgHbhLc;\u001celN`;L7n\u001b1lNe"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lteam/dev/epro/apkcustom/activities/PsiphonSettings;->〻ぞまぎな〻:Ljava/util/HashMap;

    const-string v0, "Oa=OkmHjnKafN1iAak\u001eg9Ldk\u001db=\u00196gA7"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "\u001cd;\u001c`<K`9AdjK6j\u001a`:\u001dc9\u001e6:\u00196k\u001ad>\u0019bl\u001ca=\u001a1k\u001bkk\u001efo\u001a4=\u001de9\u001d3l\u001bboKfiNa>\u001d"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lteam/dev/epro/apkcustom/activities/PsiphonSettings;->〻ぞまぎな〻:Ljava/util/HashMap;

    const-string v0, "\u001c1k\u001e1i@agAf=H4h\u001ef;Ka>I`fAb<@4iIe:\u001ak;\u001dclJjn\u00191k@km\u001cdm\u001e0;\u0019kgM3<OaiA"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "K1j\u001c49\u001b7<O6j\u001a6jKah@a>MdjJgoK7k\u001e19H4j\u001a7:Kj:K6iJ19@g9I4hO7kMck\u001d3m\u001c"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lteam/dev/epro/apkcustom/activities/PsiphonSettings;->〻ぞまぎな〻:Ljava/util/HashMap;

    const-string v0, "K3;A4;Jdi\u001cci\u001e7kLc:I3j\u001afhNjm\u001ab;A`jK7gNg9J6n\u001aj9\u001e79Kkj\u001be:\u001d7o\u001a6;M1>\u001e"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "\u0019dgHbgA0>\u001b7gI4<M4oLem\u001e3>@0<\u001efk\u001ac=IkgM7>Hd9N6;\u0019e;Hjj\u001cjlM7:\u0019glH`9A19\u001bgoKcmIkfM7gO4<\u001bjmJ`jA3>\u001b6fK7>"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lteam/dev/epro/apkcustom/activities/PsiphonSettings;->〻ぞまぎな〻:Ljava/util/HashMap;

    const-string v0, "\u001eah\u001ddmM19\u001a4iKf9JdhH0j@6iIch@bhN3"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "H3oMch\u001a0=L4l\u001aefLk;\u001b3f@7:I0=LclKcf\u0019g>H7j\u001eaoKdhI6iAa9Nd9Jf>@f9Hc>L"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lteam/dev/epro/apkcustom/activities/PsiphonSettings;->〻ぞまぎな〻:Ljava/util/HashMap;

    const-string v0, "Oai\u001e3mJ0jMgl\u001efh\u001db<\u0019dfIgm@`o@7<\u001dkkJk<NkhJ6nHc9\u001d4m\u001cak\u001a7=I4n\u001cc;\u001e`fM"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "LkoAeiJkh@b=\u001cal@b;@cj\u001edjJ6mI6f\u001d0>Ma>Le=HfhA6m\u001c`nJ6=Kgf\u001ackOclJkkI"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lteam/dev/epro/apkcustom/activities/PsiphonSettings;->〻ぞまぎな〻:Ljava/util/HashMap;

    const-string v0, "\u0019dhIc=\u001d4n@6f\u001dfo\u001ef9KbkA19H6j\u001d4g\u001ek"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "@anOkoLd;@gg\u001bjiNbhJkoK6i\u001bkgAd9A3"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lteam/dev/epro/apkcustom/activities/PsiphonSettings;->〻ぞまぎな〻:Ljava/util/HashMap;

    const-string v0, "\u001af=MkmM3nJc>H0mKk;Mf<\u001ekoN1;Ma;Md"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "KefA0hK6i\u001cal\u001dk:K3<\u001b7kKbo\u001dbg\u001dco\u001ed"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lteam/dev/epro/apkcustom/activities/PsiphonSettings;->〻ぞまぎな〻:Ljava/util/HashMap;

    const-string v0, "Md<I`9N4o\u001d`l\u001c`m\u0019c:M3nM6o\u001a4<\u001d`=\u001ce"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "IkfAflOfm\u001dgmHffJbm@bo\u001b6i\u001b6>\u00197gNg"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance p1, Lteam/dev/epro/apkcustom/activities/PsiphonSettings$げつ〴ぬぐ;

    const v0, 0x1090008

    invoke-direct {p1, p0, p0, v0}, Lteam/dev/epro/apkcustom/activities/PsiphonSettings$げつ〴ぬぐ;-><init>(Lteam/dev/epro/apkcustom/activities/PsiphonSettings;Landroid/content/Context;I)V

    iput-object p1, p0, Lteam/dev/epro/apkcustom/activities/PsiphonSettings;->ぶでにく〼〳:Landroid/widget/ArrayAdapter;

    new-instance p1, Ljava/util/ArrayList;

    iget-object v0, p0, Lteam/dev/epro/apkcustom/activities/PsiphonSettings;->〻ぞまぎな〻:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-static {p1}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_153
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_165

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iget-object v1, p0, Lteam/dev/epro/apkcustom/activities/PsiphonSettings;->ぶでにく〼〳:Landroid/widget/ArrayAdapter;

    invoke-virtual {v1, v0}, Landroid/widget/ArrayAdapter;->add(Ljava/lang/Object;)V

    goto :goto_153

    :cond_165
    iget-object p1, p0, Lteam/dev/epro/apkcustom/activities/PsiphonSettings;->ざっざへづ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/〳ぜぞぜべっ;

    iget-object v0, p0, Lteam/dev/epro/apkcustom/activities/PsiphonSettings;->ぶでにく〼〳:Landroid/widget/ArrayAdapter;

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-interface {v0}, Landroid/widget/SpinnerAdapter;->getCount()I

    move-result v1

    const/4 v2, 0x0

    if-lez v1, :cond_175

    iput v2, p1, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/〳ぜぞぜべっ;->くし〴〺ぅ:I

    :cond_175
    iget-object p1, p1, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/〳ぜぞぜべっ;->〺つふすそ:Landroid/widget/Spinner;

    invoke-virtual {p1, v0}, Landroid/widget/Spinner;->setAdapter(Landroid/widget/SpinnerAdapter;)V

    .line 2
    new-instance p1, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぺぁあねじ/づざかべべ;

    invoke-direct {p1, p0}, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぺぁあねじ/づざかべべ;-><init>(Landroid/content/Context;)V

    iput-object p1, p0, Lteam/dev/epro/apkcustom/activities/PsiphonSettings;->でどあくず:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぺぁあねじ/づざかべべ;

    iget-object v0, p0, Lteam/dev/epro/apkcustom/activities/PsiphonSettings;->ごづごきえ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/〳ぜぞぜべっ;

    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Landroid/widget/ArrayAdapter;->getCount()I

    move-result v1

    if-lez v1, :cond_18e

    iput v2, v0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/〳ぜぞぜべっ;->くし〴〺ぅ:I

    :cond_18e
    iget-object v0, v0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/〳ぜぞぜべっ;->〺つふすそ:Landroid/widget/Spinner;

    invoke-virtual {v0, p1}, Landroid/widget/Spinner;->setAdapter(Landroid/widget/SpinnerAdapter;)V

    const p1, 0x7f090202

    .line 4
    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/Button;

    iput-object p1, p0, Lteam/dev/epro/apkcustom/activities/PsiphonSettings;->ぉざぅち〻:Landroid/widget/Button;

    iget-object v0, p0, Lteam/dev/epro/apkcustom/activities/PsiphonSettings;->ぉ〲なぱぽた:Landroid/view/View$OnClickListener;

    invoke-virtual {p1, v0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public onResume()V
    .registers 6

    invoke-super {p0}, Landroidx/fragment/app/FragmentActivity;->onResume()V

    iget-object v0, p0, Lteam/dev/epro/apkcustom/activities/PsiphonSettings;->ざとぅぼこ〺:Landroid/widget/EditText;

    .line 1
    sget-object v1, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    const-string v2, "H0f\u001ae9Oe:N6:\u001djm\u001cknMaiMjgId;N7k\u001e4"

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, ""

    .line 2
    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lteam/dev/epro/apkcustom/activities/PsiphonSettings;->は〲ぱなで:Landroid/widget/EditText;

    .line 3
    sget-object v1, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    const-string v2, "M0nN3:@3mAeo\u001ed:O0>Idf\u001cg<Hfm\u001dg=H3:Mj>\u001e7gLgnI`l\u001bamA4jH4<N3<Hf<H7iO"

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 4
    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lteam/dev/epro/apkcustom/activities/PsiphonSettings;->ざっざへづ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/〳ぜぞぜべっ;

    .line 5
    sget-object v1, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    const-string v2, "Nc=@bjOcgA6>\u001c`<M4lMfn\u001bd9O7m\u001djjNj"

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v4, "L0oIgf\u001e`<\u001ed9K0l\u001a4i\u0019e<\u0019al\u001ad9\u001aa=\u001ae"

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 6
    invoke-interface {v1, v2, v4}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/〳ぜぞぜべっ;->〺つふすそ(Ljava/lang/String;)V

    iget-object v0, p0, Lteam/dev/epro/apkcustom/activities/PsiphonSettings;->ごづごきえ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/〳ぜぞぜべっ;

    .line 7
    sget-object v1, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    const-string v2, "\u001dfg\u001be=Kfo\u001d3i\u001cc=ObjO1mL6<\u001bcnN3i\u001ak"

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 8
    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/〳ぜぞぜべっ;->〺つふすそ(Ljava/lang/String;)V

    return-void
.end method
