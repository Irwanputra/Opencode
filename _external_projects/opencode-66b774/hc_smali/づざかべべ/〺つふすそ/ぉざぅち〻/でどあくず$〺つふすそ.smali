.class public Lづざかべべ/〺つふすそ/ぉざぅち〻/でどあくず$〺つふすそ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lづざかべべ/〺つふすそ/ぉざぅち〻/でどあくず$びぐびあび;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lづざかべべ/〺つふすそ/ぉざぅち〻/でどあくず;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u303a\u3064\u3075\u3059\u305d"
.end annotation


# direct methods
.method public constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public げつ〴ぬぐ(Landroid/content/Context;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;
    .registers 8

    const/4 v0, 0x0

    :try_start_1
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    .line 1
    new-instance v2, Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ;

    .line 2
    invoke-direct {v2, p1, v0, v0}, Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ;-><init>(Landroid/content/Context;Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ$〺つふすそ;Landroid/content/res/Resources;)V

    .line 3
    invoke-virtual {v2, v1, p2, p3, p4}, Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ;->inflate(Landroid/content/res/Resources;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;)V
    :try_end_d
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_d} :catch_e

    return-object v2

    :catch_e
    return-object v0
.end method
