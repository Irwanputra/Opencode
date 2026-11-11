.class public Lづざかべべ/〺つふすそ/ぉざぅち〻/のぷのちつ$〺つふすそ;
.super Lづざかべべ/〺つふすそ/ぉざぅち〻/のぷのちつ$げつ〴ぬぐ;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lづざかべべ/〺つふすそ/ぉざぅち〻/のぷのちつ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u303a\u3064\u3075\u3059\u305d"
.end annotation


# direct methods
.method public constructor <init>()V
    .registers 1

    invoke-direct {p0}, Lづざかべべ/〺つふすそ/ぉざぅち〻/のぷのちつ$げつ〴ぬぐ;-><init>()V

    return-void
.end method


# virtual methods
.method public 〺つふすそ(Landroid/widget/TextView;)Z
    .registers 2

    invoke-virtual {p1}, Landroid/widget/TextView;->isHorizontallyScrollable()Z

    move-result p1

    return p1
.end method

.method public げつ〴ぬぐ(Landroid/text/StaticLayout$Builder;Landroid/widget/TextView;)V
    .registers 3

    invoke-virtual {p2}, Landroid/widget/TextView;->getTextDirectionHeuristic()Landroid/text/TextDirectionHeuristic;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/text/StaticLayout$Builder;->setTextDirection(Landroid/text/TextDirectionHeuristic;)Landroid/text/StaticLayout$Builder;

    return-void
.end method
