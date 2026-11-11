.class public Lづざかべべ/〺つふすそ/ぉざぅち〻/のぷのちつ$げつ〴ぬぐ;
.super Lづざかべべ/〺つふすそ/ぉざぅち〻/のぷのちつ$くし〴〺ぅ;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lづざかべべ/〺つふすそ/ぉざぅち〻/のぷのちつ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u3052\u3064\u3034\u306c\u3050"
.end annotation


# direct methods
.method public constructor <init>()V
    .registers 1

    invoke-direct {p0}, Lづざかべべ/〺つふすそ/ぉざぅち〻/のぷのちつ$くし〴〺ぅ;-><init>()V

    return-void
.end method


# virtual methods
.method public げつ〴ぬぐ(Landroid/text/StaticLayout$Builder;Landroid/widget/TextView;)V
    .registers 5

    sget-object v0, Landroid/text/TextDirectionHeuristics;->FIRSTSTRONG_LTR:Landroid/text/TextDirectionHeuristic;

    const-string v1, "getTextDirectionHeuristic"

    invoke-static {p2, v1, v0}, Lづざかべべ/〺つふすそ/ぉざぅち〻/のぷのちつ;->なぎぱいぢぎ(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/text/TextDirectionHeuristic;

    invoke-virtual {p1, p2}, Landroid/text/StaticLayout$Builder;->setTextDirection(Landroid/text/TextDirectionHeuristic;)Landroid/text/StaticLayout$Builder;

    return-void
.end method
