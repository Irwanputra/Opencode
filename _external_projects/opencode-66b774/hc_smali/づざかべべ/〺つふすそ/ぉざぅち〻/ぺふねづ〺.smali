.class public final Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺふねづ〺;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public 〺つふすそ:Landroid/view/textclassifier/TextClassifier;

.field public げつ〴ぬぐ:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Landroid/widget/TextView;)V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1
    iput-object p1, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺふねづ〺;->げつ〴ぬぐ:Landroid/widget/TextView;

    return-void
.end method


# virtual methods
.method public げつ〴ぬぐ()Landroid/view/textclassifier/TextClassifier;
    .registers 3

    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺふねづ〺;->〺つふすそ:Landroid/view/textclassifier/TextClassifier;

    if-nez v0, :cond_1b

    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺふねづ〺;->げつ〴ぬぐ:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getContext()Landroid/content/Context;

    move-result-object v0

    const-class v1, Landroid/view/textclassifier/TextClassificationManager;

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/textclassifier/TextClassificationManager;

    if-eqz v0, :cond_19

    invoke-virtual {v0}, Landroid/view/textclassifier/TextClassificationManager;->getTextClassifier()Landroid/view/textclassifier/TextClassifier;

    move-result-object v0

    return-object v0

    :cond_19
    sget-object v0, Landroid/view/textclassifier/TextClassifier;->NO_OP:Landroid/view/textclassifier/TextClassifier;

    :cond_1b
    return-object v0
.end method
